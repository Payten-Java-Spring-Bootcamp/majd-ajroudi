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
        Member targetMember = members.stream()
                .filter(member -> member.getId() == id)
                .findAny()
                .orElse(null);

        System.out.println("found member: " + targetMember);
        return targetMember;
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
}
