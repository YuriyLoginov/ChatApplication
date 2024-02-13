package com.yuriy.EnglishLearnProject.service.impl;

import com.yuriy.EnglishLearnProject.entity.User;
import com.yuriy.EnglishLearnProject.exception.UserAlreadyExistException;
import com.yuriy.EnglishLearnProject.exception.UserNotFoundException;
import com.yuriy.EnglishLearnProject.repository.UserRepository;
import com.yuriy.EnglishLearnProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        if (userRepository.findById(id).isPresent()) {
            return userRepository.findById(id).orElseThrow();
        }
        throw new UserNotFoundException("User does not exist!");
    }

    @Override
    public User saveUser(User user) {
        if (userRepository.findByUsername(user.getUsername()).isPresent() && userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new UserAlreadyExistException("User already exist!");
        }
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        if (userRepository.findById(id).isEmpty()) {
            throw new UserNotFoundException("User does not exist!");
        }
        userRepository.delete(userRepository.findById(id).orElseThrow());
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
