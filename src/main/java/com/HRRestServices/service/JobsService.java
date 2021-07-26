package com.HRRestServices.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRRestServices.entity.Employee;
import com.HRRestServices.entity.Job;
import com.HRRestServices.repository.JobRepository;

@Service
public class JobsService {
	
	@Autowired
	private JobRepository repo;
	
	public List<Job> getJobs() {
		List<Job> jobList = new ArrayList<Job>();
		//Iterator<Employee> itr = repo.findAll().iterator();
		
		for(Job job : repo.findAll()){
			jobList.add(job);
		}
		
		return jobList;
	}

}
