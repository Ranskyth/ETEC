package com.example.tasks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/v1/api")
class MainController {

    @GetMapping("/oi")
    public String get() {
       

        return "aaa" ;
    }
}
