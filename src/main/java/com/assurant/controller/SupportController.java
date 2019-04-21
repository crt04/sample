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
		LocalDate startDeductionFromAssurant = LocalDate.of(2019, 04, 01);
		LocalDate currentDate = LocalDate.now();
		LocalDate  twoWeekIntervalFromStart = startDeductionFromAssurant.plusDays(14);
		
		
		while (twoWeekIntervalFromStart.isBefore(currentDate) || twoWeekIntervalFromStart.isEqual(currentDate)) {
			payrollCtr = payrollCtr += 1;
			twoWeekIntervalFromStart = twoWeekIntervalFromStart.plusDays(14);
		}
		
		return "Your last payment via HomeDepot was on: " + lastPaidFromHD + " \nDeductions from Assurant should have started on: " + 
				startDeductionFromAssurant + " \nThere has been " + payrollCtr + " pay periods to expire since start of deductions. " +
				" \nYour total owed is: $" + 900 * payrollCtr + "\n66% is owed to Laronda at: " + 900 * payrollCtr * .63 + 
				"\n33% is owed to Tiah at: " + 900 * payrollCtr * .37;
	
	}

}
