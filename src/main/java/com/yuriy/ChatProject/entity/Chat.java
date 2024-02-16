package com.yuriy.ChatProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class)
    @JoinTable(
            name = "user_chat",
            joinColumns =@JoinColumn(name = "chat_id"),
            inverseJoinColumns = @JoinColumn(name = "user_data_id"))
    private Set<User> users;

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Message.class)
    @JoinTable(
            name = "message_chat",
            joinColumns = @JoinColumn(name = "chat_id"),
            inverseJoinColumns = @JoinColumn(name = "message_id")
    )
    private List<Message> messages;
}
