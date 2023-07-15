package com.flashcardgpt.flashcardgpt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class FlashcardsRequest {
    @NotNull
    private String question;
    private String answer;
}
