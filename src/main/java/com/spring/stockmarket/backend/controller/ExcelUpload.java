package com.spring.stockmarket.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.spring.stockmarket.backend.exception.ExcelFormatErrorException;
import com.spring.stockmarket.backend.service.ExcelUploadHelper;
import com.spring.stockmarket.backend.service.ExcelUploadServiceImpl;

@RestController
@RequestMapping("/excel_upload")
public class ExcelUpload {

	@Autowired
	ExcelUploadServiceImpl excelUploadServiceImpl;

	@PostMapping
	public ResponseEntity<Object> uploadExcel(@RequestParam("file") MultipartFile file) {
		if (ExcelUploadHelper.hasExcelFormat(file)) {
			try {
				excelUploadServiceImpl.uploadExcelStockPrices(file);
			} catch (ExcelFormatErrorException e) {

				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
			}
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload correct file");
		}
		return null;

	}
}
