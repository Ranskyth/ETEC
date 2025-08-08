package com.example.tasks.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController{
    
    @GetMapping("/task")
    public void listTask(){
        System.out.println("oiii");
    }
}