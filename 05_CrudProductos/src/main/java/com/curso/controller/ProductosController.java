package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Producto;
import com.curso.service.ProductosService;

@RestController
public class ProductosController {
	@Autowired
	ProductosService service;
	
	//http://localhost:8500/productos
	@GetMapping(value="productos",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> listarProductos() {
		return service.verProductos();
	}
	//http://localhost:8500/producto/{codigoProducto}
	@GetMapping(value="producto/{codigoProducto}")
	public Producto buscarProducto(@PathVariable("codigoProducto") int codigoProducto) {
		return service.buscarProducto(codigoProducto);
	}
	//http://localhost:8500/producto/{codigoProducto}/{producto}/{precioUnitario}/{stock}
	@PostMapping(value="producto/{codigoProducto}/{producto}/{precioUnitario}/{stock}",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertarProducto(@PathVariable("codigoProducto")int codigoProducto,
			@PathVariable("producto") String producto,
			@PathVariable("precioUnitario") double precioUnitario,
			@PathVariable("stock") int stock) {
		service.insertarProducto(new Producto(codigoProducto,producto,precioUnitario,stock));
	}
	//http://localhost:8500/producto/{codigoProducto}/{unidades}
	@PutMapping(value="producto/{codigoProducto}/{unidades}")
	public void actualizarProducto(@PathVariable("codigoProducto")int codigoProducto,@PathVariable("unidades") int unidades) {
		service.actualizarProducto(codigoProducto,unidades);
	}
}
