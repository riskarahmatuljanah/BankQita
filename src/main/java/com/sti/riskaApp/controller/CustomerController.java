package com.sti.riskaApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sti.riskaApp.model.Customer;
import com.sti.riskaApp.dao.CustomerDao;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerDao customerDao;

	@GetMapping("/get")
	public String hello (@RequestParam (value="id", defaultValue="") int id) {
		try {
			Customer customer = customerDao.getById(id);
			if(customer== null) {
				return "data tidak ditemukan";
				
			} else {
				return "hello " +customer.getFirstName();
			}
			
		} catch (NumberFormatException e) {
			return "salah format input";
			
		} catch (Exception e) {
			return String.format("terjadi kesalahan : %s", e.getMessage());
		}
	}
	
	@PostMapping("/post")
	public Customer post(@RequestBody Customer customer) throws Exception {
		Customer cust = customerDao.save(customer);
		return cust;
	}
	
	@PutMapping("/put")
	public Customer put(@RequestBody Customer customer) throws Exception {
		Customer customer2 = customerDao.save(customer);
		return customer2;
	}
	
	@DeleteMapping("/delete/{customerNumber}")
	public void del(@PathVariable ("customerNumber") Customer customer) throws Exception {
		customerDao.delete(customer);
	}
	
	@GetMapping("/customerall")
	public List<Customer> tes() throws Exception {
		List<Customer> list = customerDao.getList();
		return list;
	}
	
}
