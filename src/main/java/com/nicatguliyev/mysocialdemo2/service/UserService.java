package com.nicatguliyev.mysocialdemo2.service;

import com.nicatguliyev.mysocialdemo2.model.Role;
import com.nicatguliyev.mysocialdemo2.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
