package com.Employee.App.Employee_Api_Crud.repo;

import org.springframework.data.repository.CrudRepository;

import com.Employee.App.Employee_Api_Crud.module.Employee;

public interface EmployeeDAo extends CrudRepository<Employee, Integer> {

}
