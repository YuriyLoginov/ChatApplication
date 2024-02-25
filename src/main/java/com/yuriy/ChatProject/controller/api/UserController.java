package com.yuriy.ChatProject.controller.api;

import com.yuriy.ChatProject.dto.UserDTO;
import com.yuriy.ChatProject.entity.User;
import com.yuriy.ChatProject.mapper.UserMapper;
import com.yuriy.ChatProject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @PostMapping
    public UserDTO registration(@RequestBody UserDTO user){
        return userService.saveUser(user);
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.delete(id);
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

}
