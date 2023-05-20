package com.mag.ride.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mag.ride.entity.Ride;

public interface RideRepository extends JpaRepository<Ride, Long> {
	
	public List<Ride>  findByUserId(Long userId);

}
