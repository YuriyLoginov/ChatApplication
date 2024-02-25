package com.yuriy.ChatProject.service;

import com.yuriy.ChatProject.dto.UserDTO;
import com.yuriy.ChatProject.entity.User;

import java.util.List;

public interface UserService {
    UserDTO findById(Long id);
    UserDTO saveUser(UserDTO user);
    void delete(Long id);
    List<UserDTO> getAll();

}
