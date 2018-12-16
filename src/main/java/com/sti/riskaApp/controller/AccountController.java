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

import com.sti.riskaApp.dao.AccountDao;
import com.sti.riskaApp.model.Account;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountDao accountDao;
	
	@GetMapping("/get")
	public String hello (@RequestParam(value= "id", defaultValue="")int id) {
		try {
			Account account = accountDao.getById(id);
			if (account==null) {
				return "data tdk ditemukan";
			} else {
				return "Account Number " + account.getBalance();
			}	
			
		} catch (Exception e) {
			return String.format("Salah ", e.getMessage());
		}
	}
	
	@PostMapping("/post")
	public Account post(@RequestBody Account account) throws Exception {
		Account acc = accountDao.save(account);
		return acc;

	}
	
	@PutMapping("/put")
	public Account put (@RequestBody Account account) throws Exception {
		Account acc1 = accountDao.save(account);
		return acc1;
	}
	
	@DeleteMapping("/delete/{accountNumber}")
	public void del (@PathVariable ("accountNumber") Account account) throws Exception {
		accountDao.delete(account);
	}
	
	@GetMapping("/accountall")
	public List<Account> tes() throws Exception{
		List<Account> list = accountDao.getList();
		return list;
	}
}
