package com.usal.facturas.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.usal.facturas.entities.Clientes;
import com.usal.facturas.service.ClientesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ClientesController {

	@Autowired
	ClientesService clientesService;

	private static final Logger logger = LoggerFactory.getLogger(ClientesController.class);

	@RequestMapping(value = "/clientes",  method = RequestMethod.GET, produces = "application/json")
	public List<Clientes> getClientes() {
		logger.debug("Get cientes");
		return clientesService.findAllCliente();
	}

	@RequestMapping(value = "/clientes/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Clientes> getClientesById(@PathVariable("id") Integer id) {
		return clientesService.findClienteById(id);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/clientes", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public Clientes addClientes(@RequestBody Clientes clientes) {
		return clientesService.saveCliente(clientes);
	}

	@RequestMapping(value = "/clientes/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public String deleteClientes(@PathVariable("id") Integer id) {
		return clientesService.deleteCliente(id);
	}

	@RequestMapping(value = "/clientes", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public String updateClientes(Clientes clientesNew) {
		return clientesService.updateCliente(clientesNew);
	}

}
