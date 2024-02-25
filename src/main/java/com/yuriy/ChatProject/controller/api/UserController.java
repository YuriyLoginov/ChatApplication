package com.yuriy.ChatProject.controller.api;

import com.yuriy.ChatProject.dto.user.UserRegistrationDTO;
import com.yuriy.ChatProject.entity.User;
import com.yuriy.ChatProject.mappers.UserMapper;
import com.yuriy.ChatProject.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserRegistrationDTO registration(@RequestBody User user){
        return UserMapper.INSTANCE.toRegistrationDTO(userService.saveUser(user));
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.delete(id);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

}
