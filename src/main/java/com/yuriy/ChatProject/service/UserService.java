package com.yuriy.ChatProject.service;

import com.yuriy.ChatProject.entity.Chat;
import com.yuriy.ChatProject.entity.Message;
import com.yuriy.ChatProject.entity.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    User saveUser(User user);
    void delete(Long id);
    List<User> getAll();

    List<Chat> getChatsByUserId();

}
