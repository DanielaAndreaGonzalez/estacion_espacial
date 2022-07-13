/**
 * 
 */
package com.sofkaU.estacion_espacial.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Esta clase permite 
 * @author DanielaAGonzalezH
 *
 */
@MappedSuperclass
public class NaveEspacial {
	
	
	//Declaracion  de atributos	
	private String nombre;
	private String pais;
	private Date actividad;
	private double velocidad;
	private String tipoCombustible;
	private double peso;
	private double alto;
	private String tipo;
	
	
	/**
	 * 
	 *
	 * @param nombre
	 * @param pais
	 * @param actividad
	 * @param velocidad
	 * @param tipoCombustible
	 * @param peso
	 * @param alto
	 * @param tipo
	 */
	
	public NaveEspacial(String nombre, String pais, Date actividad, double velocidad,
			String tipoCombustible,double peso, double alto, String tipo) {		
		
		this.nombre = nombre;
		this.pais = pais;
		this.actividad = actividad;
		this.velocidad = velocidad;	
		this.tipoCombustible = tipoCombustible;
		this.peso = peso;
		this.alto = alto;
		this.tipo = tipo;
	}
	
	public NaveEspacial() {
		
	};
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	/**
	 * @return the actividad
	 */
	public Date getActividad() {
		return actividad;
	}
	/**
	 * @param actividad the actividad to set
	 */
	public void setActividad(Date actividad) {
		this.actividad = actividad;
	}
	/**
	 * @return the velocidad
	 */
	public double getVelocidad() {
		return velocidad;
	}
	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	/**
	 * @return the tipoCombustible
	 */
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	
	/**
	 * @param tipoCombustible the tipoCombustible to set
	 */
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * @return the alto
	 */
	public double getAlto() {
		return alto;
	}
	/**
	 * @param alto the alto to set
	 */
	public void setAlto(double alto) {
		this.alto = alto;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	

