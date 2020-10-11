package com.agp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker-test")
public class DockerDemoController {

	@GetMapping
	public String getHelloWorld() {
		return "I am using docker.. How cool ..!!!";
	}
	
}
