package com.example.restpractice.controller;

import com.example.restpractice.controller.request.MovieRequest;
import com.example.restpractice.controller.response.MovieCreateResponse;
import com.example.restpractice.controller.response.MovieResponse;
import com.example.restpractice.service.Movie;
import com.example.restpractice.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
// @RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    @PostMapping("/movies")
    @ResponseStatus(HttpStatus.CREATED)
    public MovieCreateResponse create(@RequestBody @Valid MovieRequest request) {
        Movie movie = request.convertToMovie();
        Long id = movieService.create(movie);
        return MovieCreateResponse.convertToMovieResponse(id);
    }

    @GetMapping("/movies/{id}")
    public MovieResponse retrieve(@PathVariable Long id) {
        Movie movie = movieService.retrieve(id);
        return MovieResponse.convertFrom(movie);
    }

    @GetMapping("/movies")
    public List<Movie> retrieve() {
        return movieService.retrieve();
    }
}
