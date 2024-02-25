package com.yuriy.ChatProject.service.impl;

import com.yuriy.ChatProject.entity.Chat;
import com.yuriy.ChatProject.exception.chat.ChatNotFoundException;
import com.yuriy.ChatProject.repository.ChatRepository;
import com.yuriy.ChatProject.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {

    private final ChatRepository chatRepository;

    @Autowired
    public ChatServiceImpl(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    @Override
    public Chat saveChat(Chat chat) {
        return chatRepository.save(chat);
    }

    @Override
    public List<Chat> getAll() {
        return chatRepository.findAll();
    }

    @Override
    public List<Chat> getAllByUserId(Long id) {
        return chatRepository.findAllByUserId(id);
    }

    @Override
    public Chat getByName(String name) {
        return chatRepository.findByName(name).orElseThrow(
                () -> new ChatNotFoundException("Chat by name: " + name + " not found!"));
    }
}
