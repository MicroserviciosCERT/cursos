package org.beans.factory.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//No olvidar el constructor por default
@Component
@Scope("prototype")
public class Author {
	
	private String nombre;
	
	public Author() {}
	public Author(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
