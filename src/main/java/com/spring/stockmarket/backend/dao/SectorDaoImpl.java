package com.spring.stockmarket.backend.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.stockmarket.backend.entity.Sector;
import com.spring.stockmarket.backend.exception.EntityNotFound;
import com.spring.stockmarket.backend.repository.SectorRepository;

@Service
public class SectorDaoImpl implements SectorDao {

	@Autowired
	SectorRepository sectorRepository;

	@Override

	public Sector getSectorById(long id) throws EntityNotFound {
		Optional<Sector> sector = sectorRepository.findById(id);
		Sector returnSector = sector.orElse(null);
		if (returnSector == null) {
			throw new EntityNotFound();
		}
		return returnSector;
	}

}
