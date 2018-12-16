package com.sti.riskaApp.dao.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sti.riskaApp.model.Transaction;

public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Integer> {

}
