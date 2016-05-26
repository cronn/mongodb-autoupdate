package de.cronn.app;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents a Person.
 * 
 * @author Leandro Baltazar, cronn GmbH
 */
@Document
public class Customer {

	@Id
	private String id;

	private String firstname;
	private String lastname;

	public Customer(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
