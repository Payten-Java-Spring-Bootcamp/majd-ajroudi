package com.example.restpractice.movie.service;

import com.example.restpractice.movie.repository.MovieDao;
import com.example.restpractice.movie.repository.MovieEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieDao movieDao;

    @Override
    public Long create(Movie movie) {
        MovieEntity movieEntity = movie.convertToMovieEntity();
        return movieDao.save(movieEntity);
    }

    @Override
    public Movie retrieve(Long id) {
        MovieEntity entity = movieDao.retrieve(id);
        return Movie.convertFrom(entity);
    }
}
