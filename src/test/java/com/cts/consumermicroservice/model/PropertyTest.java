package com.cts.consumermicroservice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.consumermicroservice.entities.Property;

@SpringBootTest
class PropertyTest {

	@Test
	public void propertyTest() {
		Property p=new Property();
		p.setConsumer_id(1);
		p.setBuilding_sq_ft(250);
		p.setBuilding_type("rented");
		p.setBuilding_age(3);
		p.setPropertyValue(2);
		p.setCostAssest(1L);
		p.setSalvageValue(1L);
		p.setUsefulLife(3);
		assertEquals(1,p.getConsumer_id());
		assertEquals(250,p.getBuilding_sq_ft());
		assertEquals("rented",p.getBuilding_type());
		assertEquals(1L,p.getBuilding_storeys());
		assertEquals(1L,p.getPropertyValue());
		assertEquals(1L,p.getCostAssest());
		assertEquals(1L,p.getSalvageValue());
		assertEquals(1L,p.getSalvageValue());
		assertEquals(3,p.getUsefulLife());
		
	}
	
	@Test
	public void propertyTest1() {
		Property p=new Property();
		p.setConsumer_id(1);
		p.setBuilding_sq_ft(250);
		p.setBuilding_type("rented");
		p.setBuilding_age(3);
		p.setPropertyValue(2);
		p.setCostAssest(1L);
		p.setSalvageValue(1L);
		p.setUsefulLife(3);
		assertEquals(1,p.getConsumer_id());
		assertEquals(250,p.getBuilding_sq_ft());
		assertEquals("rented",p.getBuilding_type());
		assertEquals(1L,p.getBuilding_storeys());
		assertEquals(1L,p.getPropertyValue());
		assertEquals(1L,p.getCostAssest());
		assertEquals(1L,p.getSalvageValue());
		assertEquals(1L,p.getSalvageValue());
		assertEquals(3,p.getUsefulLife());
		
	}
	@Test
	public void propertyTest2() {
		Property p=new Property();
		p.setConsumer_id(1);
		p.setBuilding_sq_ft(250);
		p.setBuilding_type("rented");
		p.setBuilding_age(3);
		p.setPropertyValue(2);
		p.setCostAssest(1L);
		p.setSalvageValue(1L);
		p.setUsefulLife(3);
		assertEquals(1,p.getConsumer_id());
		assertEquals(250,p.getBuilding_sq_ft());
		assertEquals("rented",p.getBuilding_type());
		assertEquals(1L,p.getBuilding_storeys());
		assertEquals(1L,p.getPropertyValue());
		assertEquals(1L,p.getCostAssest());
		assertEquals(1L,p.getSalvageValue());
		assertEquals(1L,p.getSalvageValue());
		assertEquals(3,p.getUsefulLife());
	}
		
}
