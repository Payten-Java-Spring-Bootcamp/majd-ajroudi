package com.example.restpractice.service;

import com.example.restpractice.repository.MovieEntity;
import com.example.restpractice.repository.RateEntity;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@EqualsAndHashCode
public class Rate {

    private LocalDateTime createdDate;
    private Long memberId;
    private Long movieId;
    private Integer point;

    public RateEntity convertToRateEntity(MovieEntity movieEntity) {
        RateEntity entity = new RateEntity();
        entity.setCreatedDate(LocalDateTime.now());
        entity.setMemberId(memberId);
        entity.setMovie(movieEntity);
        entity.setPoint(point);
        return entity;
    }

    public static Rate convertFromRateEntity(RateEntity entity) {
        return Rate.builder()
                .createdDate(entity.getCreatedDate())
                .memberId(entity.getMemberId())
                .movieId(entity.getMemberId())
                .point(entity.getPoint())
                .build();
    }
}

