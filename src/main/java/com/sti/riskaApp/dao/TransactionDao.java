package com.sti.riskaApp.dao;

import java.util.List;
import com.sti.riskaApp.model.Transaction;

public interface TransactionDao {
	Transaction getById(int id) throws Exception;
	Transaction save(Transaction transaction) throws Exception;
	void delete(Transaction transaction) throws Exception;
	
	List<Transaction> getList() throws Exception;
}
