package com.cts.consumermicroservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.consumermicroservice.entities.Property;

public interface PropertyRepository extends JpaRepository<Property, Integer >{
	
	
	
}


