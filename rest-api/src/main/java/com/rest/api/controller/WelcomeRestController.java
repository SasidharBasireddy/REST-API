package com.rest.api.controller;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcome(){
		String respPayload = "Welcome to Rest API.";
		return new ResponseEntity<String>(respPayload, HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public ResponseEntity<String> getGreetMsg(){
		int hour = LocalTime.now().getHour();
		String respPayload = "";
		if(hour >= 6 && hour < 12) respPayload = "Good Morning";
		else if(hour<=12 && hour<17) respPayload = "Good Afternood";
		else if(hour<=17 && hour>19) respPayload = "Good Evening";
		else respPayload = "Good Night";
		return new ResponseEntity<String>(respPayload, HttpStatus.OK);
	}
}
