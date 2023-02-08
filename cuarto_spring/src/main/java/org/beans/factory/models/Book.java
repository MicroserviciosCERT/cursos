package org.beans.factory.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	
	
	@Autowired
	private Author author;
	
	private String editorial;

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
