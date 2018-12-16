package com.sti.riskaApp.dao.Impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.sti.riskaApp.dao.TransactionDao;
import com.sti.riskaApp.dao.repository.TransactionRepository;
import com.sti.riskaApp.model.Transaction;

public class TransactionDaoImpl extends BaseImpl implements TransactionDao{
	
	@Autowired
	private TransactionRepository repository;

	@Override
	public Transaction getById(int id) throws Exception {
		return repository.findOne(id);
	}

	@Override
	public Transaction save(Transaction transaction) throws Exception {
		return repository.save(transaction);
	}

	@Override
	public void delete(Transaction transaction) throws Exception {
		repository.delete(transaction);
	}

	@Override
	public List<Transaction> getList() throws Exception {
		CriteriaBuilder critC = em.getCriteriaBuilder();
		CriteriaQuery<Transaction> query = critC.createQuery(Transaction.class);
		Root<Transaction> root = query.from(Transaction.class);
		query.select(root);
		TypedQuery<Transaction> a = em.createQuery(query);
		
		return a.getResultList();
	}
}
