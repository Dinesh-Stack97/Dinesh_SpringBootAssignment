package com.restApi.Student.App.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restApi.Student.App.Entity.Strudent;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Strudent getStudent()
	{   
		return new Strudent("Dinesh","Kumar");
	}
	
	@GetMapping("/students")
	public List<Strudent> getStudents()
	{
		List<Strudent> students = new ArrayList<>();
		students.add(new Strudent("Dinesh", "Kumar"));
		students.add(new Strudent("Rakesh", "Kumar"));
		students.add(new Strudent("Shiva", "Kumar"));
		students.add(new Strudent("suresh", "Kumar"));
		students.add(new Strudent("Thor", "Rangork"));
		
		return students;
		
	}
	
//Spring Boot REST APIMwith Request Param ----> @RequestParam
	//Build a rest API to handle query parameters
	//http:localhost:8080/student?firstName=ramesh&lastName=kumar
	@GetMapping("/student/query")
	//this annotation is used to bind method parameter should be bound to a web request parameter
	public Strudent studentQueryParam(@RequestParam("firstName") String firstName,
		  @RequestParam("lastName")	String lastName)
	{
		return new Strudent(firstName, lastName);
	}
	
	
	

}
