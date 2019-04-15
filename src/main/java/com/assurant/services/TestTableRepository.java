package com.assurant.services;

import org.springframework.data.repository.CrudRepository;

import com.assurant.entity.loan;


public interface TestTableRepository extends CrudRepository<loan, Integer> {

	
}
