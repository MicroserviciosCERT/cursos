package org.beans.factory.main;

import org.beans.factory.models.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new  ClassPathXmlApplicationContext("beans.xml");
		Book book = (Book) context.getBean("book");
		System.out.println(book.getAuthor().getNombre());

	}

}
