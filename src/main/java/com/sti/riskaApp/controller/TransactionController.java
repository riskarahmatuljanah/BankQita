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

import com.sti.riskaApp.dao.TransactionDao;
import com.sti.riskaApp.model.Transaction;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionDao transactionDao;
	
	@GetMapping("/get")
	public String hello (@RequestParam (value="id", defaultValue="") int id) {
		try {
			Transaction transaction = transactionDao.getById(id);
			if(transaction==null) {
				return "kosong";
			} else {
				return "hello " + transaction.getAmount();
			}
		} catch (Exception e) {
			return String.format("error : ", e.getMessage());
		}
	}
	
	@PostMapping("/post")
	public Transaction post (@RequestBody Transaction transaction) throws Exception {
		Transaction tran = transactionDao.save(transaction);
		return tran;
	}
	
	@PutMapping("/put")
	public Transaction put (@RequestBody Transaction transaction) throws Exception {
		Transaction tran1 = transactionDao.save(transaction);
		return tran1;
	}
	@DeleteMapping("/delete/{transactionNumber}")
	public void del (@PathVariable ("transactionNumber") Transaction transaction) throws Exception {
		transactionDao.delete(transaction);
	}
	
	@GetMapping("/transactionall")
	public List<Transaction> tes() throws Exception {
		List<Transaction> list = transactionDao.getList();
		return list;
	}
	
}
