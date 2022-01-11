package com.example.restpractice.movie.controller.response;

import com.example.restpractice.movie.MovieGenre;
import com.example.restpractice.movie.service.Movie;
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

    public static MovieResponse convertFrom(Movie movie) {
        return MovieResponse.builder()
                .name(movie.getName())
                .genre(movie.getGenre())
                .releaseYear(movie.getReleaseYear())
                .director(movie.getDirector())
                .build();
    }
}
