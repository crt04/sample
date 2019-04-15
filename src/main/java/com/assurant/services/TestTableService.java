package com.assurant.services;

import com.assurant.entity.Loan;

public interface TestTableService {
	
	public Loan findInfo(Integer id);
	
	public Loan saveInfo(Loan testTable);
	
	public Iterable<Loan> findAllInfo();
	
	public void removeInfo(int idToBeRemoved);
}
