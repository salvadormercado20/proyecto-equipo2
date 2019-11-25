package com.heinsohn.api.ejb;

import javax.ejb.Local;

import javax.ejb.Stateless;

import com.heinsohn.api.ejb.dao.DAO;

import com.heinsohn.api.ejb.dao.OperacionDao;

import com.heinsohn.api.ejb.domain.Empleador;

@Local
@Stateless(name = "EmpleadorEJB")

public class EmpleadorEJB extends DAO implements OperacionDao<Empleador> {

	public java.util.List<Empleador> consultarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Empleador consultarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean eliminarPorID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Empleador insertar(Empleador d) {
		// TODO Auto-generated method stub
		return null;
	}

	public Empleador actualizar(Empleador d) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
