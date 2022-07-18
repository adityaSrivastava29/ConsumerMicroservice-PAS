package com.cts.consumermicroservice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cts.consumermicroservice.entities.Consumer;


@ExtendWith(MockitoExtension.class)
public class ConsumerServiceTests {
	
	@InjectMocks
	private ConsumerService consumerService;
	
	@Test
	public void testUpdateConsumerBusiness() {
		
		Consumer consumer=new Consumer();
		consumer.setConsumer_id(1);
		consumer.setName("aditya");
		consumer.setType("owner");
		consumer.setDOB(new Date());
		consumer.setValidity(new Date());
		consumer.setEmail("aditya@gmail.com");
		String result = consumerService.updateConsumerBusiness(1,consumer);
		assertEquals("Consumer Buisness updated succesfully",result);
	}
}
