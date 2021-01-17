package com.usal.facturas.entities;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "facturas")
public class Facturas {
	@Id
	@Column(name = "idfactura", nullable = false)
	private Integer idfactura;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Europe/Madrid")
	@Column(name = "fechaAlta", nullable = true)
	private Date fechaAlta;

	@Column(name = "total", nullable = true)
	private Double total;

	@Column(name = "descripcion", nullable = true)
	private String descripcion;

	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Clientes cliente;

	@ManyToMany(cascade = { CascadeType.PERSIST })
	@JoinTable(name = "factura_producto", joinColumns = {
			@JoinColumn(name = "idFactura", referencedColumnName = "idFactura") }, inverseJoinColumns = {
					@JoinColumn(name = "idProducto", referencedColumnName = "idProducto") })
	private Set<Productos> setProductos;


	/**
	 * @return the idfactura
	 */
	public Integer getIdfactura() {
		return idfactura;
	}

	/**
	 * @param idfactura the idfactura to set
	 */
	public void setIdfactura(Integer idfactura) {
		this.idfactura = idfactura;
	}

	/**
	 * @return the fechaAlta
	 */
	public Date getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the cliente
	 */
	public Clientes getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the setProductos
	 */
	public Set<Productos> getSetProductos() {
		return setProductos;
	}

	/**
	 * @param setProductos the setProductos to set
	 */
	public void setSetProductos(Set<Productos> setProductos) {
		this.setProductos = setProductos;
	}


}
