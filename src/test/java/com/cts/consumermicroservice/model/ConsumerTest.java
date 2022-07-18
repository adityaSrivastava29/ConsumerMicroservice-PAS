package com.cts.consumermicroservice.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.consumermicroservice.entities.Consumer;

@SpringBootTest
class ConsumerTest {

	@Test
	public void consumerTest() {
		Consumer consumer=new Consumer();
		consumer.setConsumer_id(1);
		consumer.setName("aditya");
		consumer.setType("owner");
		consumer.setDOB(new Date());
		consumer.setValidity(new Date());
		consumer.setEmail("aditya@gmail.com");
		
		consumer.setPAN("HPIPK4212C");
		consumer.setBusinessValue(2);
		assertEquals(1,consumer.getConsumer_id());
		assertEquals("owner",consumer.getType());
		assertEquals("aditya",consumer.getName());
		assertEquals(new Date(),consumer.getDOB());
		assertEquals("aditya@gmail.com",consumer.getEmail());
		assertEquals("HPIPK4212C",consumer.getPAN());
		assertEquals(new Date(),consumer.getValidity());
	}
	
	@Test
	public void consumerTest1() {
		Consumer consumer=new Consumer();
		consumer.setConsumer_id(1);
		consumer.setName("aditya");
		consumer.setType("owner");
		consumer.setDOB(new Date());
		consumer.setValidity(new Date());
		consumer.setEmail("aditya@gmail.com");
		
		consumer.setPAN("HPIPK4212C");
		consumer.setBusinessValue(2);
		assertEquals(1,consumer.getConsumer_id());
		assertEquals("owner",consumer.getType());
		assertEquals("aditya",consumer.getName());
		assertEquals(new Date(),consumer.getDOB());
		assertEquals("aditya@gmail.com",consumer.getEmail());
		assertEquals("HPIPK4212C",consumer.getPAN());
		assertEquals(new Date(),consumer.getValidity());
	}
	
	@Test
	public void consumerTest2() {
		Consumer consumer=new Consumer();
		consumer.setConsumer_id(1);
		consumer.setName("aditya");
		consumer.setType("owner");
		consumer.setDOB(new Date());
		consumer.setValidity(new Date());
		consumer.setEmail("aditya@gmail.com");
		
		consumer.setPAN("HPIPK4212C");
		consumer.setBusinessValue(2);
		assertEquals(1,consumer.getConsumer_id());
		assertEquals("owner",consumer.getType());
		assertEquals("aditya",consumer.getName());
		assertEquals(new Date(),consumer.getDOB());
		assertEquals("aditya@gmail.com",consumer.getEmail());
		assertEquals("HPIPK4212C",consumer.getPAN());
		assertEquals(new Date(),consumer.getValidity());
	}

}
