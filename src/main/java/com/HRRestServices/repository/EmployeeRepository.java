package com.HRRestServices.repository;
import org.springframework.data.repository.CrudRepository;

import com.HRRestServices.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
