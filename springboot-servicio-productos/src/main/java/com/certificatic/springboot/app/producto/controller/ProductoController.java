package com.certificatic.springboot.app.producto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.certificatic.springboot.app.producto.models.Producto;
import com.certificatic.springboot.app.producto.services.IProductoService;

@RestController
public class ProductoController {
	
	
	@Autowired
	IProductoService productoService;
	
	@GetMapping("/productos/listar")
	public List<Producto> listar(){
		return productoService.findAll();
	}
	
	
	@GetMapping("/productos/ver/{id}")
	public Producto ver(@PathVariable Long id) {
		return productoService.findById(id);
	}
	
	

}
