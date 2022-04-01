package com.springboot.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
@GetMapping("/Student")
public Student getstudent()
{
	return new Student("KadhalMannan","MuthuKrishnan");
}
@GetMapping("/Students")
public List<Student> getstudents()
{
	List<Student>s=new ArrayList<>();
	s.add(new Student("Naveen","kumar"));
	s.add(new Student("mani","gandan"));
	s.add(new Student("subash","raj"));
	return s;
}
}
