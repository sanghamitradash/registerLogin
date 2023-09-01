package com.example.RegistrationLoginDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ParentController {
     @GetMapping("/")
    public String show(){
        return "home";
    }

    //handler for the showing registration page
    @GetMapping("/registration")
    public String registrationPage(){

         return "registrationPage";
    }
}
