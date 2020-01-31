package com.assurant.dao.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vanguard")
public class K401Controller {
	
	
	@GetMapping("/401KBalance")
	public static String currentBalance() throws Exception {
	
	
		int contributionsCtr = 0;
		double biWklyEmployeeContribution = 265.38;
		double biWklyEmployerContribution = 265.38;
		double biWklyTotalEmployerContribution = 0.0;
	
		
		LocalDate contributionsStartDate = LocalDate.of(2019, 04, 19);
		LocalDate todaysDate = LocalDate.now();
		LocalDate payPeriodIntervalDate = contributionsStartDate;
		if (contributionsStartDate.isBefore(todaysDate)) {
			
			while(payPeriodIntervalDate.isBefore(todaysDate) || payPeriodIntervalDate.isEqual(todaysDate)) {	
				payPeriodIntervalDate = payPeriodIntervalDate.plusDays(14);
				contributionsCtr +=1;
			}
			biWklyEmployeeContribution = 265.00 * contributionsCtr;
			biWklyEmployerContribution = 265.00 * contributionsCtr;
			biWklyTotalEmployerContribution = biWklyEmployeeContribution + biWklyEmployerContribution;
		
		}
		
		
		return contributionsCtr + " pay periods has expired. " + " \nEmployee Contributions total: " + 
		       biWklyEmployeeContribution + " \nEmployer Contributions total: " + biWklyEmployerContribution + 
		       " \nTotal Contributions: " + biWklyTotalEmployerContribution + " Last pay period was: " + payPeriodIntervalDate;
		
	}
	
//	public static void main(String[] args) {
//		try {
//			System.out.println(currentBalance());
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
//		
//	}
}
