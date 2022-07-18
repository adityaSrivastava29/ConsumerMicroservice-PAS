package com.cts.consumermicroservice.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.consumermicroservice.dao.ConsumerRepository;
import com.cts.consumermicroservice.dao.PropertyRepository;
import com.cts.consumermicroservice.entities.BusinessMaster;
import com.cts.consumermicroservice.entities.Consumer;
import com.cts.consumermicroservice.entities.PropertyMaster;

import lombok.extern.slf4j.Slf4j;

import com.cts.consumermicroservice.entities.Property;
@Slf4j
@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Autowired
	ConsumerRepository consumerRepository;

	@Autowired
	PropertyRepository propertyRepository;

	@Autowired
	BusinessMaster businessMaster;

	@Autowired
	PropertyMaster propertyMaster;

	public String createConsumerBusiness(Consumer consumer) {
		
		log.info("Start createConsumerBusiness inside ConsumerServiceImpl");
		// Adding 5 years to current date for validity
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.YEAR, 5);
		Date validity = c.getTime();

		consumer.setValidity(validity);
		log.debug("Consumer {}", consumer);
		consumerRepository.save(consumer);
		log.info("End createConsumerBusiness inside ConsumerServiceImpl");
		return "Consumer Buisness Created Successfully.";
	}

	public List<Consumer> findAll() {
		log.info("Start getAllConsumerBusiness inside ConsumerServiceImpl");
		List<Consumer> listConsumer = consumerRepository.findAll();
		log.debug("Consumer List : {}", listConsumer);
		log.info("End getAllConsumerBusiness with  inside ConsumerServiceImpl");
		return listConsumer;
	}

// , Business Turnover, Total consumers etc.. | Output: Status)

	public String updateConsumerBusiness(int id, Consumer consumer) {
		
		log.info("Start updateConsumerBusiness inside ConsumerServiceImpl");
		Optional<Consumer> optConsumer = consumerRepository.findById(id);
		if (!optConsumer.isPresent()) {

			throw new RuntimeException("Consumer with the id " + id + " does not exist");
		}
		Consumer con = optConsumer.get();
        
		if (consumer.getName() != null) {
			con.setName(consumer.getName());
		}

		if (consumer.getType() != null) {
			con.setType(consumer.getType());
		}

		if (consumer.getBusiness() != null) {
			con.setBusiness(consumer.getBusiness());
		}

		if (consumer.getDOB() != null) {
			con.setDOB(consumer.getDOB());
		}
		if (consumer.getEmail() != null) {
			con.setEmail(consumer.getEmail());
		}
		if (consumer.getPAN() != null) {
			con.setPAN(consumer.getPAN());
		}

		if (consumer.getAgent() != null) {
			con.setAgent(con.getAgent());
		}

		consumerRepository.save(con);
		log.debug("Consumer {}", con);
		log.info("End updateConsumerBusiness inside ConsumerServiceImpl");
		return "Consumer Buisness updated succesfully";

	}

	public Consumer findById(int id) {
		log.info("Start getConsumerBusiness inside ConsumerServiceImpl");
		Optional<Consumer> conO = this.consumerRepository.findById(id);
		if (conO.isPresent()) {
			Consumer consumer = conO.get();
			log.debug("Consumer : {}", consumer);
		    log.info("End getConsumerBusiness with  inside ConsumerServiceImpl");
			return consumer;
		}
       
		return null;

	}

	public String createBuisnessQuote(int id ,int pid) {
		log.info("Start createBuisnessQuote inside ConsumerServiceImpl");
		if (!consumerRepository.existsById(id)) {
			return "Invalid Consumer ID";
		}

		if (!propertyRepository.existsById(pid)) {
			return "Invalid Property ID";
		}

		Consumer con = consumerRepository.findById(id).get();

		int businesVal = businessMaster.calcuateBusinessValue(con.getBusiness().getCapitalInvested(),
				con.getBusiness().getAnnualTurnover());

		con.setBusinessValue(businesVal);

		Property prop = propertyRepository.findById(pid).get();

		long pade = propertyMaster.calculateAnnualDepreciationExpense(prop.getCostAssest(), prop.getSalvageValue(),
				prop.getUsefulLife());
		int propertyVal = 0;

		if (pade <= 10000) {
			propertyVal = 10;
		} else if (pade > 10000 && pade <= 200000) {
			propertyVal = 9;
		} else if (pade > 200000 && pade <= 300000) {
			propertyVal = 8;
		} else if (pade > 300000 && pade <= 400000) {
			propertyVal = 7;

		} else if (pade > 400000 && pade <= 500000) {
			propertyVal = 6;
		} else if (pade > 500000 && pade <= 600000) {
			propertyVal = 5;
		} else if (pade > 600000 && pade <= 700000) {
			propertyVal = 4;
		} else if (pade > 700000 && pade <= 800000) {
			propertyVal = 3;
		} else if (pade > 800000 && pade <= 900000) {
			propertyVal = 2;
		} else if (pade > 900000 && pade <= 1000000) {
			propertyVal = 1;
		} else {
			propertyVal = 0;
		}

		prop.setPropertyValue(propertyVal);

		int policyFactor = (propertyVal + businesVal) / 2;

		if (policyFactor == 0) {
			con.setAssuredSum(0);
		} else if (policyFactor >= 1 && policyFactor <= 5) {
			con.setAssuredSum(570000);
		} else {
			policyFactor = 1850000;
		}
		
		con.setAssuredSum(policyFactor);
		
		log.debug("ConsumerBusinessDetails : {}", con);
		
		updateConsumerBusiness(id, con);
		log.info("end createBuisnessQuote inside ConsumerServiceImpl");
		return Long.toString((con.getAssuredSum()));
	}

}
