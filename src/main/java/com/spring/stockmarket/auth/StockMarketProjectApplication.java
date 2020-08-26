package com.spring.stockmarket.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.spring.stockmarket.*")
@EntityScan("com.spring.stockmarket.*")
//@RepositoryScan("com.spring.stockmarket.*")
@ComponentScan("com.spring.stockmarket")
public class StockMarketProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockMarketProjectApplication.class, args);
	}

}
