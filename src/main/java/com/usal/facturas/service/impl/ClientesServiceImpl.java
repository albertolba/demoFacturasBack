package com.usal.facturas.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usal.facturas.entities.Clientes;
import com.usal.facturas.repository.ClientesRepository;
import com.usal.facturas.service.ClientesService;


@Service
public class ClientesServiceImpl implements ClientesService {

	@Autowired
	ClientesRepository clientesRepository;

	@Override
	public List<Clientes> findAllCliente() {

		return clientesRepository.findAll();
	}

	@Override
	public Optional<Clientes> findClienteById(Integer id) {

		return clientesRepository.findById(id);
	}

	@Override
	public Clientes saveCliente(Clientes clienteNew) {

		return clienteNew != null ? clientesRepository.save(clienteNew) : new Clientes();
	}

	@Override
	public String deleteCliente(Integer id) {
		if (clientesRepository.findById(id).isPresent()) {
			clientesRepository.deleteById(id);
			return "Cliente eliminado correctamente.";
		}
		return "Error! El Cliente no existe";
	}

	@Override
	public String updateCliente(Clientes clienteNew) {
		Integer num = clienteNew.getIdCliente();
		if (clientesRepository.findById(num).isPresent()) {
			clientesRepository.save(clienteNew);
			return "Cliente modificado";
		}
		return "Error al modificar el cliente";
	}

}
