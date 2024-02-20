package com.yuriy.ChatProject.service;

import com.yuriy.ChatProject.entity.Message;

import java.util.List;

public interface MessageService {

    Message getById(Long id);
    List<Message> getAllByUserId(Long id);

    List<Message> getAll();

    List<Message> getAllByChatId(Long id);

    Message saveMessage(Message message);

    void deleteById(Long id);
}
