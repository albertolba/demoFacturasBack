package com.usal.facturas.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class FactProPK implements Serializable {
	
	@Column(name = "idFactura", nullable = true)
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idFactura;

	@Column(name = "idProducto", nullable = true)
	private Integer idProducto;

	public FactProPK() {
		super();
	}

	public FactProPK(Integer idFactura, Integer idProducto) {
		super();
		this.idFactura = idFactura;
		this.idProducto = idProducto;
	}

	/**
	 * @return the idFactura
	 */
	public Integer getIdFactura() {
		return idFactura;
	}

	/**
	 * @param idFactura the idFactura to set
	 */
	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	/**
	 * @return the idProducto
	 */
	public Integer getIdProducto() {
		return idProducto;
	}

	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	@Override
	public String toString() {
		return "FactProPK [idFactura=" + idFactura + ", idProducto=" + idProducto + "]";
	}
	
	
}
