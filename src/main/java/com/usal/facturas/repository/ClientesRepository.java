package com.usal.facturas.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.usal.facturas.entities.Clientes;


public interface ClientesRepository extends JpaRepository<Clientes, Integer> {

}
