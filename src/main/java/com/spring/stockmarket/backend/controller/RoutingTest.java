package com.spring.stockmarket.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.stockmarket.backend.dao.StockExchangeDao;
import com.spring.stockmarket.backend.repository.CompanyRepository;
import com.spring.stockmarket.backend.repository.SectorRepository;
import com.spring.stockmarket.backend.repository.StockExchangeRepository;
import com.spring.stockmarket.backend.service.StockExchangeServiceImpl;

@RestController
@RequestMapping("/testing")
public class RoutingTest {

	@Autowired
	SectorRepository srp;
	@Autowired
	CompanyRepository crp;
	@Autowired
	StockExchangeRepository strp;
	@Autowired
	StockExchangeDao srvc;
	@Autowired
	StockExchangeServiceImpl impl;

	@GetMapping
	public String adddata() {
//		Sector x = new Sector("Finance", "Finance Sector");
//		Optional<Sector> x = srp.findById((long) 2);
//		x.ifPresent(sector -> {
//			Company comp = new Company("Company3", 300000, "QAZ", "Q, A, Z", sector, "lorem ipsum");
//			crp.save(comp);
//		});
//		srp.save(x);
//		Optional<Company> comp = crp.findById((long) 5);
//		comp.ifPresent(com -> {
//			List<StockExchange> st = com.getStock_exchanges();
//			Optional<StockExchange> stckexchng = strp.findById((long) 2);
//			stckexchng.ifPresent(xchng -> {
//				st.add(xchng);
//				com.setStock_exchanges(st);
//				crp.save(com);
//			});
//
//		});
//		return strp.getStockExchangeByName("BSE");
//		StockExchange exchange = new StockExchange("PLM", "PLM", "Delhi", "Lorem Ipsum");
//
//		try {
//		srvc.deleteStockExchange(exchange);
//		} catch (IllegalArgumentException e) {
//			System.out.println(e);
//			return false;
//		}
//		strp.save(exchange);
//		try {
//			impl.addStockExchange("PLM", "PLM", "Delhi", "Lorem Ipsum");
//		} catch (StockExchangeExists e) {
//			return "Stock Exchange Exists";
//		}
//		System.out.println(impl.getAllStockExchanges());
//		System.out.println(impl.removeStockExchange("PLM"));
//		try {
//			System.out.println(impl.removeStockExchange("NNN"));
//		} catch (StockExchangeNotFound e) {
//			//
//			return "not found";
//		}
		return "hi";
	}
}
