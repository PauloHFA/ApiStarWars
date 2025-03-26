package com.api.demo.api.controller;

import com.api.demo.api.client.CharacterClient;
import com.api.demo.api.client.FilmClient;
import com.api.demo.api.dto.StarWarsApiCharacters;
import com.api.demo.api.dto.StarWarsApiFilmes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/filmes")
public class FilmController {

    private final FilmClient filmClient;

    public FilmController(FilmClient filmClient) {
        this.filmClient = filmClient;
    }

    @GetMapping
    public StarWarsApiFilmes findAll() {
        return filmClient.findAll();
    }

    @GetMapping("/title/{title}")
    public StarWarsApiFilmes findMovieByTitle(@PathVariable String title) {
        return filmClient.findByMovieTitle(title);
    }

    @GetMapping("/characters")
    public StarWarsApiCharacters findAllCharacters() {
        return charac.findAllCharacters();  // ✅ Correto!
    }
}
