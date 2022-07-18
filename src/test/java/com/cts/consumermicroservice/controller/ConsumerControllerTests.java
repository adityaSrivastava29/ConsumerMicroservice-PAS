package com.cts.consumermicroservice.controller;



import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cts.consumermicroservice.dao.ConsumerRepository;
import com.cts.consumermicroservice.dao.PropertyRepository;
import com.cts.consumermicroservice.entities.Property;
import com.cts.consumermicroservice.service.ConsumerService;

@WebMvcTest(value = ConsumerController.class)
public class ConsumerControllerTests {

//	@Autowired
//	private MockMvc mockMvc;

	@MockBean
	private ConsumerService consumerService;

	@MockBean
	private ConsumerRepository consumerRepository;

	@MockBean
	private PropertyRepository propertyRepository;


	//private static String AuthToken = "PolicyAdministrationSystem";

	@Test
	public void createConsumerBusinessTest() throws Exception {

		
	}

	@Test
	public void updateConsumerBusinessTest() throws Exception {

		//ResponseEntity<String> response = ResponseEntity.ok("success");

		

	}

	@Test
	public void viewConsumerBusinessTest() throws Exception {

		

	}

	@Test
	public void createBusinessPropertyTest() throws Exception {

		
	}

	@Test
	public void updateBusinessPropertyTest() throws Exception {

		

	}
	
	@Test
	public void viewConsumerPropertyTest() throws Exception {
		
		Optional<Property> response = Optional.ofNullable(new Property());
		
	
		
		Mockito.when(consumerRepository.existsById((int) Mockito.anyLong())).thenReturn(true);
		Mockito.when(propertyRepository.existsById((int) Mockito.anyLong())).thenReturn(true);
		Mockito.when(propertyRepository.findById((int) Mockito.anyLong())).thenReturn(response);
		
		//RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/viewConsumerProperty?consumerId=1&propertyId=1")
			//	.header("Authorization", AuthToken).contentType(MediaType.APPLICATION_JSON);
		
		//MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		// System.out.println(result.getResponse().getContentAsString());
		
		
	}

}
