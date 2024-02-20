package com.yuriy.ChatProject.controller;

import com.yuriy.ChatProject.entity.Chat;
import com.yuriy.ChatProject.entity.Message;
import com.yuriy.ChatProject.entity.User;
import com.yuriy.ChatProject.service.impl.ChatServiceImpl;
import com.yuriy.ChatProject.service.impl.MessageServiceImpl;
import com.yuriy.ChatProject.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/registration")
    public User registration(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
