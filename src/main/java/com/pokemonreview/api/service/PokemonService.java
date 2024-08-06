package com.pokemonreview.api.service;

import com.pokemonreview.api.dto.PokemonDto;
import com.pokemonreview.api.dto.PokemonResponse;

import java.util.List;

public interface PokemonService {
    PokemonDto createPokemon(PokemonDto pokemonDto);
    PokemonResponse getAllPokemon(int pageNo, int pageSize);
    List<PokemonDto> getAllPokemonNoPagination();
    PokemonDto getPokemonById(int pokemonId);
    PokemonDto updatePokemon(PokemonDto pokemonDto, int pokemonId);
    void deletePokemonById(int pokemonId);

}
