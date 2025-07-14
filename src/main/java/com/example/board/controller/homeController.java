package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("/")
    public String list() {
        return "list.html";
    }

    @GetMapping("/boards")
    public String board() {
        return "list.html";
    }

    @GetMapping("/boards/new")
    public String newList() {
        return "new.html";
    }


}
