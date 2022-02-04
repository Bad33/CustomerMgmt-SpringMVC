package com.democrud.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.democrud.entity.Customer;

@Service
public class CustomerDAOImpl{

	@Autowired
	private CustomerDAO repo;


	public List<Customer> getCustomers() {
		List <Customer> res = (List<Customer>) repo.findAll(); 
		return res;
	}


	public void deleteCustomer(int id) {
		repo.deleteById(id);
	}


	public Customer saveCustomer(Customer theCustomer) {
		return repo.save(theCustomer);
	}

	
	public Customer getCustomer(int theId) {
		return repo.findById(theId).get();
	}
	
}