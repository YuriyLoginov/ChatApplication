package com.yuriy.ChatProject.service.impl;

import com.yuriy.ChatProject.entity.Message;
import com.yuriy.ChatProject.repository.MessageRepository;
import com.yuriy.ChatProject.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public Message getById(Long id) {
        return messageRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Message> getAllByUserId(Long id) {
        return messageRepository.findByUserId(id);
    }

    @Override
    public List<Message> getAll() {
        return messageRepository.findAll();
    }
}
