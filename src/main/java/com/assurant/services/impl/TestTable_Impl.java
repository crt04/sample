package com.assurant.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assurant.entity.Loan;
import com.assurant.services.TestTableRepository;
import com.assurant.services.TestTableService;


@Service
public class TestTable_Impl implements TestTableService {
	
	@Autowired
	TestTableRepository testTableRepository;
	
	
	public Loan findInfo(Integer id) {
		 return testTableRepository.findById(id).get();
	}
	
	
	public Loan saveInfo(Loan testTable) {
		return testTableRepository.save(testTable);
	}
	
	
	public  Iterable<Loan> findAllInfo() {	
		return testTableRepository.findAll();
	}
	
	
	public void removeInfo(int idToRemove) {
		testTableRepository.deleteById(idToRemove);
	}
	
	

}
