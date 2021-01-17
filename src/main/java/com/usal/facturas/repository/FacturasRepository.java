package com.usal.facturas.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.usal.facturas.entities.Facturas;


public interface FacturasRepository extends JpaRepository<Facturas, Integer> {

}
