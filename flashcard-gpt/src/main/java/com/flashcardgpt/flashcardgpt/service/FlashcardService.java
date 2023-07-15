package com.flashcardgpt.flashcardgpt.service;

import com.flashcardgpt.flashcardgpt.dto.FlashcardsResponse;
import com.flashcardgpt.flashcardgpt.repository.FlashcardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class FlashcardService {

    private final FlashcardRepository flashcardRepository;

    public List<FlashcardsResponse> getFlashcards() {
        return flashcardRepository.findAll().stream()
                .map(flashcard -> FlashcardsResponse.builder()
                        .id(flashcard.getId())
                        .question(flashcard.getQuestion())
                        .answer(flashcard.getAnswer())
                        .build()).collect(Collectors.toList());
    }
}
