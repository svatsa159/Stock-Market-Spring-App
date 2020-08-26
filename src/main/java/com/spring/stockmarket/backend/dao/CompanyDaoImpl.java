package com.spring.stockmarket.backend.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.spring.stockmarket.backend.entity.Company;
import com.spring.stockmarket.backend.exception.EntityExists;
import com.spring.stockmarket.backend.repository.CompanyRepository;

@Service
public class CompanyDaoImpl implements CompanyDao {

	@Autowired
	CompanyRepository companyRepository;

	@Override
	public boolean AddCompany(Company company) throws EntityExists {
		try {
			companyRepository.save(company);
			return true;
		} catch (DataIntegrityViolationException e) {
			throw new EntityExists();
		}
	}

}
