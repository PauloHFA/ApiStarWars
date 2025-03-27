package com.api.demo.api.client;

import com.api.demo.api.dto.StarWarsApiCharacters;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "characterClient", url = "${swap.base-url}")
public interface CharacterClient {

    @GetMapping("people")
    StarWarsApiCharacters findAllCharacters();

}