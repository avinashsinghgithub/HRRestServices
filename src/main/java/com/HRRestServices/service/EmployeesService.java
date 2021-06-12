package com.HRRestServices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRRestServices.entity.Employee;
import com.HRRestServices.repository.EmployeeRepository;

@Service
public class EmployeesService {
	
@Autowired	
private EmployeeRepository repo; 
	public List<Employee> getEmployees() {
		List<Employee> posts = new ArrayList<Employee>();
		for(Employee employee : repo.findAll()) {
			posts.add(employee);
		}
		return posts;
	}
}
