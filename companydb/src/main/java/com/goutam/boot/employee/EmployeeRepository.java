package com.goutam.boot.employee;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	List<Employee> findByCompanyCompanyname(String companyname);

	Employee findByEmpId(int empid);

}
