package com.example.collectionpipelines;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Setter
public class Article {
    private Integer words;
    private String type;
    private String title;
    private ArrayList<String> tags;

    public Article(Integer words, String type, String title, ArrayList<String> tags) {
        this.words = words;
        this.type = type;
        this.title = title;
        this.tags = tags;
    }

    public void addTag(String tag) {
        this.tags.add(tag);
    }
}
