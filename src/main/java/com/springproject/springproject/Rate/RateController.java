package com.springproject.springproject.Rate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rating")
public class RateController {
    private final RateService rateService;

    @Autowired
    public RateController(RateService rateService){
        this.rateService = rateService;
    }
    @GetMapping
    public List<Rate> getRating(){
        return rateService.getRating();
    }

    @PostMapping
    public void addRating(@RequestBody Rate rate){
        rateService.addRating(rate);
    }

}
