package com.itry.service;

import com.itry.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void save(User user);

    Boolean login(User user);

}
