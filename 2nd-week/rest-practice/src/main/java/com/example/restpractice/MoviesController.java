package com.example.restpractice;

import java.util.List;

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


}
