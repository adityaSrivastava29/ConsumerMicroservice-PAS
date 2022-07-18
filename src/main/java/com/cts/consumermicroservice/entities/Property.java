package com.cts.consumermicroservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Property {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer property_id;
	
	@NotEmpty
	private String buisness_id;	       
	
	@NotNull   
	private int consumer_id;            
	private long building_sq_ft;        
	private  String building_type;      
	private String building_storeys;    
	private int building_age;           
	
	private int propertyValue;
	private Long costAssest;            
	private Long salvageValue;          
	private int usefulLife;             
	
	
	
	
	
	
	
	
	
	
	
}
