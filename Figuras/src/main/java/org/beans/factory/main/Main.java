package org.beans.factory.main;

import org.beans.factory.models.CalcularFiguraArea;
import org.beans.factory.models.Circulo;
import org.beans.factory.models.Triangulo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new  ClassPathXmlApplicationContext("beans.xml");
		CalcularFiguraArea calcula = (CalcularFiguraArea) context.getBean(CalcularFiguraArea.class);
		
		Triangulo triangulo = (Triangulo) context.getBean(Triangulo.class);
		Circulo circulo = (Circulo) context.getBean(Circulo.class);
		
		triangulo.setAltura(7.0);
		triangulo.setBase(3.0);
		circulo.setRadio(2.0);
		
		System.out.println(calcula.getArea(2));
		
		
		
	}

}
