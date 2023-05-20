package com.mag.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mag.api.commons.model.Ride;
import com.mag.user.VO.ResponseTemplateVO;
import com.mag.user.entity.User;
import com.mag.user.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		
		log.info("Inside saveUser of UserService");

		return userRepository.save(user);
	}

	public Optional<User> findUserById(Long userId) {
		log.info("Inside findUserById of UserService");

		return userRepository.findById(userId);
	}

	public ResponseTemplateVO getUserRides(Long userId) {
		
		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
		
		Optional<User> optionalValue = userRepository.findById(userId);
		
		
		if (optionalValue.isPresent()) {
			
		    User user = optionalValue.get();
		    
		    System.out.println(optionalValue); 
		    
		    Ride ride = restTemplate.getForObject("http://RIDE-SERVICE/api/v1/rides/"+user.getId(),
					Ride.class);
			
			responseTemplateVO.setRide(ride);
		}
		
		
		
		return responseTemplateVO;
		
	}

	

}

