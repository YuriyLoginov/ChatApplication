package com.yuriy.EnglishLearnProject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yuriy.EnglishLearnProject.entity.enums.ERole;
import com.yuriy.EnglishLearnProject.entity.enums.UserStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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
    @Enumerated
    private UserStatus userStatus = UserStatus.OFFLINE;

    @ManyToOne
    @JoinColumn(name = "user_block_id")
    private UserBlock isBlocked;

    @JsonIgnore
    @OneToMany(mappedBy = "sender", fetch = FetchType.LAZY)
    private List<Message> message;

    @OneToMany(mappedBy = "sender", fetch = FetchType.LAZY)
    private List<Chat> chatRes;
}
