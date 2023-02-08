package org.beans.factory.main;

import org.beans.factory.models.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new  ClassPathXmlApplicationContext("beans.xml");
		
		Book book =(Book) context.getBean(Book.class);
		Book book2 = (Book) context.getBean(Book.class);
		
		book.getAuthor().setNombre("Paco");
		book2.getAuthor().setNombre("Beto");
		
		System.out.println(book.getAuthor().getNombre());
		System.out.println(book2.getAuthor().getNombre());
		
		System.out.println("Es mismo objeto?" +(book==book2));

	}

}
