package com.usal.facturas.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "factura_producto")
public class FacturaProducto implements Serializable {
	/*
	 * Como realizar la relacion para obtener los datos cantidad y precio
	 * https://www.baeldung.com/jpa-many-to-many
	 */

	@EmbeddedId
	private FactProPK factProPK;

	@Column(name = "precio", nullable = true)
	private Double precio;

	@Column(name = "cantidad", nullable = true)
	private Double cantidad;

	/**
	 * @return the factProPK
	 */
	public FactProPK getFactProPK() {
		return factProPK;
	}

	/**
	 * @param factProPK the factProPK to set
	 */
	public void setFactProPK(FactProPK factProPK) {
		this.factProPK = factProPK;
	}

	/**
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * @return the cantidad
	 */
	public Double getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
}
