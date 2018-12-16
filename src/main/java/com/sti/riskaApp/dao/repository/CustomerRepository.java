package com.sti.riskaApp.dao.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sti.riskaApp.model.Customer;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {
	//Customer findBycustomerNumber(int customerNumber);
	
}
