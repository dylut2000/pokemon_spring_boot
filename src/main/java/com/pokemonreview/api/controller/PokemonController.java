package com.pokemonreview.api.controller;

import com.pokemonreview.api.dto.PokemonDto;
import com.pokemonreview.api.model.Pokemon;
import com.pokemonreview.api.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PokemonController {

    private PokemonService pokemonService;

    @Autowired
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("pokemon")
    public ResponseEntity<List<Pokemon>> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "squirtle", "water"));
        pokemons.add(new Pokemon(2, "pikachu", "electric"));
        pokemons.add(new Pokemon(3, "charmander", "fire"));
        return ResponseEntity.ok(pokemons);
    }


    @GetMapping("pokemon/{id}")
    public Pokemon pokemonDetail(@PathVariable int id) {
        return new Pokemon(id, "squirtle", "water");
    }


    @PostMapping("pokemon/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PokemonDto> createPokemon(@RequestBody PokemonDto pokemonDto) {
        return new ResponseEntity<>(pokemonService.createPokemon(pokemonDto), HttpStatus.CREATED);
    }


    @PutMapping("pokemon/{id}/update")
    public ResponseEntity<Pokemon> updatePokemon(@RequestBody Pokemon pokemon, @PathVariable("id") int pokemonId) {
        System.out.println(pokemon.toString());
        return ResponseEntity.ok(pokemon);
    }


    @DeleteMapping("pokemon/{id}/delete")
    public ResponseEntity<String> deletePokemon(@PathVariable("id") int pokemonId) {
        System.out.println(pokemonId);
        return ResponseEntity.ok("Pokemon deleted");
    }
}
