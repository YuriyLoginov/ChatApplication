package com.yuriy.EnglishLearnProject.entity;

import com.yuriy.EnglishLearnProject.entity.enums.ERole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_data")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Enumerated
    private ERole role = ERole.USER_ROLE;

    private String isBlocked;
}
