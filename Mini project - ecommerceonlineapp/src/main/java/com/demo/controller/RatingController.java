package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.demo.pojo.Rating;
import com.demo.serviceipl.RatingServiceImp;

@RestController
@RequestMapping("/rate")
public class RatingController {
	
	
	@Autowired
	RatingServiceImp rateServImp;
	
	@PostMapping(value = "/addrating")
	public String addRatingDetails(@RequestBody Rating rate) {
		Rating r = rateServImp.addRatingDetails(rate);
		
		if(r!=null) {
			return "inserted successfully";
		}
		else {
			return "not inserted";
		}
	}
	
	@PostMapping(value = "/addratingwithproduct")
	public Rating saveRating(@RequestBody Rating rate) {
		
		Rating r = rateServImp.saveRating(rate);
		
		return r;
		
	}

}
