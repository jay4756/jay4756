package com.project.BookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class cont {

    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/all")
    public String all(){
        return "allbook";
    }
    @GetMapping("/mybook")
    public String add() {
        return "mybook";
    }
    @GetMapping("/newbook")
    public String newbook() {
        return "newbook";
    }
   

}
