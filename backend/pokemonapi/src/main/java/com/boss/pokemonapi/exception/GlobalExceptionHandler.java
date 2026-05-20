package com.boss.pokemonapi.exception;

import com.boss.pokemonapi.dto.ErrorResponseDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PokemonNotFoundException.class)
    public ResponseEntity<ErrorResponseDto>
    handlePokemonNotFoundException(
            PokemonNotFoundException ex) {

        ErrorResponseDto error =
                new ErrorResponseDto(
                        ex.getMessage(),
                        "ERROR",
                        LocalDateTime.now()
                );

        return new ResponseEntity<>(
                error,
                HttpStatus.NOT_FOUND
        );
    }
}