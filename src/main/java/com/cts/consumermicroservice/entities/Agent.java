package com.cts.consumermicroservice.entities;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class Agent {

	private String agent_id;
	private String agent_name;
	private int agent_age;

}
