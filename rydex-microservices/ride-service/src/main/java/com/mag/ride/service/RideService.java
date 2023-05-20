package com.mag.ride.service;

import java.util.List;

import com.mag.ride.entity.Ride;

public interface RideService {
	
	public List<Ride>  findByUserId(Long userId);

}
