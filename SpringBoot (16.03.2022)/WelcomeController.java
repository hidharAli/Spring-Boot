package com.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController 
{
@GetMapping("/welcome")
public String welcome()
{
	return "hi welcome to spring boot application";
}
@GetMapping("/font")
public String font()
{
	return "<h10> hi welcome to spring boot application <h10>";
}
}
