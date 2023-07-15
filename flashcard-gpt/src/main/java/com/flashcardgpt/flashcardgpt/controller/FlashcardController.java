package com.flashcardgpt.flashcardgpt.controller;

import com.flashcardgpt.flashcardgpt.dto.FlashcardsRequest;
import com.flashcardgpt.flashcardgpt.dto.FlashcardsResponse;
import com.flashcardgpt.flashcardgpt.service.FlashcardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public FlashcardsResponse getFlashcardById(@PathVariable("id") Long id) {
        log.info("Getting flashcard by id {}", id);
        Optional<FlashcardsResponse> flashcard = flashcardService.getFlashcardById(id);
        return flashcard.orElse(null);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addFlashcard(@RequestBody FlashcardsRequest flashcardsRequest) {
        log.info("Adding flashcard");
        flashcardService.addFlashcard(flashcardsRequest);
    }
}
