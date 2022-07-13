/**
 * 
 */
package com.sofkaU.estacion_espacial.interfaces;

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

}
