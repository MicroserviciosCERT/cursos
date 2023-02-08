package org.beans.factory.models;

import org.springframework.stereotype.Component;

@Component("opcionTriangulo")

public class Triangulo implements Figura {
	
	private Double base;
	private Double altura;

	public Double calcularArea() {
		return (base*altura)/2;
	}

	
	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
}
