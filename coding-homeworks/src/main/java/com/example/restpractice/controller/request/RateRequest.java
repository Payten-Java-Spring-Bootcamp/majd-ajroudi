package com.example.restpractice.controller.request;

import com.example.restpractice.service.Rate;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class RateRequest {

    @NotNull
    private Long memberId;

    @NotNull
    private Long movieId;

    @Min(1)
    @Max(2)
    @NotNull
    private Integer point;

    public Rate convertToRate() {
        return Rate.builder()
                .memberId(memberId)
                .movieId(movieId)
                .point(point)
                .build();
    }
}
