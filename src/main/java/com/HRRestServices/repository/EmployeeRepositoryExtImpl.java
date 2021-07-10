package com.HRRestServices.repository;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.HRRestServices.entity.Employee;

@RestController
public class EmployeeRepositoryExtImpl implements EmployeeRepositoryExt {

	 @Autowired
	    EntityManager entityManager;

	public EmployeeRepositoryExtImpl(){
	 System.out.println("EmployeeRepositoryExtImpl object instantiated");
	 }
		@Override
		public List<Employee> getEmployeesFromRange(Integer index, Integer max) {
			TypedQuery<Employee> query = entityManager.createQuery("from Employee",Employee.class);
	        query.setFirstResult(index);  
	        query.setMaxResults(max);  
	        List<Employee> employees = query.getResultList();
	        for (int i = 0; i < employees.size(); i++) {
	      
	        }
	        return employees;
		}
}
