package com.drkiettran.microprofile.rest;


import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Message exchange class.
 * 
 * @author ktran
 *
 */
public class Message implements Serializable {
	private static final long serialVersionUID = 2120914098830910225L;

	@JsonProperty("id")
	private int id;
	
	@JsonProperty("first-name")
	private String firstName;
	
	@JsonProperty("last-name")
	private String lastName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonProperty("name")
	private String name;

	@JsonProperty("message")
	private String message;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(Message.class);

	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			LOGGER.error("Error: {}", e);
		}
		return "Marhsaling error";
	}
}
