//package com.sti.riskaApp;
//
//import java.util.List;
//import java.util.ArrayList;
//
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/test")
//public class ControllerCustomer {
//	
//	@GetMapping("/customer/{idCustomer}") 
//	public String customer(@PathVariable("idCustomer") String idCustomer) {
//		return "customer " + idCustomer;
//	}
//	
//	@PostMapping("/customer") 
//	public Customer hello(@RequestBody Customer customer) {
//	 return customer;
//	}
//	
//	@PutMapping("/customer")
//	public Customer customer (@RequestBody Customer customer) {
//		customer.setIdCustomer(200);
//		return customer;
//	}
//	
//	@DeleteMapping("/customer")
//	public Customer delete(Integer idCustomer) {
//		Customer customer = new Customer();
//		customer.setIdCustomer(idCustomer);
//		return customer;
//	}
//	
//	@DeleteMapping("customer/{idCustomer}")
//	public Customer delete (@PathVariable("idCustomer") int idCustomer) {
//		Customer cs = new Customer();
//		cs.setIdCustomer(idCustomer);
//		return cs;
//	}
//	
//	@GetMapping("/customers")
//	public List<Customer> getlistall () {
//		Customer cs = new Customer();
//		cs.setIdCustomer(123);
//		cs.setFirstName("riska");
//		ArrayList<Customer> list = new ArrayList<Customer>();
//		list.add(cs);
//		return list;
//	}
//}
