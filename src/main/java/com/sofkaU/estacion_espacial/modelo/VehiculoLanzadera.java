/**
 * 
 */
package com.sofkaU.estacion_espacial.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Esta clase permite definir una nave espacial de tipo lanzadera
 * que trata de un cohete autopropulsado que sirve para lanzar
 * una carga �til al espacio, normalmente un 
 * sat�lite artificial. (Moaramore, 2016). 
 * 
 * @author DanielaAGonzalezH
 *
 */
@Entity
@Table (name = "vehiculo_lanzadera")
public class VehiculoLanzadera extends NaveEspacial{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long id;
	@Column(name = "capacidad_carga")
	private double capacidadCarga;
	private double potencia;
	@Column(name = "sistema_propulsion")
	private double sistemaPropulsion;
	@Column(name = "tipo_carga")
	private String tipoCarga;
	
	
	/**
	 * 
	 * @param nombre
	 * @param pais
	 * @param actividad
	 * @param velocidad
	 * @param tipoCombustible
	 * @param peso
	 * @param alto
	 * @param tipo
	 * @param capacidadCarga
	 * @param potencia
	 * @param sistemaPropulsion
	 * @param tipoCarga
	 */
	public VehiculoLanzadera(String nombre, String pais, Date actividad, double velocidad,
			 double peso, double alto, TipoNave tipo, double capacidadCarga,
			 String tipoCombustible,double potencia, double sistemaPropulsion, String tipoCarga) {
		super(nombre, pais, actividad, velocidad, tipoCombustible, peso, alto, tipoCarga);
		this.capacidadCarga = capacidadCarga;
		this.potencia = potencia;
		this.sistemaPropulsion = sistemaPropulsion;
		this.tipoCarga = tipoCarga;
	}
	
	public VehiculoLanzadera() {
		
	};
	
	/**
	 * @return the capacidadCarga
	 */
	public double getCapacidadCarga() {
		return capacidadCarga;
	}
	/**
	 * @param capacidadCarga the capacidadCarga to set
	 */	
	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	/**
	 * @return the potencia
	 */
	public double getPotencia() {
		return potencia;
	}
	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	/**
	 * @return the sistemaPropulsion
	 */
	public double getSistemaPropulsion() {
		return sistemaPropulsion;
	}
	/**
	 * @param sistemaPropulsion the sistemaPropulsion to set
	 */
	public void setSistemaPropulsion(double sistemaPropulsion) {
		this.sistemaPropulsion = sistemaPropulsion;
	}
	/**
	 * @return the tipoCarga
	 */
	public String getTipoCarga() {
		return tipoCarga;
	}
	/**
	 * @param tipoCarga the tipoCarga to set
	 */
	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	

	
	

}
