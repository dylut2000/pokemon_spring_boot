package com.pokemonreview.api.controllers;

import com.pokemonreview.api.models.Pokemon;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PokemonController {

    @GetMapping("pokemon")
    public ResponseEntity<List<Pokemon>> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "squirtle", "water"));
        pokemons.add(new Pokemon(2, "pikachu", "electric"));
        pokemons.add(new Pokemon(3, "charmander", "fire"));
        return ResponseEntity.ok(pokemons);
    }
}
