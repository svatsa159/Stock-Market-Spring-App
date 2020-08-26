package com.spring.stockmarket.backend.service;

import com.spring.stockmarket.backend.entity.Company;
import com.spring.stockmarket.backend.exception.EntityExists;
import com.spring.stockmarket.backend.exception.EntityNotFound;

public interface CompanyService {
	public boolean AddCompanywithSector(Company company, long sector_id) throws EntityExists, EntityNotFound;

}
