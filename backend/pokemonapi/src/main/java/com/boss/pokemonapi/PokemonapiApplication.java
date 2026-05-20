package com.boss.pokemonapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PokemonapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonapiApplication.class, args);
    }
}