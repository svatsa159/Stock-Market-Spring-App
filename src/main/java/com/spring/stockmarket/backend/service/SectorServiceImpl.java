package com.spring.stockmarket.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.stockmarket.backend.dao.SectorDaoImpl;
import com.spring.stockmarket.backend.entity.Sector;
import com.spring.stockmarket.backend.exception.EntityNotFound;

@Service
public class SectorServiceImpl implements SectorService {

	@Autowired
	SectorDaoImpl sectorDaoImpl;

	@Override

	public Sector getSectorById(long id) throws EntityNotFound {
		return sectorDaoImpl.getSectorById(id);
	}

}
