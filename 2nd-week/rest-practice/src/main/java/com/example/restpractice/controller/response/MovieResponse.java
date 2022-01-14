package com.example.restpractice.controller.response;

import com.example.restpractice.MovieGenre;
import com.example.restpractice.service.Movie;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder

public class MovieResponse {

    private String name;
    private MovieGenre genre;
    private Integer releaseYear;
    private String director;
    private List<CastResponse> castList;
    private Long id;

    public static MovieResponse convertFrom(Movie movie) {
        return MovieResponse.builder()
                .name(movie.getName())
                .genre(movie.getGenre())
                .releaseYear(movie.getReleaseYear())
                .director(movie.getDirector())
                .id(movie.getId())
                .build();
    }
}
