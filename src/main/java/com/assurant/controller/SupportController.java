package com.assurant.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("support")
public class SupportController {
	
	
	@GetMapping("/currentChildSupportBalance")
	public String currentBalance() throws Exception {
	
	
		int payrollCtr = 0;
		
		LocalDate lastPaidFromHD = LocalDate.of(2019, 04, 12);
		LocalDate shouldStartDedFromAssurant = LocalDate.of(2019, 04, 26);  // 04-26-19 is actually HD paydate, assurant is on opposite week
		LocalDate currentDate = LocalDate.now();
		LocalDate  twoWeekIntervalFromStart = shouldStartDedFromAssurant.plusDays(14);
		
		
		while (twoWeekIntervalFromStart.isBefore(currentDate) || twoWeekIntervalFromStart.isEqual(currentDate)) {
			payrollCtr = payrollCtr += 1;
			twoWeekIntervalFromStart = twoWeekIntervalFromStart.plusDays(14);
		}
		
		return "Your last payment via HomeDepot was on: " + lastPaidFromHD + " \nDeductions from Assurant should have started on: " + 
				shouldStartDedFromAssurant + " \nThere has been " + payrollCtr + " pay periods to expire since start of deductions. " +
				" \nYour total owed is: $" + 900 * payrollCtr + "\n63% is owed to Laronda at: " + 900 * payrollCtr * .63 + 
				"\n37% is owed to Tiah at: " + 900 * payrollCtr * .37;
	
	}

}
