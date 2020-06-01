package com.itry.dao;

import com.itry.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
    //查询所有用户
    @Select("select * from login")
    List<User> findAll();
    //保存信息
    @Insert("insert into login(username,password) values(#{username},#{password})")
    void save(User user);
    //根据用户注册
    @Select("select *from login where username=#{username} and password=#{password}")
    User  login(User user);
}
