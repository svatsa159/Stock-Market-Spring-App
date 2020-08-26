package com.spring.stockmarket.backend.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ipo")
public class IPO {
	public IPO() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToOne
	private Company company;
	@OneToOne
	private StockExchange stockExchange;
	private long price_per_share;
	private long number_of_shares;
	private LocalDateTime open_date_time;
	private String remarks;

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Company getCompany_name() {
		return company;
	}

	public void setCompany_name(Company company_name) {
		this.company = company_name;
	}

	public StockExchange getStockExchange() {
		return stockExchange;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setStockExchange(StockExchange stockExchange) {
		this.stockExchange = stockExchange;
	}

	public long getPrice_per_share() {
		return price_per_share;
	}

	public void setPrice_per_share(long price_per_share) {
		this.price_per_share = price_per_share;
	}

	public long getNumber_of_shares() {
		return number_of_shares;
	}

	public void setNumber_of_shares(long number_of_shares) {
		this.number_of_shares = number_of_shares;
	}

	public LocalDateTime getOpen_date_time() {
		return open_date_time;
	}

	public void setOpen_date_time(LocalDateTime open_date_time) {
		this.open_date_time = open_date_time;
	}

	public long getId() {
		return id;
	}
}
