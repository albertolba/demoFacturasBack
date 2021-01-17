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

import com.usal.facturas.entities.Facturas;
import com.usal.facturas.service.FacturasService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class FacturasController {

	@Autowired
	FacturasService facturasService;

	@RequestMapping(value = "/facturas", method = RequestMethod.GET, produces = "application/json")
	public List<Facturas> getFacturas() {
		return facturasService.findAllFacturas();
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/facturas/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Facturas> getFacturasById(@PathVariable("id") Integer id) {
		return facturasService.findFacturaById(id);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/facturas", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public Facturas addClientes(@RequestBody Facturas factura) {
		return facturasService.saveFactura(factura);
	}

	@RequestMapping(value = "/facturas/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public String deleteFacturas(@PathVariable("id") Integer id) {
		return facturasService.deleteFactura(id);
	}

}
