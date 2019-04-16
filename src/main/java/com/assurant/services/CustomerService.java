package com.assurant.services;

import com.assurant.entity.Customer;

public interface CustomerService {
	
	public Customer findInfo(Integer id);
	
	public Customer saveInfo(Customer testTable);
	
	public Iterable<Customer> findAllInfo();
	
	public void removeInfo(int idToBeRemoved);

}
