package com.example.restpractice;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Watchlist {
    private String name;
    private List<Movie> movies;

    public Boolean addMovie(Movie movie) {
        this.movies.add(movie);
        return true;
    }

}
