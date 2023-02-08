package org.beans.factory.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CalcularFiguraArea {

	@Autowired
	@Qualifier("opcionCirculo")
	private Figura circulo;
	
	@Autowired
	@Qualifier("opcionTriangulo")
	private Figura triangulo;
	
	
	public Double getArea(int opcion) {
		
		switch(opcion) {
		case 1 : return circulo.calcularArea(); 
		case 2 : return triangulo.calcularArea(); 
		default: return  0.0;
		}
	}
	
	
	
	
}
