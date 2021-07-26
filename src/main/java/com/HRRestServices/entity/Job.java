package com.HRRestServices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobs")
public class Job {
	@Id
	@Column(name = "JOB_ID")
	private String jobId;
	@Column(name = "JOB_TITLE")
	private String jobTitle;
	@Column(name = "MIN_SALARY")
	private long minSalary;
	@Column(name = "MAX_SALARY")
	private long maxSalary;
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public long getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(long minSalary) {
		this.minSalary = minSalary;
	}
	public long getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(long maxSalary) {
		this.maxSalary = maxSalary;
	}
}
