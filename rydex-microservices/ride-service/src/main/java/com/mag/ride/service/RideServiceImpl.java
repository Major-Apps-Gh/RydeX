package com.mag.ride.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mag.ride.entity.Ride;
import com.mag.ride.repository.RideRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RideServiceImpl implements RideService{
	@Autowired
	private RideRepository rideRepository;
	public List<Ride>  findByUserId(Long userId){
		
		return rideRepository.findByUserId(userId);
		
	}

}
