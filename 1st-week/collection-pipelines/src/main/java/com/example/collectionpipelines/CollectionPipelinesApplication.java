package com.example.collectionpipelines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class CollectionPipelinesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CollectionPipelinesApplication.class, args);

        Article article1 = new Article(561, "bliki", "NoDBA", new ArrayList(Arrays.asList("nosql", "people", "orm")));
        Article article2 = new Article(1145, "bliki", "Infodeck", new ArrayList(Arrays.asList("nosql", "writing")));
        Article article3 = new Article(1718, "bliki", "OrmHate", new ArrayList(Arrays.asList("nosql", "orm")));
        Article article4 = new Article(1313, "ruby", "ruby", new ArrayList(Arrays.asList("ddd")));

        ArrayList<Article> articles = new ArrayList(
                Arrays.asList(article1, article2, article3, article4)
        );

        Long countOfArticles = articles.stream().count();

        // Get the articles with nosql tag, sort them according to word count
        // and keep the first two elements in the resulting collection
        ArrayList sortedByWordsCount = (ArrayList) articles.stream()
                .filter(curr -> curr.getTags().contains("nosql"))
                .sorted(Comparator.comparingInt(Article::getWords))
                .limit(2)
                .collect(Collectors.toList());

        // The sum of the word counts in all articles using REDUCE
        Integer totalWordsCount = articles.stream()
                .map(curr -> curr.getWords())
                .reduce(0, (acc, curr) -> acc + curr);

        // The sum of the word counts in all articles using SUM
        Integer sumWordsCount = articles.stream()
                .mapToInt(curr -> curr.getWords())
                .sum();

        // Grouping by
        Map<String, List<Article>> groupedByType = articles.stream()
                .collect(Collectors.groupingBy(Article::getType));


        // Checking if the articles are ordered by word counts
        for (int i = 0; i < sortedByWordsCount.size(); i++) {
            Article currentArticle = (Article) sortedByWordsCount.get(i);
            System.out.println(currentArticle.getWords());
        }

        System.out.println("Number of articles = " + countOfArticles);
        System.out.println("The reduced words count = " + totalWordsCount);
        System.out.println("The sum of words count = " + sumWordsCount);
        System.out.println("Articles grouped by type: " + groupedByType);
    }

}
