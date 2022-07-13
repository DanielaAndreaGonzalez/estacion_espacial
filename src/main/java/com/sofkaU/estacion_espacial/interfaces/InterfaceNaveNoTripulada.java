/**
 * 
 */
package com.sofkaU.estacion_espacial.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sofkaU.estacion_espacial.modelo.VehiculoLanzadera;
import com.sofkaU.estacion_espacial.modelo.naveEspacialNoTripulada;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 * @since 11/07/2022
 * Interface que contiene el CRUD con spring JPA para la tabla de nave no tripulada
 *
 */
@Repository
public interface InterfaceNaveNoTripulada extends CrudRepository<naveEspacialNoTripulada, Integer>{
	
	@Query(value="select * from nave_espacial_no_tripulada  where nombre like %:nombre%",nativeQuery = true)//busqueda por un solo campo
    List<naveEspacialNoTripulada> findByName(String nombre);

	
}
