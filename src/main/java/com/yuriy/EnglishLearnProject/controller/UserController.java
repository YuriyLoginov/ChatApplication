package com.yuriy.EnglishLearnProject.controller;

import com.yuriy.EnglishLearnProject.entity.User;
import com.yuriy.EnglishLearnProject.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping
    public User registration(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam Long id) {
        userService.delete(id);
    }

    @GetMapping()
    public User getUser(@RequestParam Long id) {
        return userService.findById(id);
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }
}
