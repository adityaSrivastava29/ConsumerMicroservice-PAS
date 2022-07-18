package com.cts.consumermicroservice.entities;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Business {

	
	@NotEmpty
	private String businessId;
	
	private String businessType;
	private Long businessAge;
	
	@NotNull
	private Long capitalInvested;
	@NotNull
	private Long annualTurnover;
	
	
	private int totalEmployees;

}


