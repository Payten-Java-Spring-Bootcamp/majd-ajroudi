package com.example.restpractice.service;

import java.util.List;

public interface MovieService {
    Long create(Movie movie);

    Movie retrieve(Long id);

    List<Movie> retrieve();
}
