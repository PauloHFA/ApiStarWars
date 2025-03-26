package com.api.demo.api.client;

import com.api.demo.api.dto.StarWarsApiCharacters;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "characterClient", url = "${swapi.base-url}people")
public interface CharacterClient {

    @GetMapping
    StarWarsApiCharacters findAllCharacters();

}
