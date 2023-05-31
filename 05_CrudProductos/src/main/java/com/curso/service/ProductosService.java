package com.curso.service;

import java.util.List;

import com.curso.model.Producto;

public interface ProductosService {
	List<Producto> verProductos();
	Producto buscarProducto(int codigoProducto);
	void insertarProducto(Producto producto);
	void actualizarProducto(int codigoProducto,int unidades);
}
