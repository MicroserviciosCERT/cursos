package com.certificatic.springboot.app.producto.dao;

import org.springframework.data.repository.CrudRepository;

import com.certificatic.springboot.app.producto.models.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>  {

}
