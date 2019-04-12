package com.goutam.boot.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.goutam.boot.company.Company;

@Entity
public class Employee {

	@Id
	private int empId;
	private String name;
	private Long mobile;
	private String emailid;
	@ManyToOne
	private Company company;

	public Employee() {
	}

	public Employee(int empId, String name, Long mobile, String emailid, Company company) {
		super();
		this.empId = empId;
		this.name = name;
		this.mobile = mobile;
		this.emailid = emailid;
		this.company = company;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
