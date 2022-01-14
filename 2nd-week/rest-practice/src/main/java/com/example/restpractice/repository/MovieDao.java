package com.example.restpractice.repository;

public interface MovieDao {
    Long save(MovieEntity entity);

    MovieEntity retrieve(Long id);

    MovieEntity[] retrieve();
}
