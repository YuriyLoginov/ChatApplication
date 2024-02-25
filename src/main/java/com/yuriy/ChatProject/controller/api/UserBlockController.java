package com.yuriy.ChatProject.controller.api;

import com.yuriy.ChatProject.entity.UserBlock;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userBlocks")
public class UserBlockController {

    @GetMapping
    public List<UserBlock> getAllBlocks() {
        return null;
    }

    @GetMapping("/{id}")
    public UserBlock getById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public UserBlock blockUser(@RequestBody UserBlock userBlock) {
        return null;
    }

    @DeleteMapping("/{id}")
    public UserBlock unblock(@PathVariable Long id) {
        return null;
    }
}
