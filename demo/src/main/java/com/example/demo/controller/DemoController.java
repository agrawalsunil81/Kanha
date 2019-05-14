package com.example.demo.controller;


import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;


@RestController
@RequestMapping("/")
public class DemoController {
	
	
	@Autowired
	private DemoService demoService;
	
	@GetMapping()
	@RequestMapping(value="/getUserDetail")
	public String getUSer() {
		return "User Demo"; 
	}
	
	
}
