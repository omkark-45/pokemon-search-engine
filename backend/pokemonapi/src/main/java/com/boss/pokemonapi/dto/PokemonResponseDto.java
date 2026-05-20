package com.boss.pokemonapi.dto;

import java.util.List;

public class PokemonResponseDto {

    private int id;
    private String name;
    private int height;
    private int weight;
    private int baseExperience;
    private String image;

    private List<String> types;
    private List<String> abilities;

    public PokemonResponseDto() {
    }

    public PokemonResponseDto(
            int id,
            String name,
            int height,
            int weight,
            int baseExperience,
            String image,
            List<String> types,
            List<String> abilities
    ) {

        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.baseExperience = baseExperience;
        this.image = image;
        this.types = types;
        this.abilities = abilities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }
}