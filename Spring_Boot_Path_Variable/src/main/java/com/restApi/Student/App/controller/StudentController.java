package com.restApi.Student.App.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	////SpringBoot RestApi to handle path variable - @PathVariable
	 //@PathVariable-->To bind template variable names to method arguent names
	@GetMapping("/student/{firstName}/{lastName}")
	public Strudent studentPathVariable(@PathVariable("firstName") String firstName, 
		   @PathVariable("lastName") String lastName)
	{
		return new Strudent(firstName,lastName);
	}

}
