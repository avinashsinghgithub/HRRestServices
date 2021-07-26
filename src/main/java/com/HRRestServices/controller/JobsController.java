package com.HRRestServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HRRestServices.entity.Job;
import com.HRRestServices.service.JobsService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class JobsController {
	
	@Autowired
	private JobsService jobsService ;
	@RequestMapping(path = "/jobs")
	public List<Job> getJobs() {
		return jobsService.getJobs();
	}

}
