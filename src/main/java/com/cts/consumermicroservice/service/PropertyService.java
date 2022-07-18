package com.cts.consumermicroservice.service;

import com.cts.consumermicroservice.entities.Property;

public interface PropertyService {

	public String createBusinessProperty(Property property);

	public String updateBusinessProperty(int id, Property property);
	
	public Property viewConsumerProperty(int id);
	

	
}
