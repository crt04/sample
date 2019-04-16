package com.assurant.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assurant.entity.Customer;
import com.assurant.services.CustomerRepository;
import com.assurant.services.CustomerService;

@Service
public class Customer_Impl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	
	public Customer findInfo(Integer id) {
		 return customerRepository.findById(id).get();
	}
	
	
	public Customer saveInfo(Customer testTable) {
		return customerRepository.save(testTable);
	}
	
	
	public  Iterable<Customer> findAllInfo() {	
		return customerRepository.findAll();
	}
	
	
	public void removeInfo(int idToRemove) {
		customerRepository.deleteById(idToRemove);
	}
	

}
