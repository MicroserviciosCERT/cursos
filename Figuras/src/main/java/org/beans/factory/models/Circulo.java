package org.beans.factory.models;

import org.springframework.stereotype.Component;

@Component("opcionCirculo")
public class Circulo implements Figura {

	private Double radio;
	
	public Double calcularArea() {
		return Math.PI*(radio*radio);
	}
	
	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

}
