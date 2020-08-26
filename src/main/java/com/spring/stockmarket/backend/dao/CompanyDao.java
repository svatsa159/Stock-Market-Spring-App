package com.spring.stockmarket.backend.dao;

import com.spring.stockmarket.backend.entity.Company;
import com.spring.stockmarket.backend.exception.EntityExists;

public interface CompanyDao {
	public boolean AddCompany(Company company) throws EntityExists;

	// TODO Deactivate Company
//	public boolean deactivateCompany(Company company) throws EntityNotFound;

	// TODO Update IPO Related Data
//	public boolean updateIPO() throws EntityNotFound;
}
