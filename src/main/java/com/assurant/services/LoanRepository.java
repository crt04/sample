package com.assurant.services;

import org.springframework.data.repository.CrudRepository;

import com.assurant.entity.Loan;


public interface LoanRepository extends CrudRepository<Loan, Integer> {

	
}
