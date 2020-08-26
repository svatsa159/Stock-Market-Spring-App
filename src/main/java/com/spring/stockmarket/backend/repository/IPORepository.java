package com.spring.stockmarket.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.stockmarket.backend.entity.IPO;

@Repository
public interface IPORepository extends CrudRepository<IPO, Integer> {

}
