package com.yuriy.EnglishLearnProject.service;

import com.yuriy.EnglishLearnProject.entity.Message;
import com.yuriy.EnglishLearnProject.repository.MessageRepository;

import java.util.List;

public interface MessageService {

    Message getById(Long id);
    List<Message> getAllByUserId(Long id);

    List<Message> getAll();
}
