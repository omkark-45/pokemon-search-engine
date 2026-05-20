package com.boss.pokemonapi.exception;

public class PokemonNotFoundException
        extends RuntimeException {

    public PokemonNotFoundException(String message) {
        super(message);
    }
}