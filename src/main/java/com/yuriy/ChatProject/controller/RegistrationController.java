package com.yuriy.ChatProject.controller;

import com.yuriy.ChatProject.dto.user.UserRegistrationDTO;
import com.yuriy.ChatProject.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

    private UserServiceImpl userService;

    @Autowired
    public RegistrationController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String registration(Model model, UserRegistrationDTO userRegistrationDTO) {

        return "registration";
    }
}
