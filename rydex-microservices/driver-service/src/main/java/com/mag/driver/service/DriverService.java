package com.mag.driver.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mag.driver.VO.ResponseTemplateVO;
import com.mag.driver.entity.Driver;



public interface DriverService {
	
	public Driver saveDriver(Driver user);

	public Optional<Driver> findDriverById(Long driverId) ;

	public ResponseTemplateVO getDriverRides(Long driverId) ;

}
