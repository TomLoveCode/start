package com.itry.controller;

import com.itry.domain.User;
import com.itry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("视图层，查询所有");
        List<User> all = userService.findAll();
        model.addAttribute("list", all);
        System.out.println(all);
        return "index";
    }

    @RequestMapping("/save")
    public String Save(User user) {
        System.out.println("视图层，保存");
        userService.save(user);
        return "success";
    }

    @RequestMapping("/login")
    public String login(User user) {
        System.out.println("视图层，登录");
        if (userService.login(user))
            return "successLogin";
        else
            return "errorLogin";
    }


}
