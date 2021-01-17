package com.usal.facturas.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.usal.facturas.entities.Facturas;
import com.usal.facturas.repository.FacturasRepository;
import com.usal.facturas.service.FacturasService;

@Service
public class FacturasServiceImpl implements FacturasService {

	@Autowired
	FacturasRepository facturasRepository;

	@Override
	public List<Facturas> findAllFacturas() {
		return facturasRepository.findAll();
	}

	@Override
	public Optional<Facturas> findFacturaById(Integer id) {
		return facturasRepository.findById(id);
	}

	@Override
	public Facturas saveFactura(Facturas facturaNew) {
			return facturaNew != null ? facturasRepository.save(facturaNew) : new Facturas();
	}

	@Override
	public String deleteFactura(Integer id) {
		if (facturasRepository.findById(id).isPresent()) {
			facturasRepository.deleteById(id);
			return "Factura eliminada correctamente.";
		}
		return "Error! La factura no existe";
	}

	@Override
	public String updateFactura(Facturas facturaNew) {
		Integer num = facturaNew.getIdfactura();
		if (facturasRepository.findById(num).isPresent()) {
			facturasRepository.save(facturaNew);
			return "Factura modificada";
		}
		return "Error al modificar la factura";
	}

}
