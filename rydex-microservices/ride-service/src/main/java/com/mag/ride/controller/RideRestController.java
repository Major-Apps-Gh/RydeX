package com.mag.ride.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mag.ride.entity.Ride;
import com.mag.ride.service.RideService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/rides")
@RequiredArgsConstructor
public class RideRestController {
	@Autowired
	private RideService rideService;
	
	 	@GetMapping
	    public String get() {
	        return "GET:: ride controller";
	    }
	 	
		@GetMapping("/{userId}")
	    public List<Ride> getRidesByUserId(@PathVariable("userId")Long userId) {
	        return rideService.findByUserId(userId);
	    }
	 	
	    @PostMapping
	    public String post() {
	        return "POST:: ride controller";
	    }
	    
	    @PutMapping
	    public String put() {
	        return "PUT:: ride controller";
	    }
	    
	    @DeleteMapping
	    public String delete() {
	        return "DELETE:: ride controller";
	    }

}
