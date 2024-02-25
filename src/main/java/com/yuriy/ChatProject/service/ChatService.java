package com.yuriy.ChatProject.service;

import com.yuriy.ChatProject.entity.Chat;

import java.util.List;
import java.util.Optional;

public interface ChatService {
    Chat saveChat(Chat chat);

    List<Chat> getAll();
    List<Chat> getAllByUserId(Long id);

    Chat getByName(String name);
}
