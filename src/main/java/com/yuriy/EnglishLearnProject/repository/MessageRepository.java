package com.yuriy.EnglishLearnProject.repository;

import com.yuriy.EnglishLearnProject.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    Optional<Message> findById(Long id);

    @Query(value = "SELECT * FROM message WHERE user_id = id",
            nativeQuery = true)
    List<Message> findByUserId(@Param("id") Long id);
}
