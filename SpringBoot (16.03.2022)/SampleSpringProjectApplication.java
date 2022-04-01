package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringProjectApplication.class, args);
		System.out.println("hello");
	}

}
