package com.CourseManagement.App.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.CourseManagement.App.Entity.courseManagement;
import com.CourseManagement.App.service.CourseService;

@RestController
public class CourseManagementController {
	@Autowired //This marks as which needs dependancy injection
	private CourseService courseService;
	
	@GetMapping("/course")
	public courseManagement getStudent()
	{   
		return new courseManagement("Spring","Spring Framework","Spring_Frmework Description",25000);
	}
	
	@GetMapping("/courses")
	public List<courseManagement> getCourses()
	{
		
		
		return courseService.getAllCourse();
		
	}
	
///*************************USING PATH VARIABLE*************************************///
////SpringBoot RestApi to handle path variable - @PathVariable
	 //@PathVariable-->To bind template variable names to method arguent names
     @RequestMapping("/topics/{id}")
	public courseManagement getTopic(@PathVariable String id) {
		return courseService.getCourseManagement(id);
	}
   
   //******************************ADD THE COURSE******************************//  
     //POST REQUEST
    // @RequestBody -> it would contain json format so Requestboddy takes this jason instane and convrts it to java 
     //instance and ads it to list
     @RequestMapping(method =RequestMethod.POST,value="/courses")
     public void addCourse(@RequestBody courseManagement course)
     
     {
    	 courseService.addcourse(course);
     }
     
 //*************UPDATE THE COURSE*****************************************//
     
     @RequestMapping(method=RequestMethod.PUT,value = "/courses/{id}")
     public void updatecourse(@RequestBody courseManagement course,@PathVariable String id)
     {
    	 courseService.updatecourse(id,course);
     }
     
    ////****************DELETE THE COURSE*********************************///
     @RequestMapping(method = RequestMethod.DELETE, value ="/courses/{id}")
 	public void deleteTopic(@PathVariable String id) {
 		courseService.delteTopic(id);
 	}
     
     
}
