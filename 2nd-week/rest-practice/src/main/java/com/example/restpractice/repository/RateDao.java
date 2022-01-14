package com.example.restpractice.repository;

import java.util.List;

public interface RateDao {

    void rateToMovie(RateEntity entity);

    List<RateEntity> retrieveByMovieId(Long movieId);
}
