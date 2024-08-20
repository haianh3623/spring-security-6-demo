package com.project.spring_security_6.controller;

import com.project.spring_security_6.model.User;
import com.project.spring_security_6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userService.register(user);
    }

    @PostMapping("/add")
    public User add(){
        return userService.add();
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        return userService.login(user);
    }
}
