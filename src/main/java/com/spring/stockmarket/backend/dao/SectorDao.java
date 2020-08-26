package com.spring.stockmarket.backend.dao;

import com.spring.stockmarket.backend.entity.Sector;
import com.spring.stockmarket.backend.exception.EntityNotFound;

public interface SectorDao {
	public Sector getSectorById(long id) throws EntityNotFound;
}
