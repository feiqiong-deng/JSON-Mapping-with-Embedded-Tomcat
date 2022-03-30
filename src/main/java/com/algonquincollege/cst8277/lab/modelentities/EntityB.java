package com.algonquincollege.cst8277.lab.modelentities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@SuppressWarnings("unused")

//TODO - add annotation so that only non-null fields are in JSON body
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityB extends PojoBase implements Serializable {
	private static final long serialVersionUID = 1L;

	public EntityB() {
		super();
		//hard-code a message
		setFoobar("bee");
	}
}
