package com.certificatic.springboot.app.producto.services;

import java.util.List;

import com.certificatic.springboot.app.producto.models.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);

}
