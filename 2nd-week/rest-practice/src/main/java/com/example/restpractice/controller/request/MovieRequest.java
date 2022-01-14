package com.example.restpractice.controller.request;

import com.example.restpractice.MovieGenre;
import com.example.restpractice.service.Movie;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class MovieRequest {

    @NotBlank
    private String name;

    @NotNull
    private MovieGenre genre;

    @NotNull
    private Integer releaseYear;

    @NotBlank
    private String director;

    public Movie convertToMovie() {
        return Movie.builder()
                .name(name)
                .genre(genre)
                .releaseYear(releaseYear)
                .director(director)
                .build();
    }
}
