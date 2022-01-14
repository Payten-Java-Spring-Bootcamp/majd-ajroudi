package com.example.restpractice.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieDaoImpl implements MovieDao{

    private final MovieJpaRepository movieJpaRepository;

    @Override
    public Long save(MovieEntity entity) {
        MovieEntity savedEntity = movieJpaRepository.save(entity);
        return savedEntity.getId();
    }

    @Override
    public MovieEntity retrieve(Long id) {
        Optional<MovieEntity> movieEntityOptional = movieJpaRepository.findById(id);
        if (movieEntityOptional.isPresent()) return movieEntityOptional.get();
        throw new RuntimeException();
    }

    @Override
    public MovieEntity[] retrieve() {
        return movieJpaRepository.findAll().toArray(new MovieEntity[0]);
    }
}
