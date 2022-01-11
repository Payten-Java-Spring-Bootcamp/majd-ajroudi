package com.example.restpractice.movie.service;

public interface MovieService {
    Long create(Movie movie);

    Movie retrieve(Long id);
}
