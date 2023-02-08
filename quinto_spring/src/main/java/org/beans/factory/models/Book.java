package org.beans.factory.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//El Scope por defecto es singleton
@Component
@Scope("prototype")
public class Book {
	
	
	@Autowired
	private Author author;
	
	private String editorial;

	public Book() {}
	
	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	

}
