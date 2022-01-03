package com.example.restpractice;

import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    ArrayList<Member> members = new ArrayList<>();

    ArrayList<Movie> movies = new ArrayList<>(Arrays.asList(
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
                    .points(3.9)
                    .id("movie-0")
                    .releaseYear("2002")
                    .genres(List.of(Genres.FANTASY, Genres.CHILDREN, Genres.MYSTERY))
                    .director("Chris Columbus")
                    .build(),
            Movie.builder()
                    .name("Spider-Man: No Way Home")
                    .releaseYear("2021")
                    .genres(List.of(Genres.ACTION, Genres.ADVENTURE, Genres.FANTASY))
                    .points(4.3)
                    .id("movie-2")
                    .cast(List.of(
                            "Tom Holland",
                            "Tobey Maguire",
                            "Andrew Garfield"
                    ))
                    .director("Jon Watts")
                    .build()
    ));

    @GetMapping("/movies")
    public List<Movie> retrieveMovies() {
        return movies;
    }

    @PostMapping("/movies")
    @ResponseStatus(HttpStatus.CREATED)
    public Movie addMovie(@NotNull @RequestBody Movie movie) {
        movies.add(
                Movie.builder()
                        .name(movie.getName())
                        .director(movie.getDirector())
                        .genres(movie.getGenres())
                        .cast(movie.getCast())
                        .releaseYear(movie.getReleaseYear())
                        .build()
        );
        return movies.get(movies.size() -1);
    }

    @DeleteMapping("/movies/{movieName}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMovie() {

    }

    @GetMapping("/members")
    public List<Member> retrieveMembers() {
        return members;
    }

    @GetMapping("/members/{id}")
    public Member retrieveSingleMember(@PathVariable String id) {
        return members.stream()
                .filter(member -> member.getId().equals(id))
                .findAny()
                .orElse(null);
    }

    @PostMapping("/members")
    public Member createMember(@RequestBody Member member) {
        members.add(
                Member.builder()
                        .id(member.getId())
                        .name(member.getName())
                        .watchlist(member.getWatchlist())
                        .build()
        );

        return members.get(members.size() - 1);
    }

    @PutMapping("/movies/{movieId}")
    public Movie rateMovie(@RequestBody Double rate, @PathVariable String movieId) {
        Movie targetMovie = movies.stream()
                .filter( currMovie -> currMovie.getId().equals(movieId))
                .findAny()
                .orElse(null);

        Double newTotalRate = (targetMovie.getPoints() + rate) / 2;
        targetMovie.setPoints(newTotalRate);

        return targetMovie;
    }

    @PostMapping("/members/{id}")
    public Member addWatchlistToMember(@RequestBody Watchlist newList, @PathVariable String id) {
        Member targetMember = members.stream()
                .filter(currMember -> currMember.getId().equals(id))
                .findAny()
                .orElse(null);

        targetMember.addNewList(newList);
        return targetMember;
    }

    @PutMapping("/members/{memberId}")
    public Member addMovieToWatchlist(@RequestParam String newMovieId,
                                      @RequestParam String listId,
                                      @PathVariable String memberId) {
        Member targetMember = members.stream()
                .filter(currMember -> currMember.getId().equals(memberId))
                .findAny()
                .orElse(null);

        Watchlist targetList = targetMember.getWatchlist().stream()
                .filter(currList -> currList.getId().equals(listId))
                .findAny()
                .orElse(null);

        Movie newMovie = movies.stream()
                .filter(currMovie -> currMovie.getId().equals(newMovieId))
                .findAny()
                .orElse(null);

        if (newMovie != null) {
            targetList.addMovie(newMovie);
        }

        return targetMember;
    }
}
