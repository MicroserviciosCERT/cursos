package com.certificatic.springboot.app.articulos.service;

import java.util.List;

import com.certificatic.springboot.app.articulos.models.Articulo;

public interface ArticuloService {
	
	public List<Articulo> findAll();
    public Articulo findById(Long id, Integer cantidad);
}
