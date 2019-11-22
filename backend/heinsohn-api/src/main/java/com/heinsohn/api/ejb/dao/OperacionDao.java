package com.heinsohn.api.ejb.dao;

import java.util.List;
/**
 * Es un contrato ynos permite exponer las diferentes opreaciones a la base de datos o de persistencia
 * @author Juan S. Mercado
 *<D> Es un generic, y nos va a seeervir para generar los metodos CRUD de nuestra aplicacion
 * @param <D>
 */
public interface OperacionDao<D> {
	
	List<D> consultarTodos();
	
    D consultarPorId(long id);
    
    Boolean eliminarPorID(long id);
    
    D insertar(D d);
    
    D actualizar(D d);
}
