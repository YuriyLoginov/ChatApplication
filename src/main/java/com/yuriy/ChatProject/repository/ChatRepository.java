package com.yuriy.ChatProject.repository;

import com.yuriy.ChatProject.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {

    Optional<Chat> findByName(String name);
    @Query(value = "SELECT * FROM chat " +
            "INNER JOIN public.user_chat uc " +
            "on chat.id = uc.chat_id " +
            "WHERE user_data_id = ?1",
            nativeQuery = true)
    List<Chat> findAllByUserId(Long id);
}
