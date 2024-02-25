package com.yuriy.ChatProject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yuriy.ChatProject.entity.enums.ERole;
import com.yuriy.ChatProject.entity.enums.UserStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user_data")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Enumerated(value = EnumType.STRING)
    private ERole role = ERole.USER_ROLE;
    @Enumerated(value = EnumType.STRING)
    private UserStatus userStatus = UserStatus.OFFLINE;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_block_id")
    private UserBlock isBlocked;

    @JsonIgnore
    @OneToMany(mappedBy = "sender", fetch = FetchType.LAZY)
    private List<Message> message;

    @JsonIgnore
    @ManyToMany(mappedBy = "users")
    private Set<Chat> chats;
}
