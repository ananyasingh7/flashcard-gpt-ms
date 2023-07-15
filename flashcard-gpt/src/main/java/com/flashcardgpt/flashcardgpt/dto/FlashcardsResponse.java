package com.flashcardgpt.flashcardgpt.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FlashcardsResponse {
    private Long id;
    private String question;
    private String answer;
}
