package com.heinsohn.api.ejb;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import com.heinsohn.api.ejb.dao.DAO;
import com.heinsohn.api.ejb.dao.OperacionDao;
import com.heinsohn.api.ejb.domain.Empleado;

@Local
@Stateless(name = "EmpleadoEJB")

public class EmpleadoEJB extends DAO implements OperacionDao<Empleado> {

	public List<Empleado> consultarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Empleado consultarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean eliminarPorID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Empleado insertar(Empleado d) {
		// TODO Auto-generated method stub
		return null;
	}

	public Empleado actualizar(Empleado d) {
		// TODO Auto-generated method stub
		return null;
	}

}
