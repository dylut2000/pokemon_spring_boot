package com.pokemonreview.api.exeption;

public class PokemonNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public PokemonNotFoundException(String message) {
        super(message);
    }

}
