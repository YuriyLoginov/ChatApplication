package com.yuriy.ChatProject.mappers;

import com.yuriy.ChatProject.dto.user.UserRegistrationDTO;
import com.yuriy.ChatProject.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserRegistrationDTO toRegistrationDTO(User user);
}
