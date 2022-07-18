package com.cts.consumermicroservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.consumermicroservice.dao.PropertyRepository;
import com.cts.consumermicroservice.entities.Property;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	PropertyRepository propertyRepository;

	public String createBusinessProperty(Property property) {
		log.info("Start createBusinessProperty inside PropertyServiceImpl");
		propertyRepository.save(property);
		log.info("end createBusinessProperty inside PropertyServiceImpl");
		return "Buisness Property created Successfully";

	}

	public String updateBusinessProperty(int id, Property property) {
		log.info("Start updateBusinessProperty inside PropertyServiceImpl");
		Optional<Property> optProperty = propertyRepository.findById(id);
		if (!optProperty.isPresent()) {

			throw new RuntimeException("Property with the id " + id + " does not exist");
		}
		Property prop = optProperty.get();

		if (prop.getBuisness_id() != null) {
			prop.setBuisness_id(property.getBuisness_id());
		}
		if (prop.getConsumer_id() != 0) {
			prop.setConsumer_id(property.getConsumer_id());
		}
		if (prop.getBuilding_sq_ft() != 0) {
			prop.setBuilding_sq_ft(property.getBuilding_sq_ft());
		}

		if (prop.getBuilding_type() != null) {
			prop.setBuilding_type(property.getBuilding_type());
		}

		if (prop.getBuilding_storeys() != null) {
			prop.setBuilding_storeys(property.getBuilding_storeys());
		}
		if (prop.getBuilding_age() != 0) {
			prop.setBuilding_age(property.getBuilding_age());
		}
		log.debug("Property  {}", prop);
		propertyRepository.save(prop);
		log.info("end updateBusinessProperty inside PropertyServiceImpl");
		return "Buisness Property updated succesfully";

	}

	public Property viewConsumerProperty(int id) {
		log.info("Start viewConsumerProperty inside PropertyServiceImpl");
		Optional<Property> propO = propertyRepository.findById(id);
		if (propO.isPresent()) {
			Property property = propO.get();
			log.debug("Property Master {}", property);
			log.info("end viewConsumerProperty inside PropertyServiceImpl");
			return property;
		}

		return null;
	}

}
