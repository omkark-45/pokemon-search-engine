package com.boss.pokemonapi.controller;

import com.boss.pokemonapi.dto.PokemonResponseDto;
import com.boss.pokemonapi.service.PokemonService;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/{name}")
    public PokemonResponseDto getPokemon(
            @PathVariable String name) {

        return pokemonService.getPokemonData(name);
    }
}