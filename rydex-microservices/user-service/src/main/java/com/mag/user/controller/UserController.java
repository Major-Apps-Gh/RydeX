package com.mag.user.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mag.user.VO.ResponseTemplateVO;
import com.mag.user.entity.User;
import com.mag.user.service.UserService;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;

@RestController
@RequestMapping("api/v1/users/")
@RequiredArgsConstructor
public class UserController {
	

	
	final private UserService userService;
	
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
 	@GetMapping
    public String get() {
        return "GET:: ride controller";
    }
 	
	@GetMapping("{userId}")
    public ResponseTemplateVO getUserWithRides(@PathVariable("userId")Long userId) {
		
        LOGGER.info("Get User with Rides by: {}", userId);

        return userService.getUserRides(userId);
    }
 	
    @PostMapping
    public String post() {
        return "POST:: ride controller";
    }
    
    @PostMapping("user")
    public User addUser(@RequestBody User user) {
    	
        LOGGER.info("User add: {}", user);

        return userService.saveUser(user);
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
