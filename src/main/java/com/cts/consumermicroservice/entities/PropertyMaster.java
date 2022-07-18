package com.cts.consumermicroservice.entities;

import org.springframework.stereotype.Component;

@Component
public class PropertyMaster {

	public long calculateAnnualDepreciationExpense(long costAssest, long salvageValue, int usefulLife) {
		long annualDepreciationExpense = (costAssest - salvageValue) / usefulLife;

		return annualDepreciationExpense;
	}
}
