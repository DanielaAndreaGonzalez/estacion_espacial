/**
 * 
 */
package com.sofkaU.estacion_espacial.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sofkaU.estacion_espacial.modelo.VehiculoLanzadera;



/**
 * @author DanielaAGonzalezH
 * @version 1.0
 * @since 11/07/2022
 * Interface que contiene el CRUD con spring JPA para la tabla de vehículo lanzadera 
 */
@Repository
public interface InterfaceVehiculoLanzadera extends CrudRepository<VehiculoLanzadera, Integer>{
	@Query(value="select * from vehiculo_lanzadera  where nombre like %:nombre%",nativeQuery = true)//busqueda por un solo campo
    List<VehiculoLanzadera> findByName(String nombre);
}
