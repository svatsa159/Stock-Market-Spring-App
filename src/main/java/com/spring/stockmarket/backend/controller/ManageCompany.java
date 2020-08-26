package com.spring.stockmarket.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.stockmarket.backend.exception.EntityExists;
import com.spring.stockmarket.backend.exception.EntityNotFound;
import com.spring.stockmarket.backend.model.AddCompanyRequestWrapper;
import com.spring.stockmarket.backend.service.CompanyServiceImpl;

@RestController
@RequestMapping("/manage_company")
public class ManageCompany {
	@Autowired
	CompanyServiceImpl companyServiceImpl;

	@PostMapping("/add/")
	public ResponseEntity<Object> addCompany(@RequestBody AddCompanyRequestWrapper manageCompanyRequestWrapper) {

		try {
			companyServiceImpl.AddCompanywithSector(manageCompanyRequestWrapper.company,
					manageCompanyRequestWrapper.sector_id);
		} catch (EntityExists e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} catch (EntityNotFound e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		return ResponseEntity.ok(null);
	}

}
