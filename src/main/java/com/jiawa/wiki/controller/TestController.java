package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // get post put delete
    //
//    @RequestMapping(value="/user/1", method = RequestMethod.GET)
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post1" + name;
    }
}
