package com.usal.facturas.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usal.facturas.entities.Productos;
import com.usal.facturas.repository.ProductosRepository;
import com.usal.facturas.service.ProductosService;

@Service
public class ProductosServiceImpl implements ProductosService {

	@Autowired
	ProductosRepository productosRepository;

	@Override
	public List<Productos> findAllProducto() {
		return productosRepository.findAll();
	}

	@Override
	public Optional<Productos> findProductoById(Integer id) {
		return productosRepository.findById(id);
	}

	@Override
	public Productos saveProducto(Productos productoNew) {
		return productoNew != null ? productosRepository.save(productoNew) : new Productos();
	}

	@Override
	public String deleteProducto(Integer id) {

		if (productosRepository.findById(id).isPresent()) {
			productosRepository.deleteById(id);
			return "Producto eliminado correctamente.";
		}
		return "Error! El Producto no existe";
	}

	@Override
	public String updateProducto(Productos productoNew) {
		Integer num = productoNew.getIdProducto();
		if (productosRepository.findById(num).isPresent()) {
			productosRepository.save(productoNew);
			return "Producto modificado";
		}
		return "Error al modificar el Producto";
	}

}
