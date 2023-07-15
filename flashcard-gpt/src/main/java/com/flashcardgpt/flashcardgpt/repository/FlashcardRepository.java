package com.flashcardgpt.flashcardgpt.repository;

import com.flashcardgpt.flashcardgpt.model.Flashcards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashcardRepository extends JpaRepository<Flashcards, Long> {
    // Add custom repository methods if needed
}
