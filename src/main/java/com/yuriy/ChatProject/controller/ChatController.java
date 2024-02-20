package com.yuriy.ChatProject.controller;

import com.yuriy.ChatProject.entity.Chat;
import com.yuriy.ChatProject.service.impl.ChatServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chats")
public class ChatController {


    private final ChatServiceImpl chatService;

    public ChatController(ChatServiceImpl chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/new")
    public Chat createChat(@RequestBody Chat chat) {
        return chatService.saveChat(chat);
    }

}
