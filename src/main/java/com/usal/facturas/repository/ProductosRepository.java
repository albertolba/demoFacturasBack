package com.usal.facturas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usal.facturas.entities.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Integer> {

}
