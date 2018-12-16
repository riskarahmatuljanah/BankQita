package com.sti.riskaApp.dao.Impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import com.sti.riskaApp.model.Customer;
import com.sti.riskaApp.dao.CustomerDao;
import com.sti.riskaApp.dao.repository.CustomerRepository;

public class CustomerDaoImpl extends BaseImpl implements CustomerDao{

	@Autowired
	private CustomerRepository repository;
	
	@Override
	public Customer getById(int id) throws Exception {
		return repository.findOne(Integer.valueOf(id));
	}

	@Override
	public Customer save(Customer customer) throws Exception {
		return repository.save(customer);
	}

	@Override
	public void delete(Customer customer) throws Exception {
		repository.delete(customer);
	}

	@Override
	public List<Customer> getList() throws Exception {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Customer> query = critB.createQuery(Customer.class);
		Root<Customer> root = query.from(Customer.class);
		query.select(root);
		
		TypedQuery<Customer> q = em.createQuery(query);
		return q.getResultList();
	}

}
