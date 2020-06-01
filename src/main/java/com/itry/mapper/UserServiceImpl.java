package com.itry.mapper;

import com.itry.dao.UserDao;
import com.itry.domain.User;
import com.itry.service.UserService;
import org.apache.tomcat.util.net.jsse.JSSEUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAll()
    {
        System.out.println("查询所有");
        return userDao.findAll();
    }

    @Override
    public void save(User user)
    {
        System.out.println("保存");
        userDao.save(user);
    }

    @Override
    public Boolean login(User user) {
        System.out.println("用户登录");
        if (userDao.login(user) == null) {
            System.out.println("False");
            return false;
        } else {
            System.out.println("true");
            return true;
        }
    }
}
