package com.sti.riskaApp.dao;

import com.sti.riskaApp.model.Account;
import java.util.List;

public interface AccountDao {
	Account getById(int id) throws Exception;
	Account save(Account account) throws Exception;
	void delete(Account account) throws Exception;
	
	List<Account> getList() throws Exception;
}
