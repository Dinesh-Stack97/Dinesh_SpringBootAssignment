package com.Employee.App.Employee_Api_Crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.App.Employee_Api_Crud.module.Employee;
import com.Employee.App.Employee_Api_Crud.repo.EmployeeDAo;



@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDAo empdao;
	
	@RequestMapping(value="/employee", method=RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addEmployee(@RequestBody Employee emp)
	{
		System.out.println(emp);
	}
	
	@GetMapping(path="/employee")
	public Employee getEmployee(@RequestParam(name ="id") Integer id)
	{
		
	   return	empdao.findById(id).get();
	}

}
