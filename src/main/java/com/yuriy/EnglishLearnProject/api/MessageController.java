package com.yuriy.EnglishLearnProject.api;

import com.yuriy.EnglishLearnProject.entity.Message;
import com.yuriy.EnglishLearnProject.service.impl.MessageServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private final MessageServiceImpl messageService;

    @Autowired
    public MessageController(MessageServiceImpl messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public List<Message> getAll() {
        return messageService.getAll();
    }

    @GetMapping("/user/{id}")
    public List<Message> getAllByUserId(@PathVariable Long id) {
        return messageService.getAllByUserId(id);
    }

    @GetMapping("/{id}")
    public Message getById(@PathVariable Long id) {
        return messageService.getById(id);
    }
}
