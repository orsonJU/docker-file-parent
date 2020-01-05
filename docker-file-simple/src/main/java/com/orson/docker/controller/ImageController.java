package com.orson.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class ImageController {
	
	
	@GetMapping("/simple")
	public String simple() {
		return "Hello, this is from docker-file-simple";
	}
}
