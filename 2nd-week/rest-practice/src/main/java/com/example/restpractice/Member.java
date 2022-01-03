package com.example.restpractice;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Getter
@Setter
@Builder
public class Member {
    private String name;
    private List<Watchlist> watchlist;
    private String id;

    public void addNewList(@NotNull Watchlist newList){
        this.watchlist.add(
                Watchlist.builder()
                        .name(newList.getName())
                        .movies(newList.getMovies())
                        .build()
        );
    }
}
