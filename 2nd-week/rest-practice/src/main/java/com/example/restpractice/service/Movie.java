package com.example.restpractice.service;

import com.example.restpractice.MovieGenre;
import com.example.restpractice.repository.MovieEntity;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Builder
@EqualsAndHashCode
public class Movie {
    private String name;
    private MovieGenre genre;
    private Integer releaseYear;
    private String director;
    private Long id;

    MovieEntity convertToMovieEntity() {
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setName(getName());
        movieEntity.setDirector(getDirector());
        movieEntity.setReleaseYear(getReleaseYear());
        movieEntity.setGenre(getGenre());
        return movieEntity;
    }

    public static Movie convertFrom(MovieEntity entity) {
        return Movie.builder()
                .name(entity.getName())
                .genre(entity.getGenre())
                .releaseYear(entity.getReleaseYear())
                .director(entity.getDirector())
                .id(entity.getId())
                .build();
    }

}
