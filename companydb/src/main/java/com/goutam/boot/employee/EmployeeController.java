package com.goutam.boot.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.goutam.boot.company.Company;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empservice;
	

	@RequestMapping("/company/{companyname}/employees")
	public List<Employee> getAllEmployees(@PathVariable String companyname){
		return empservice.getAllEmployees(companyname);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/company/{companyname}/employees")
	public void addEmployee(@RequestBody Employee employee, @PathVariable String companyname) {
		employee.setCompany(new Company(companyname,"Bangalore","Software"));
		empservice.addEmployee(employee);
	}
	
	@RequestMapping(value="/company/{companyname}/employees/{empid}")
	public Employee getEmployee(@PathVariable int empid) {
		return empservice.getEmployee(empid);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/company/{companyname}/employees/{empid}")
	public void updateEmployee(@RequestBody Employee employee) {
		 empservice.updateEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/company/{companyname}/employees/{empid}")
	public void deleteEmployee(@PathVariable int empid) {
		empservice.deleteEmployee(empid);
	}
}
