package com.yuriy.ChatProject.service.impl;

import com.yuriy.ChatProject.entity.Chat;
import com.yuriy.ChatProject.entity.User;
import com.yuriy.ChatProject.exception.user.UserNotFoundException;
import com.yuriy.ChatProject.repository.UserRepository;
import com.yuriy.ChatProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(
                () -> new UserNotFoundException("User with id: " + id + " not found!"));
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(userRepository.findById(id).orElseThrow(
                () -> new UserNotFoundException("User with id:"  + id +  "not found!")));
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public List<Chat> getChatsByUserId() {
        return null;
    }
}
