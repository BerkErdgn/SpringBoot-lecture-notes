package com.berkerdgn.lesson1.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class MyController {


    //http://localhost:8080/api/message/deneme
    @GetMapping(path = "/message/{message}")
    public String getMyMessage(@PathVariable(name="message", required = false) String message) {
        return "Your message is : " + message;
    }


    //http://localhost:8080/api/secondMessage?message=deneme
    @GetMapping(path = "/secondMessage")
    public  String getMySecondMessage(@RequestParam(name="message", required = false) String message) {
        return "Your message is : " + message;
    }

    @GetMapping(path = {"/message1","/message1/{message}"})
    public String getMyMessage1(@PathVariable(name="message", required = false) String message) {
        return "Your message is : " + message;
    }


}
