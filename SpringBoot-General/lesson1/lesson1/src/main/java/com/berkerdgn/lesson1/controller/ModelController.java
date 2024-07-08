package com.berkerdgn.lesson1.controller;


import com.berkerdgn.lesson1.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ModelController {


    /*
    http://localhost:8080/api/users
    {
    "name":"Berk",
    "surname":"Erdoğam",
    "userName":"berkerdgn",
    "password":"123456789"
}
     */

    //Burada user bana User şeklinde bir json yollayacağını söylüyoruz.
    @PostMapping("users")
    public User saveUser(@RequestBody User user){
        System.out.println("User saved");
        //Güvenlik için şifreyi boşaltamk için böyle değiştirilir.
        user.setPassword("");
        return user;
    }

    @PostMapping("users-all")
    public List<User> saveAllUser(@RequestBody List<User> users){
        System.out.println("All User saved");
        //Güvenlik için şifreyi boşaltamk için böyle değiştirilir.
        users.forEach(user-> user.setPassword(""));
        return users;
    }

    @GetMapping("/header")
    public String getHeader(@RequestHeader("My-Header") String myHeader){
        return "Your header is: " + myHeader;
    }



}
