package com.api.demo.api.controller;

import com.api.demo.api.client.CharacterClient;
import com.api.demo.api.client.FilmClient;
import com.api.demo.api.dto.StarWarsApiCharacters;
import com.api.demo.api.dto.StarWarsApiFilmes;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://*.serveo.net")
@RestController
@RequestMapping("/api/filmes")
public class FilmController {

    private final CharacterClient characterClient;
    private final FilmClient filmClient;

    public FilmController(CharacterClient characterClient, FilmClient filmClient) {
        this.characterClient = characterClient;
        this.filmClient = filmClient;
    }

    @GetMapping
    public StarWarsApiFilmes findAll() {
        return filmClient.findAll();
    }

    @GetMapping("/title")
    public StarWarsApiFilmes findMovieByTitle(@RequestParam String title) {
        return filmClient.findByMovieTitle(title);
    }

    @GetMapping("/characters")
    public StarWarsApiCharacters findAllCharacters() {
        return characterClient.findAllCharacters();
    }
}