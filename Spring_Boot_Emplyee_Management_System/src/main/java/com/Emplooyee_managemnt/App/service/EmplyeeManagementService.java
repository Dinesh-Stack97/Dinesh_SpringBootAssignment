package com.Emplooyee_managemnt.App.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


import com.Emplooyee_managemnt.App.model.Employee;

@Service
public class EmplyeeManagementService {
	
	private List<Employee> employees = new ArrayList<>(Arrays.asList(
	           new Employee ("1","Dinesh",25000,"dinesh@gmail.com","banglore"),
	           new Employee("2","jadav",25000,"jadav@gmail.com","banglore"),
             new Employee("3","karthik",25000,"karthik@gmail.com","banglore"),
    	new Employee("4","sharath",25000,"sarath@gmail.com","banglore"),
	             new Employee("5","suresh",25000,"suresh@gmail.com","banglore")));

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	public Employee getEmployee(String id) {
		// TODO Auto-generated method stub
		 return employees.stream().filter(t -> t.getEmpId().equals(id)).findFirst().get();
	}

	public void addEmployee(Employee emp2) {
		employees.add(emp2);
		
	}

	public void updateEmployee(String id, Employee emp2) {
		// TODO Auto-generated method stub
		for(int i=0;i< employees.size();i++)
		{
			Employee e = employees.get(i);
			if(e.getEmpId().equals(id))
			{
				employees.set(i,emp2 );
				return;
			}
		}
		
	}

	public void delteEmployee(String id) {
		// TODO Auto-generated method stub
		employees.removeIf(t -> t.getEmpId().equals(id));
	}
	
	

}
