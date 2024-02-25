package com.yuriy.ChatProject.mapper;

import com.yuriy.ChatProject.dto.UserDTO;
import com.yuriy.ChatProject.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}
