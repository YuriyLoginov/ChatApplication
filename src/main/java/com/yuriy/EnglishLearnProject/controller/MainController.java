package com.yuriy.EnglishLearnProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("TEST");
        return "home";
    }

    @GetMapping("/users")
    public String users() {
        return "users";
    }


}
