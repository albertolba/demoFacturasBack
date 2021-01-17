package com.usal.facturas.service;

import java.util.List;
import java.util.Optional;

import com.usal.facturas.entities.Productos;

public interface ProductosService {

	public List<Productos> findAllProducto();

	public Optional<Productos> findProductoById(Integer id);

	public Productos saveProducto(Productos productoNew);

	public String deleteProducto(Integer id);

	public String updateProducto(Productos productoNew);

}
