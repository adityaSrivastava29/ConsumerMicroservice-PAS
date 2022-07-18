package com.cts.consumermicroservice.service;

import java.util.List;

import com.cts.consumermicroservice.entities.Consumer;

public interface ConsumerService  {

	public String createConsumerBusiness(Consumer consumer);

	public List<Consumer> findAll();

	public String updateConsumerBusiness(int id ,Consumer consumer);

	public Consumer findById(int id);
	
	public String createBuisnessQuote(int id,int pid);
	
}
