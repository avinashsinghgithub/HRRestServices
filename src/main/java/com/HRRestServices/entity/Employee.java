package com.HRRestServices.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@Column(name ="EMPLOYEE_ID")
	Integer employeeId;
	@Column(name ="FIRST_NAME")
	String firstName;
	@Column(name ="LAST_NAME")
	String lastName;
	@Column(name ="EMAIL")
	String email;
	@Column(name ="PHONE_NUMBER")
	String phoneNumber;
	@Column(name ="HIRE_DATE")
	Date hireDate;
	@Column(name ="JOB_ID")
	String jobId;
	@Column(name ="SALARY")
	Float salary;
	@Column(name ="COMMISSION_PCT")
	Float commissionPct;
	@Column(name ="MANAGER_ID")
	Integer managerId;
	@Column(name ="DEPARTMENT_ID")
	Integer departmentId;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="manager_id")
//	private Employee manager;
//	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy="manager")
//	private Set<Employee> subordinates = new HashSet<Employee>();
	
//	public Employee getManager() {
//		return manager;
//	}
//	public void setManager(Employee manager) {
//		this.manager = manager;
//	}
//	public Set<Employee> getSubordinates() {
//		return subordinates;
//	}
//	public void setSubordinates(Set<Employee> subordinates) {
//		this.subordinates = subordinates;
//	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public Float getCommissionPct() {
		return commissionPct;
	}
	public void setCommissionPct(Float commissionPct) {
		this.commissionPct = commissionPct;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

}
