package com.assurant.services;

import org.springframework.data.repository.CrudRepository;

import com.assurant.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
