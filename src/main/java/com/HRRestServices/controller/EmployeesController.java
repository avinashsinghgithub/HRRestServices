package com.HRRestServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HRRestServices.entity.Employee;
import com.HRRestServices.service.EmployeesService;


@RestController
public class EmployeesController {

	@Autowired
	private EmployeesService service;
	@RequestMapping("/employees")
	public List<Employee> getEmployees() {
		return this.service.getEmployees();
	}
}
