package com.certificatic.springboot.app.articulos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.certificatic.springboot.app.articulos.models.Articulo;
import com.certificatic.springboot.app.articulos.service.ArticuloService;

@RestController
public class ArticuloController {

	@Autowired
	@Qualifier("clientFeign")
	private ArticuloService articuloService;
	
	@GetMapping("/listar")
	public List<Articulo> listar(){
		 return articuloService.findAll();
		
	}
	
	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Articulo detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		
		return articuloService.findById(id, cantidad);
	}
	
}
