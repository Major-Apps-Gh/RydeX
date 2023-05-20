package com.mag.driver.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mag.driver.entity.Driver;


public interface DriverRepository extends JpaRepository<Driver, Long>{
	
	Optional<Driver> findById(Long driverId);


}
