package com.certificatic.springboot.app.producto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certificatic.springboot.app.producto.dao.ProductoDao;
import com.certificatic.springboot.app.producto.models.Producto;


@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	ProductoDao productoDao;

	@Override
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto findById(Long id) {
		return productoDao.findById(id).orElse(null);
	}

}
