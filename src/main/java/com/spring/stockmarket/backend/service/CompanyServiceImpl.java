package com.spring.stockmarket.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.stockmarket.backend.dao.CompanyDaoImpl;
import com.spring.stockmarket.backend.entity.Company;
import com.spring.stockmarket.backend.entity.Sector;
import com.spring.stockmarket.backend.exception.EntityExists;
import com.spring.stockmarket.backend.exception.EntityNotFound;

@Service
@Transactional(rollbackFor = EntityNotFound.class)
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyDaoImpl companyDaoImpl;
	@Autowired
	SectorServiceImpl sectorServiceImpl;

	@Override
	public boolean AddCompanywithSector(Company company, long sector_id) throws EntityExists, EntityNotFound {
//		companyDaoImpl.AddCompany(company);
		Sector sector = sectorServiceImpl.getSectorById(sector_id);
		company.setSector(sector);
		companyDaoImpl.AddCompany(company);
		return false;
	}

}
