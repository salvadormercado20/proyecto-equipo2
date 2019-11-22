package com.heinsohn.api.ejb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
//Nos permite decirle al JPA el objeto puede ser persistido
@Entity
//Nos permite crear una tabla en base de datos
@Table(name="tbl_empleados")

public class Empleado {
	//Permite crear y configurar una columna en la table
	
	@Column(name="emp_identificacion", nullable = false, unique=true, length = 20)
	private String identificacion;
	
	@Column(name = "emp_nombre", nullable = false, length = 80)
	private String nombre;
	
	@Column(name = "emp_apellido", nullable = false, length = 80)
	private String apellido;
	
	@Column(name = "emp_telefono", nullable = false, length = 15)
	private String telefono;
	

	public String getIdentificacion() {
		return identificacion;
	}
	
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
