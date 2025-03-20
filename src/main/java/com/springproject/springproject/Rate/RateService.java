package com.springproject.springproject.Rate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RateService {
    private final RateRepository rateRepository;
    @Autowired
    public RateService(RateRepository rateRepository){
        this.rateRepository = rateRepository;
    }
    public List<Rate> getRating(){
        return rateRepository.findAll();
    }
    public void addRating(Rate rate){
        rateRepository.save(rate);
    }

}
