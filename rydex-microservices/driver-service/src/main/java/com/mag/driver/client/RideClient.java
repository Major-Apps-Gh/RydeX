package com.mag.driver.client;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.mag.api.commons.model.Ride;

@HttpExchange
public interface RideClient {

	@GetExchange("/ride/driver/{driverId}")
	public List<Ride> findByDriver(@PathVariable("driverId") Long driverId);
}
