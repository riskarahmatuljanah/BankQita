package com.sti.riskaApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sti.riskaApp.dao.AccountDao;
import com.sti.riskaApp.dao.CustomerDao;
import com.sti.riskaApp.dao.TransactionDao;
import com.sti.riskaApp.dao.Impl.AccountDaoImpl;
import com.sti.riskaApp.dao.Impl.CustomerDaoImpl;
import com.sti.riskaApp.dao.Impl.TransactionDaoImpl;

@Configuration
public class DaoSpringConfig {
	
	@Bean
	public CustomerDao customerDao() {
		return new CustomerDaoImpl();
	}
	
	@Bean
	public AccountDao accountDao() {
		return new AccountDaoImpl();
	}
	
	@Bean
	public TransactionDao transactionDao() {
		return new TransactionDaoImpl();
	}
}
