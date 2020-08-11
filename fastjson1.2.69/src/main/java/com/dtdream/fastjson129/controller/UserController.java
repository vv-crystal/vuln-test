package com.dtdream.fastjson129.controller;

import com.dtdream.fastjson129.entity.User;
import com.dtdream.fastjson129.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> lists() {
        return userService.getUsers();
    }

}
