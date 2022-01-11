package com.example.restpractice.movie.repository;

public interface MovieDao {
    Long save(MovieEntity entity);

    MovieEntity retrieve(Long id);
}
