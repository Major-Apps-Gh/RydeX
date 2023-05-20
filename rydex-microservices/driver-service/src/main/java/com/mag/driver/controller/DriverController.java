package com.mag.driver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mag.driver.VO.ResponseTemplateVO;
import com.mag.driver.entity.Driver;
import com.mag.driver.service.DriverService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/drivers/")
public class DriverController {
	
	@Autowired
	DriverService driveService;
	
    private static final Logger LOGGER = LoggerFactory.getLogger(DriverController.class);
	
 	@GetMapping
    public String get() {
        return "GET:: ride controller";
    }
 	
	@GetMapping("{driverId}")
    public ResponseTemplateVO getDriverWithRides(@PathVariable("driverId")Long driverId) {
		
        LOGGER.info("Get Driver with Rides by: {}", driverId);

        return driveService.getDriverRides(driverId);
    }
 	
    @PostMapping
    public String post() {
        return "POST:: ride controller";
    }
    
    @PostMapping("driver")
    public Driver addDriver(@RequestBody Driver driver) {
    	
        LOGGER.info("Driver add: {}", driver);

        return driveService.saveDriver(driver);
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
