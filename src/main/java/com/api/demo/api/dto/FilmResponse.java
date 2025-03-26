package com.api.demo.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmResponse {
    private String title;

    @JsonProperty("episode_id")
    private Integer episodeId;

    private String director;
    private String producer;

    @JsonProperty("release_date")
    private String releaseDate;
}
