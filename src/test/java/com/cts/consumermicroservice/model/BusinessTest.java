package com.cts.consumermicroservice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cts.consumermicroservice.entities.Business;

class BusinessTest {

	@Test
	public void businessTest() {
		
		
		Business b=new Business();
		b.setBusinessId("1");
		b.setBusinessType("test");
		b.setBusinessAge(3L);
		b.setCapitalInvested(4L);
		b.setAnnualTurnover(4L);
		b.setTotalEmployees(240);
		
		assertEquals("1",b.getBusinessId());
		assertEquals("test",b.getBusinessType());
		assertEquals(3L,b.getBusinessAge());
		assertEquals(4L,b.getCapitalInvested());
		assertEquals(4L,b.getAnnualTurnover() );
		assertEquals(240,b.getTotalEmployees());
	}
	
	@Test
	public void businessTest1() {
		Business b= new Business("2","test",3L,2L,2L,250);
		
		assertEquals("2",b.getBusinessId());
		assertEquals("test",b.getBusinessType());
		assertEquals(3L,b.getBusinessAge());
		assertEquals(1L,b.getCapitalInvested());
		assertEquals(1000000000L,b.getAnnualTurnover() );
		assertEquals(240,b.getTotalEmployees());
		
	}
	
	@Test
	public void businessTest2() {
		Business b= new Business("3","test",3L,2L,2L,230);
		assertEquals("3",b.getBusinessId());
		assertEquals("test",b.getBusinessType());
		assertEquals(3L,b.getBusinessAge());
		assertEquals(2L,b.getCapitalInvested());
		assertEquals(2L,b.getAnnualTurnover() );
		assertEquals(230,b.getTotalEmployees());
	}

}
