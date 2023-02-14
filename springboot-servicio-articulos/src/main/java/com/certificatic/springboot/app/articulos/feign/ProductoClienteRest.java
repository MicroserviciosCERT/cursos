package com.certificatic.springboot.app.articulos.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.certificatic.springboot.app.articulos.models.Producto;

@FeignClient(name= "servicio-productos", url="localhost:8001")
public interface ProductoClienteRest {
	
	@GetMapping("/productos/listar")
	public List<Producto> listar();
	
	@GetMapping("/productos/ver/{id}")
	public Producto detalle(@PathVariable Long id);

}
