package com.javahash.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController { 

    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name", required=false, defaultValue="User") String name, Model model) {
        model.addAttribute("name", name + "is my name 1234");
        return "helloworld";
        //comments for changeset
    }

}
