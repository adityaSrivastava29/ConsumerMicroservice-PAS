package com.cts.consumermicroservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.consumermicroservice.entities.Consumer;
import com.cts.consumermicroservice.entities.Property;
import com.cts.consumermicroservice.helper.APIResponse;
import com.cts.consumermicroservice.service.ConsumerServiceImpl;
import com.cts.consumermicroservice.service.PropertyServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/consumermicroservice")
public class ConsumerController {

	@Autowired
	ConsumerServiceImpl consumerServiceImpl;

	@Autowired
	PropertyServiceImpl propertyServiceImpl;

	@GetMapping("/HealthCheck")
	public String healthCheck() {
		return "Conumer is working";

	}

	@GetMapping("/getAll")
	public List<Consumer> getAll() {
		return consumerServiceImpl.findAll();
	}

	@PostMapping("/createConsumerBusiness")
	public ResponseEntity<?> createConsumerBusines(@Valid @RequestBody Consumer consumer) {
		log.info("Start createConsumerBusiness inside ConsumerController");
		APIResponse response = new APIResponse();

		String message = consumerServiceImpl.createConsumerBusiness(consumer);
		log.info("Created Consumer : {}", message);
		response.setMessage(message);
		log.info("End createConsumerBusiness inside ConsumerController");
		return ResponseEntity.ok(response);

	}

	@PostMapping("/updateConsumerBusiness/{id}")
	public ResponseEntity<?> updateConsumerBusiness(@PathVariable Integer id, @RequestBody Consumer consumer) {
		log.info("Start updateConsumerBusiness inside ConsumerController");
		APIResponse response = new APIResponse();
		String message = consumerServiceImpl.updateConsumerBusiness(id, consumer);
		response.setMessage(message);
		log.info("End updateConsumerBusiness inside ConsumerController");
		return ResponseEntity.ok(response);
	}

	@PostMapping("/createBusinessProperty")
	public ResponseEntity<?> createBuinessProperty(@RequestBody Property property) {
		APIResponse response = new APIResponse();
		String message = propertyServiceImpl.createBusinessProperty(property);
		response.setMessage(message);
		return ResponseEntity.ok(response);
	}

	@PostMapping("/updateBusinessProperty/{id}")
	public ResponseEntity<?> updateBusinessProperty(@PathVariable int id, @RequestBody Property property) {
		APIResponse response = new APIResponse();
		String message = propertyServiceImpl.updateBusinessProperty(id, property);
		response.setMessage(message);
		return ResponseEntity.ok(response);
	}

	@GetMapping("/viewConsumerBusiness/{id}")
	public ResponseEntity<?> viewConsumerBusiness(@PathVariable("id") int id) {
		APIResponse error = new APIResponse();
		log.info("Start getAllConsumerBusiness inside ConsumerController");
		Consumer consumer = consumerServiceImpl.findById(id);
		log.debug("ConsumerBusiness  List : {}", consumer);
		if (consumer == null) {
			error.setMessage("Consumer with the given id " + id + " not found");
			return ResponseEntity.ok(error);
		}
		log.info("End getAllConsumerBusiness inside ConsumerController");
		return ResponseEntity.ok(consumer);
	}

	@GetMapping("/viewConsumerProperty/{id}")
	public ResponseEntity<?> viewConsumerProperty(@PathVariable("id") int id) {
		APIResponse error = new APIResponse();
		log.info("Start getConsumerProperty inside ConsumerController");
		Property property = propertyServiceImpl.viewConsumerProperty(id);

		if (property == null) {
			error.setMessage("Property with the given id " + id + " not found");
			return ResponseEntity.ok(error);
		}
		log.debug("ConsumerProperty Details: {}", property);
		log.info("End getConsumerProperty inside ConsumerController");
		return ResponseEntity.ok(property);
	}
	
	
	
	
	@GetMapping("/getQuotes/{id}/{pid}")
	public String getQuotes(@PathVariable int id, @PathVariable int pid) {
        log.info("start get quotes");
		String quote = consumerServiceImpl.createBuisnessQuote(id, pid);
		log.info("end get quotes");
		return quote;
	}

}
