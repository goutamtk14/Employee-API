package com.goutam.boot.company;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

	@Autowired
	CompanyRepository comprepository;

	public List<Company> getAllCompany() {
		return (List<Company>) comprepository.findAll();
	}

	public void addCompany(Company company) {
		comprepository.save(company);

	}

	public Company getCompany(String companyname) {
		Optional<Company> c=comprepository.findById(companyname);
		return (Company)c.get();
	}

	public void updateCompany(Company company) {
		comprepository.save(company);
		
	}

	public void deleteCompany(String companyname) {
		comprepository.deleteById(companyname);
	}

}
