package com.cts.consumermicroservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.consumermicroservice.entities.Consumer;

public interface ConsumerRepository extends JpaRepository<Consumer, Integer>{

}
