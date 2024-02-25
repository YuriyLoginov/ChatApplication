package com.yuriy.ChatProject.controller.api;

import com.yuriy.ChatProject.entity.Chat;
import com.yuriy.ChatProject.service.impl.ChatServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chats")
public class ChatController {

    private final ChatServiceImpl chatService;

    public ChatController(ChatServiceImpl chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public Chat createChat(@RequestBody Chat chat) {
        return chatService.saveChat(chat);
    }

    @GetMapping
    public List<Chat> getAllChat() {
        return chatService.getAll();
    }

    @GetMapping("/{name}")
    public Chat getAllChatsByUserId(@PathVariable String name) {
        return chatService.getByName(name);
    }
}
