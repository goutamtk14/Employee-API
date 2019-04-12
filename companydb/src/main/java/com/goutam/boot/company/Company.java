package com.goutam.boot.company;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {

	@Id
	private String companyname;
	private String location;
	private String industry;

	public Company() {
	}

	public Company(String companyname, String location, String industry) {
		super();
		this.companyname = companyname;
		this.location = location;
		this.industry = industry;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

}
