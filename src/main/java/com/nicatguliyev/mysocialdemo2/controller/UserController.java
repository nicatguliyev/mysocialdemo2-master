package com.nicatguliyev.mysocialdemo2.controller;

import com.nicatguliyev.mysocialdemo2.model.User;
import com.nicatguliyev.mysocialdemo2.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    private  final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        return  ResponseEntity.ok().body(userService.getUsers());
    }

    @GetMapping("/test")
    public String getUser(){
        return "Nicat Guliyev";
    }

    @PostMapping("/user/save")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return  ResponseEntity.ok().body(userService.saveUser(user));
    }

}
