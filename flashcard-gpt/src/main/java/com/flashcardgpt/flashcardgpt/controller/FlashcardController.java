package com.flashcardgpt.flashcardgpt.controller;

import com.flashcardgpt.flashcardgpt.dto.FlashcardsResponse;
import com.flashcardgpt.flashcardgpt.service.FlashcardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/flashcard")
public class FlashcardController {

    private final FlashcardService flashcardService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<FlashcardsResponse> getAllFlashcards() {
        log.info("Getting all flashcards");
        return flashcardService.getFlashcards();
    }
}
