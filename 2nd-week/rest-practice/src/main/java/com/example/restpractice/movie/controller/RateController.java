package com.example.restpractice.movie.controller;

import com.example.restpractice.movie.controller.request.RateRequest;
import com.example.restpractice.movie.controller.response.RateResponse;
import com.example.restpractice.movie.service.Movie;
import com.example.restpractice.movie.service.Rate;
import com.example.restpractice.movie.service.RateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class RateController {

    private final RateService rateService;

    @PostMapping("/rates")
    public void rate(@RequestBody @Valid RateRequest rateRequest) {
        Rate rate = rateRequest.convertToRate();
        rateService.rateToMovie(rate);
    }

    @GetMapping("/rates")
    public List<RateResponse> retrieveByMovieId(@RequestParam Long movieId) {
        List<Rate> rateList = rateService.retrieveByMovieId(movieId);
        return RateResponse.convertFromRate(rateList);
    }
}