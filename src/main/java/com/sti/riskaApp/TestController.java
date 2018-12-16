package com.sti.riskaApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/test")
public class TestController {
	
//	@GetMapping("/hello")
//	public String hello() {
//		return "hello";
//	}
	
//	@GetMapping("hello")
//	public String hello (@RequestParam("data") String data) {
//		return "hello "+data;
//	}
//	
//	@GetMapping("/hello/{data}")
//	public String helloPathVAriable(@PathVariable("data") String data) {
//		return "hello "+data;
//	}
	
	@GetMapping("hello")
	public String hello (@RequestParam(value="id", defaultValue="") String id) {
		return "hello "+id;
	}
	
	@GetMapping("/hello/{data}")
	public String helloPathVAriable(@PathVariable("data") String id) {
		return "hello "+id;
	}
	
//	@PostMapping("/hello")
//	public String hello(@RequestBody Customer customer) {
//		return "hello " + customer.getFirstName();
//	}
//	
//	@PostMapping("/customer")
//	public String customer(@RequestBody Customer customer) { customer.setId_customer(2);
//		return "customer " + customer.getFirstName();
//	}
//	
//	@PostMapping("/hello1")
//	public String hello1(@RequestBody Customer customer) {
//		return "hello " + customer.getLastName();
//	}
}
