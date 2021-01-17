package com.usal.facturas.service;

import java.util.List;
import java.util.Optional;

import com.usal.facturas.entities.Facturas;


public interface FacturasService {
	
	public List<Facturas> findAllFacturas();

	public Optional<Facturas> findFacturaById(Integer id);

	public Facturas saveFactura(Facturas facturaNew);

	public String deleteFactura(Integer id);

	public String updateFactura(Facturas facturaNew);

}
