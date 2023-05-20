package com.mag.driver.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mag.api.commons.model.Ride;
import com.mag.driver.VO.ResponseTemplateVO;
import com.mag.driver.client.RideClient;
import com.mag.driver.entity.Driver;
import com.mag.driver.repository.DriverRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DriverServiceImpl implements DriverService {
	@Autowired
	DriverRepository driverRepository;
	
	@Autowired
	private RideClient rideClient;

	public Driver saveDriver(Driver driver) {
		
		log.info("Inside saveDriver of DriverService");

		return driverRepository.save(driver);
	}

	public Optional<Driver> findDriverById(Long driverId) {
		log.info("Inside findDriverById of DriverService");

		return driverRepository.findById(driverId);
	}

	public ResponseTemplateVO getDriverRides(Long driverId) {
		
		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
		
		Optional<Driver> optionalValue = driverRepository.findById(driverId);
		
		
		if (optionalValue.isPresent()) {
			
		    Driver driver = optionalValue.get();
		    
		    System.out.println(optionalValue); 
//		    
		    List<Ride> driverRides=rideClient.findByDriver(driverId);
		    
		    responseTemplateVO.setDriver(driver);
			
			responseTemplateVO.setRides(driverRides);
		}
		
		
		
		return responseTemplateVO;
		
	}

}
