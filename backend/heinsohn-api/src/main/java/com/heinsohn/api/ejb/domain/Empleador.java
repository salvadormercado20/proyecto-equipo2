package com.heinsohn.api.ejb.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Empleador {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	
	@Column(name= "Id")
	
	private long Id;
	
	@Column(name= "nit", nullable=false, length = 120)
    
	private String nit;
	
	@Column(name= "razon social", nullable=false, length = 120)
	
	private String razonSocial;
	
	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	

}
