package com.example.restpractice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MoviesController {

    List<Movie> movies = List.of(
            Movie.builder()
                    .name("Harry Potter and The Chamber of Secrets")
                    .cast(List.of(
                            "Daniel Radcliffe",
                            "Richard Harris",
                            "Emma Watson",
                            "Jason Isaacs",
                            "Rupert Grint",
                            "Toby Jones"
                    ))
                    .releaseYear("2002")
                    .genres(Genres.FANTASY)
                    .director("Chris Columbus")
                    .build(),
            Movie.builder()
                    .name("Spider-Man: No Way Home")
                    .releaseYear("2021")
                    .genres(Genres.ACTION)
                    .cast(List.of(
                            "Tom Holland",
                            "Tobey Maguire",
                            "Andrew Garfield"
                    ))
                    .director("Jon Watts")
                    .build()
    );

    @GetMapping("/movies")
    public List<Movie> retrieveMovies() {
        return movies;
    }

    @PostMapping("/movies")
    @ResponseStatus(HttpStatus.CREATED)
    public Movie addMovie(@RequestBody Movie movie) {
        return Movie.builder()
                .name(movie.getName())
                .director(movie.getDirector())
                .genres(movie.getGenres())
                .cast(movie.getCast())
                .releaseYear(movie.getReleaseYear())
                .build();
    }
}
