package com.democrud.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.democrud.entity.Customer;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer>{

//    public List < Customer > getCustomers();
//
//    public void saveCustomer(Customer theCustomer);
//
//    public Customer getCustomer(int theId);
//
//    public void deleteCustomer(int theId);
}
