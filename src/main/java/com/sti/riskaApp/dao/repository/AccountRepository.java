package com.sti.riskaApp.dao.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sti.riskaApp.model.Account;

public interface AccountRepository extends PagingAndSortingRepository<Account, Integer>{
	Account findByAccountnumber(int accountNumber);
}
