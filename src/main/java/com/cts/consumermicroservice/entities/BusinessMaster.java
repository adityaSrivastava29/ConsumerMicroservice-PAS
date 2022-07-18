package com.cts.consumermicroservice.entities;

import org.springframework.stereotype.Component;

@Component
public class BusinessMaster {


	
	
	public int calcuateBusinessValue(long capitalInvested, long annualTurnOver) {
		
		
		int businessVal  = (int)(capitalInvested/annualTurnOver);
		
		if(businessVal>10) {
			return 10;
		}
		else if(businessVal<0) {
			return 0;
		}
		else {
			return businessVal;
		}
		
	}
	
	
}
