package com.boss.pokemonapi.service;

import com.boss.pokemonapi.dto.PokemonResponseDto;
import com.boss.pokemonapi.exception.PokemonNotFoundException;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class PokemonService {

    private final String POKE_API_URL =
            "https://pokeapi.co/api/v2/pokemon/";

    @Cacheable(value = "pokemon", key = "#pokemonName")
    public PokemonResponseDto getPokemonData(String pokemonName) {

        System.out.println("Calling PokeAPI...");

        RestTemplate restTemplate = new RestTemplate();

        String url = POKE_API_URL + pokemonName;

        Map<String, Object> response;

        try {

            response = restTemplate.getForObject(url, Map.class);

        } catch (HttpClientErrorException ex) {

            throw new PokemonNotFoundException(
                    "Pokemon not found: " + pokemonName
            );
        }

        int id = (Integer) response.get("id");

        String name = (String) response.get("name");

        int height = (Integer) response.get("height");

        int weight = (Integer) response.get("weight");

        int baseExperience =
                (Integer) response.get("base_experience");

        Map<String, Object> sprites =
                (Map<String, Object>) response.get("sprites");

        String image =
                (String) sprites.get("front_default");

        // TYPES

        List<Map<String, Object>> typesData =
                (List<Map<String, Object>>) response.get("types");

        List<String> types = new ArrayList<>();

        for (Map<String, Object> typeItem : typesData) {

            Map<String, Object> type =
                    (Map<String, Object>) typeItem.get("type");

            types.add((String) type.get("name"));
        }

        // ABILITIES

        List<Map<String, Object>> abilitiesData =
                (List<Map<String, Object>>) response.get("abilities");

        List<String> abilities = new ArrayList<>();

        for (Map<String, Object> abilityItem : abilitiesData) {

            Map<String, Object> ability =
                    (Map<String, Object>) abilityItem.get("ability");

            abilities.add((String) ability.get("name"));
        }

        return new PokemonResponseDto(
                id,
                name,
                height,
                weight,
                baseExperience,
                image,
                types,
                abilities
        );
    }
}