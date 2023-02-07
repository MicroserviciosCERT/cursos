package org.sistema.spring.dependencyInjection.models;

public class Person {
	
	private String id;
	private String name;
	private Address address;
	public Person(String id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	
	

}
