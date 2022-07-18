package com.cts.consumermicroservice.entities;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Consumer {

	
	@Id
	@GeneratedValue
	private Integer consumer_id;

	private String name;

	private String type;
	
	private Date validity;
	
	private Date DOB;

	private String email;

	private String PAN;

	@Embedded
	private Business business;

	@Embedded
	private Agent agent;
	
	private int businessValue;

	private long assuredSum;

}
