package com.yuriy.ChatProject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserBlock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "block_time", nullable = false)
    private Date blocDateTime;

    @Column(name = "duration", nullable = false)
    private Long duration;

    @Column
    private Boolean status;

    @JsonIgnore
    @OneToMany(mappedBy = "isBlocked", fetch = FetchType.LAZY)
    private List<User> users;
}
