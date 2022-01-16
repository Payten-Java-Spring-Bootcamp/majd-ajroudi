package com.example.restpractice.service;

import com.example.restpractice.repository.MovieDao;
import com.example.restpractice.repository.MovieEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<Movie> retrieve() {
        MovieEntity[] entities = movieDao.retrieve();
        return Arrays.stream(entities)
                .map(Movie::convertFrom)
                .collect(Collectors.toList());
    }
}
