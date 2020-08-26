package com.spring.stockmarket.backend.service;

import com.spring.stockmarket.backend.entity.Sector;
import com.spring.stockmarket.backend.exception.EntityNotFound;

public interface SectorService {
	public Sector getSectorById(long id) throws EntityNotFound;
}
