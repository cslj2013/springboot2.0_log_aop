package com.springboot2.second;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

	@RequestMapping("/second")
	public String second() {
		return "second test";
	}
}
