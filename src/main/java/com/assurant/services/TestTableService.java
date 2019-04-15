package com.assurant.services;

import com.assurant.entity.loan;

public interface TestTableService {
	
	public loan findInfo(Integer id);
	
	public loan saveInfo(loan testTable);
	
	public Iterable<loan> findAllInfo();
	
	public void removeInfo(int idToBeRemoved);
}
