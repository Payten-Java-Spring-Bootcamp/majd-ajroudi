package com.example.restpractice;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Getter
@Setter
@Builder
public class Watchlist {
    private String name;
    private List<Movie> movies;
    private String id;

    public void addMovie(@NotNull Movie movie) {
        this.movies.add(movie);
    }

}
