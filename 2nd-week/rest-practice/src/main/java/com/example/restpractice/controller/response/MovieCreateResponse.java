package com.example.restpractice.controller.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MovieCreateResponse {
    private Long id;

    public static MovieCreateResponse convertToMovieResponse(Long id) {
        return MovieCreateResponse.builder()
                .id(id)
                .build();
    }
}
