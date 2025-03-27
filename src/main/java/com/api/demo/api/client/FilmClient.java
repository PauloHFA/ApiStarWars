package com.api.demo.api.client;

import com.api.demo.api.dto.StarWarsApiFilmes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "filmClient",
        url = "${swap.base-url}"
)
public interface FilmClient {

    @GetMapping("films")
    StarWarsApiFilmes findAll();

    @GetMapping("films")
    StarWarsApiFilmes findByMovieTitle(@RequestParam(name = "search") String movieTitle);

}