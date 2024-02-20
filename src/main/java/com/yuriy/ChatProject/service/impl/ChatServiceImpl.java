package com.yuriy.ChatProject.service.impl;

import com.yuriy.ChatProject.entity.Chat;
import com.yuriy.ChatProject.repository.ChatRepository;
import com.yuriy.ChatProject.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    private ChatRepository chatRepository;
    @Override
    public Chat saveChat(Chat chat) {
        return chatRepository.save(chat);
    }
}
