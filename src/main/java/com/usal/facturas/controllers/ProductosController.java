package com.usal.facturas.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.usal.facturas.entities.Productos;
import com.usal.facturas.service.ProductosService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ProductosController {

	@Autowired
	ProductosService productosService;

	@RequestMapping(value = "/productos", method = RequestMethod.GET, produces = "application/json")
	public List<Productos> getProductos() {
		return productosService.findAllProducto();
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/productos/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Productos> getProductosById(@PathVariable("id") Integer id) {
		return productosService.findProductoById(id);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/productos", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public Productos addProductos(@RequestBody Productos productos) {
		return productosService.saveProducto(productos);
	}

	@RequestMapping(value = "/productos/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public String deleteProducto(@PathVariable("id") Integer id) {
		return productosService.deleteProducto(id);
	}

	@RequestMapping(value = "/productos", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public String updateProducto(Productos productosNew) {
		return productosService.updateProducto(productosNew);
	}

}
