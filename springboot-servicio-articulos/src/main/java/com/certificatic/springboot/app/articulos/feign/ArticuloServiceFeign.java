package com.certificatic.springboot.app.articulos.feign;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certificatic.springboot.app.articulos.models.Articulo;
import com.certificatic.springboot.app.articulos.service.ArticuloService;

@Service("clientFeign")
public class ArticuloServiceFeign implements ArticuloService {
	
	
	@Autowired
	private ProductoClienteRest clienteFeign;

	@Override
	public List<Articulo> findAll() {
		 return clienteFeign.listar().stream().map(p-> new Articulo(p,1)).collect(Collectors.toList());
	}

	@Override
	public Articulo findById(Long id, Integer cantidad) {
		return new Articulo(clienteFeign.detalle(id),cantidad);
	}

}
