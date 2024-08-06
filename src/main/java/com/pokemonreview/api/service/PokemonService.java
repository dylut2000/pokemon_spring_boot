package com.pokemonreview.api.service;

import com.pokemonreview.api.dto.PokemonDto;

import java.util.List;

public interface PokemonService {
    PokemonDto createPokemon(PokemonDto pokemonDto);
    List<PokemonDto> getAllPokemon();
    PokemonDto getPokemonById(int pokemonId);
    PokemonDto updatePokemon(PokemonDto pokemonDto, int pokemonId);
    void deletePokemonById(int pokemonId);

}
