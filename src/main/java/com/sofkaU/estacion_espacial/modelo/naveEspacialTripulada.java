/**
 * 
 */
package com.sofkaU.estacion_espacial.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Esta clase permite crear un tipo de nave que su prop�sito
 * consiste en mandar seres humanos al espacio para tareas
 * de reparaci�n, mantenimiento o investigaci�n. (Moaramore, 2016).
 * 
 * 
 * @author DanielaAGonzalezH
 *
 */
@Entity
@Table(name = "nave_espacial_tripulada")
public class naveEspacialTripulada extends NaveEspacial{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column (name = "cantidad_personas")
	private int cantidadPersonas;
	@Column (name = "tipo_objetivo")
	@Enumerated(value = EnumType.STRING)
	private TipoObjetivoTripuladas tipoObjetivo;
	
	/**
	 * @param nombre
	 * @param pais
	 * @param actividad
	 * @param velocidad
	 * @param tipoCombustible
	 * @param peso
	 * @param alto
	 * @param tipo
	 * @param cantidadPersonas
	 * @param tipoObjetivo
	 */
	public naveEspacialTripulada(String nombre, String pais, Date actividad, double velocidad,
			String tipoCombustible, double peso, double alto, TipoNave tipo, int cantidadPersonas,
			TipoObjetivoTripuladas tipoObjetivo) {
		super(nombre, pais, actividad, velocidad, tipoCombustible, peso, alto, tipoCombustible);
		this.cantidadPersonas = cantidadPersonas;
		this.tipoObjetivo = tipoObjetivo;
	}
	/**
	 * @return the cantidadPersonas
	 */
	public int getCantidadPersonas() {
		return cantidadPersonas;
	}
	/**
	 * @param cantidadPersonas the cantidadPersonas to set
	 */
	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}
	/**
	 * @return the tipoObjetivo
	 */
	public TipoObjetivoTripuladas getTipoObjetivo() {
		return tipoObjetivo;
	}
	/**
	 * @param tipoObjetivo the tipoObjetivo to set
	 */
	public void setTipoObjetivo(TipoObjetivoTripuladas tipoObjetivo) {
		this.tipoObjetivo = tipoObjetivo;
	}
	
	
	public naveEspacialTripulada() {
		
	}
	
	
	
	
	

}
