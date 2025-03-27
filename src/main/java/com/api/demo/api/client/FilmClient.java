package com.api.demo.api.client;

import com.api.demo.api.dto.StarWarsApiCharacters;
import com.api.demo.api.dto.StarWarsApiFilmes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "filmClient",
        url = "${swapi.base-url}films"
)
public interface FilmClient {

    @GetMapping
    StarWarsApiFilmes findAll();

    @GetMapping
    StarWarsApiFilmes findByMovieTitle(@RequestParam(name = "search") String movieTitle);

}