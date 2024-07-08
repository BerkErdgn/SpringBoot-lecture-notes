package com.berkerdgn.lesson10.controller;

import com.berkerdgn.lesson10.dto.User;
import com.berkerdgn.lesson10.sevice.UserService;
import com.berkerdgn.lesson10.sevice.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable("userId") Long userId){
        return  userService.getUserById(userId);
    }


}
