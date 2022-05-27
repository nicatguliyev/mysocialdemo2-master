package com.nicatguliyev.mysocialdemo2.service;

import com.nicatguliyev.mysocialdemo2.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    User getUser(String email);
    List<User> getUsers();
}
