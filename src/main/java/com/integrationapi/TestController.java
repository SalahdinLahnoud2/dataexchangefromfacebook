package com.integrationapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/test")
	public String Test(@RequestParam(name="name", defaultValue="world") String name ) {
		return "test :  " + name;
	}	
	
	@GetMapping(value="/")
	public String home() {
		return "HI";
	}
	@GetMapping(value="/private")
	public String privateArea() {
		return "SORRY IT'S PRIVATE";
	}
	
}
