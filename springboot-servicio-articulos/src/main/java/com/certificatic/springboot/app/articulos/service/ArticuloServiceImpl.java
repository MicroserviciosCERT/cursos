package com.certificatic.springboot.app.articulos.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.certificatic.springboot.app.articulos.models.Articulo;
import com.certificatic.springboot.app.articulos.models.Producto;


@Service("clientRestTemplate")
public class ArticuloServiceImpl implements ArticuloService {

	@Autowired
	RestTemplate clienteRest;
	
	@Override
	public List<Articulo> findAll() {
		List<Producto> productos = Arrays.asList(clienteRest.getForObject("http://localhost:8001/productos/listar", Producto[].class));
		return productos.stream().map(p -> new Articulo(p,1)).collect(Collectors.toList());
	}

	@Override
	public Articulo findById(Long id, Integer cantidad) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id",id.toString());
		Producto producto = clienteRest.getForObject("http://localhost:8001/productos/ver/{id}", Producto.class,pathVariables);
		return new Articulo(producto,cantidad);
	}

}
