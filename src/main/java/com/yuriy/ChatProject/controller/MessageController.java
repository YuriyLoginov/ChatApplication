package com.yuriy.ChatProject.controller;

import com.yuriy.ChatProject.entity.Message;
import com.yuriy.ChatProject.service.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private final MessageServiceImpl messageService;

    @Autowired
    public MessageController(MessageServiceImpl messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/message")
    public Message sendMessage(@RequestBody Message message) {
        return messageService.saveMessage(message);
    }
    @GetMapping
    public List<Message> getAll() {
        return messageService.getAll();
    }

    @GetMapping("/user/{id}")
    public List<Message> getAllByUserId(@PathVariable Long id) {
        return messageService.getAllByUserId(id);
    }

    @GetMapping("/chat/{id}")
    public List<Message> getAllByChatId(@PathVariable Long id) {
        return messageService.getAllByChatId(id);
    }

    @GetMapping("/{id}")
    public Message getById(@PathVariable Long id) {
        return messageService.getById(id);
    }

    @DeleteMapping()
    public void delete(@RequestParam Long id) {
        messageService.deleteById(id);
    }
}
