package com.goutam.boot.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository emprepository;

	public List<Employee> getAllEmployees(String companyname) {
		return emprepository.findByCompanyCompanyname(companyname);
	}

	public void addEmployee(Employee employee) {
		emprepository.save(employee);
	}

	public Employee getEmployee(int empid) {
		return emprepository.findByEmpId(empid);
	}

	public void updateEmployee(Employee employee) {
		emprepository.save(employee);
	}

	public void deleteEmployee(int empid) {
		emprepository.deleteById(empid);
	}

}
