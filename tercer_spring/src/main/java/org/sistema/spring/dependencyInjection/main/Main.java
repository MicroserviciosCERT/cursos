package org.sistema.spring.dependencyInjection.main;

import org.sistema.spring.dependencyInjection.models.Combate;
import org.sistema.spring.dependencyInjection.models.Luchador;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;
	public static void main(String[] args) {
		 context = new ClassPathXmlApplicationContext("beans.xml");
         Combate combate= (Combate)context.getBean("combate"); 
         
         Luchador  luchador1= (Luchador)context.getBean("luchador1"); 
         
        System.out.println(combate.getLuchador1().getNombre());
        System.out.println(combate.getLuchador2().getNombre());
        System.out.println(combate.getLuchador3().getNombre());
		 
		 
	}

}
