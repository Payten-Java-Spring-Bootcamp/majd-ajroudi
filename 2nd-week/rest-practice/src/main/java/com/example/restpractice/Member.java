package com.example.restpractice;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Member {
    private String name;
    private List<Movie> watchList;
    private String id;
}
