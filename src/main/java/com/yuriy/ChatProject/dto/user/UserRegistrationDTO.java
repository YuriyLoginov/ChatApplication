package com.yuriy.ChatProject.dto.user;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class UserRegistrationDTO {
     private String firstName;
     private String lastName;
     private String email;
     private String username;
     private String password;
}
