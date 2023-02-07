package org.sistema.spring.dependencyInjection.models;

public class Address {
	
	private String id;
	private String street;
	public Address(String id, String street) {
		super();
		this.id = id;
		this.street = street;
	}
	public String getId() {
		return id;
	}
	
	public String getStreet() {
		return street;
	}
	

}
