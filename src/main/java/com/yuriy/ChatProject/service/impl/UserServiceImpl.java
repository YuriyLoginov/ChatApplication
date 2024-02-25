package com.yuriy.ChatProject.service.impl;

import com.yuriy.ChatProject.dto.UserDTO;
import com.yuriy.ChatProject.exception.user.UserNotFoundException;
import com.yuriy.ChatProject.mapper.UserMapper;
import com.yuriy.ChatProject.repository.UserRepository;
import com.yuriy.ChatProject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDTO findById(Long id) {
        return userMapper.toDTO(userRepository.findById(id).orElseThrow(
                () -> new UserNotFoundException("User with id: " + id + " not found!")));
    }

    @Override
    public UserDTO saveUser(UserDTO user) {
        return userMapper.toDTO(userRepository.save(userMapper.toEntity(user)));
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(userRepository.findById(id).orElseThrow(
                () -> new UserNotFoundException("User with id:" + id + "not found!")));
    }

    @Override
    public List<UserDTO> getAll() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::toDTO)
                .collect(Collectors.toList());
    }

}
