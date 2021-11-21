package com.Emplooyee_managemnt.App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.Emplooyee_managemnt.App.model.Employee;
import com.Emplooyee_managemnt.App.service.EmplyeeManagementService;

public class EmpManagemntController {
	
	
	@Autowired //This marks as which needs dependancy injection
	private EmplyeeManagementService empService;
	
	@GetMapping("/course")
	public Employee getemployee()
	{   
		return new Employee("1","Dinesh",25000,"dinesh@gmail.com","banglore");
	}
	
	@GetMapping("/courses")
	public List<Employee> getCourses()
	{
		
		
		return empService.getAllEmployees();
		
	}
	
///*************************USING PATH VARIABLE*************************************///
////SpringBoot RestApi to handle path variable - @PathVariable
	 //@PathVariable-->To bind template variable names to method arguent names
     @RequestMapping("/topics/{id}")
	public Employee getTopic(@PathVariable String id) {
		return empService.getEmployee(id);
	}
   
   //******************************ADD THE COURSE******************************//  
     //POST REQUEST
    // @RequestBody -> it would contain json format so Requestboddy takes this jason instane and convrts it to java 
     //instance and ads it to list
     @RequestMapping(method =RequestMethod.POST,value="/courses")
     public void addCourse(@RequestBody Employee emp)
     
     {
    	 empService.addEmployee(emp);
     }
     
 //*************UPDATE THE COURSE*****************************************//
     
     @RequestMapping(method=RequestMethod.PUT,value = "/courses/{id}")
     public void updatecourse(@RequestBody Employee emp,@PathVariable String id)
     {
    	 empService.updateEmployee(id,emp);
     }
     
    ////****************DELETE THE COURSE*********************************///
     @RequestMapping(method = RequestMethod.DELETE, value ="/courses/{id}")
 	public void deleteTopic(@PathVariable String id) {
 		empService.delteEmployee(id);
 	}
     
     
}