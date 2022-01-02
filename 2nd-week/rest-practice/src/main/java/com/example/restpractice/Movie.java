package com.example.restpractice;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Movie {
    private String name;
    private Genres genres;
    private String director;
    private String releaseYear;
    private List<String> cast;
}
