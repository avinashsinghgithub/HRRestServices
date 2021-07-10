package com.HRRestServices.repository;
import java.util.List;

import com.HRRestServices.entity.Employee;
public interface EmployeeRepositoryExt {
	
	public List<Employee> getEmployeesFromRange(Integer index, Integer total);
	

}
