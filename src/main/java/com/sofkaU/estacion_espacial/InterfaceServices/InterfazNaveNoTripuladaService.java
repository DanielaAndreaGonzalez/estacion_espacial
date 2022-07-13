/**
 * 
 */
package com.sofkaU.estacion_espacial.InterfaceServices;

import java.util.List;

import com.sofkaU.estacion_espacial.modelo.naveEspacialNoTripulada;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 * @since 11/07/2022
 * Interfaz que contiene los métodos de lógica de negocio para la nave no tripulada
 *
 */
public interface InterfazNaveNoTripuladaService {

	/**
	 * Método que permite listar las naves no tripuladas
	 * @return listado de naves no tripuladas
	 */
	public List<naveEspacialNoTripulada> listar();	
	/**
	 * Método que permite guardar una nave no tripulada
	 * @param vehiculo {@link naveEspacialNoTripulada} objeto nave a guardar
	 * @return nave no tripulada
	 */
	public naveEspacialNoTripulada guardarNaveNoTripulada(naveEspacialNoTripulada noTripulada);
	
}
