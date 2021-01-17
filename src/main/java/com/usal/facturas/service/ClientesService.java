package com.usal.facturas.service;

import java.util.List;
import java.util.Optional;

import com.usal.facturas.entities.Clientes;

public interface ClientesService {
	public List<Clientes> findAllCliente();

	public Optional<Clientes> findClienteById(Integer id);

	public Clientes saveCliente(Clientes clienteNew);

	public String deleteCliente(Integer id);

	public String updateCliente(Clientes clienteNew);

}
