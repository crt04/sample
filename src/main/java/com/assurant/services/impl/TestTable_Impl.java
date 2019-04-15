package com.assurant.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assurant.entity.loan;
import com.assurant.services.TestTableRepository;
import com.assurant.services.TestTableService;


@Service
public class TestTable_Impl implements TestTableService {
	
	@Autowired
	TestTableRepository testTableRepository;
	
	
	public loan findInfo(Integer id) {
		 return testTableRepository.findById(id).get();
	}
	
	
	public loan saveInfo(loan testTable) {
		return testTableRepository.save(testTable);
	}
	
	
	public  Iterable<loan> findAllInfo() {	
		return testTableRepository.findAll();
	}
	
	
	public void removeInfo(int idToRemove) {
		testTableRepository.deleteById(idToRemove);
	}
	
	

}
