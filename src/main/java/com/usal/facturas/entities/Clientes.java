package com.usal.facturas.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCliente", nullable = false)
	private Integer idCliente;

	@Column(name = "nombre", nullable = true)
	private String nombre;

	@Column(name = "direccion", nullable = true)
	private String direccion;

	@Column(name = "tlf", nullable = false)
	private Integer tlf;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "localidad", nullable = true)
	private String localidad;

	@Column(name = "provincia", nullable = true)
	private String provincia;

	@Column(name = "cp", nullable = true)
	private Integer cp;

	/**
	 * @return the idCliente
	 */
	public Integer getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the tlf
	 */
	public Integer getTlf() {
		return tlf;
	}

	/**
	 * @param tlf the tlf to set
	 */
	public void setTlf(Integer tlf) {
		this.tlf = tlf;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	/**
	 * @return the cp
	 */
	public Integer getCp() {
		return cp;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(Integer cp) {
		this.cp = cp;
	}

}
