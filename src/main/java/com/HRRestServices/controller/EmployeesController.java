package com.HRRestServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.HRRestServices.entity.Employee;
import com.HRRestServices.service.EmployeesService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeesController {

	@Autowired
	private EmployeesService service;
	
	@RequestMapping(value = "/employees", 
					method=RequestMethod.GET,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployees() {
		return this.service.getEmployees();
	}
	@RequestMapping(value = "/employees/range", 
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployeeByFromRange(@RequestParam Integer start,@RequestParam Integer range) {
		System.out.println("getEmployeeByFromRange method called in controller");
		return this.service.getEmployeeByFromRange(start,range);
	}
	@RequestMapping(value = "/employees/{id}", 
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeById(@PathVariable int id) {
		return this.service.getEmployeeById(id);
	}
	
}
