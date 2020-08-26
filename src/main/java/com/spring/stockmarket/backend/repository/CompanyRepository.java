package com.spring.stockmarket.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.stockmarket.backend.entity.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {

}
