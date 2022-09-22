package com.example.demo.cruddemo.dao;

import java.util.List;


import com.example.demo.cruddemo.entity.*;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
		
}


