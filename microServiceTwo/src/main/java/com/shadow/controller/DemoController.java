package com.shadow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shadow.service.message.MessagingService;

/*
 * @Author Satyam Pandey
 * @Description Rest Controller to test working of micro service 2
 * */
@CrossOrigin
@RequestMapping("/")
@RestController
public class DemoController {

	@Autowired
	private MessagingService service;
	
	/*
	 * @Author Satyam Pandey
	 * @Return JSON consisting of message & sender info
	 * */
	@GetMapping
	public ResponseEntity<?> sendMessage(){
		return ResponseEntity.ok(service.message("Micro Service Two"));
	}
	
}
