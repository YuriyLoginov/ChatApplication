package com.yuriy.EnglishLearnProject.service;

import com.yuriy.EnglishLearnProject.entity.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    User saveUser(User user);
    void delete(Long id);
    List<User> getAll();

}
