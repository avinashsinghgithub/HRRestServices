package com.HRRestServices.repository;

import org.springframework.data.repository.CrudRepository;

import com.HRRestServices.entity.Employee;
import com.HRRestServices.entity.Job;

public interface JobRepository extends CrudRepository<Job,Integer>{

}
