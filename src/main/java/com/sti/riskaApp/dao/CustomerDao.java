package com.sti.riskaApp.dao;

import java.util.List;

import com.sti.riskaApp.model.Customer;

public interface CustomerDao {
	Customer getById(int id) throws Exception;
	Customer save(Customer customer) throws Exception;
	void delete(Customer customer) throws Exception;
	
	List<Customer> getList() throws Exception;
}
