package com.goutam.boot.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	
	@Autowired
	CompanyService compservice;

	@RequestMapping("/company")
	public List<Company> getAllCompany(){
		return compservice.getAllCompany();
		
	} 
	
	@RequestMapping("/company/{companyname}")
	public Company getCompany(@PathVariable String companyname) {
		return compservice.getCompany(companyname);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/company")
	public void addCompany(@RequestBody Company company) {
		compservice.addCompany(company);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/company/{companyname}")
	public void updateCompany(@RequestBody Company company) {
		compservice.updateCompany(company);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/company/{companyname}")
	public void deleteCompany(@PathVariable String companyname) {
		compservice.deleteCompany(companyname);
	}
}
