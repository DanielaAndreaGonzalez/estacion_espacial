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
 * Esta clase permite crear una categor�a de nave muy nutrida, puesto que
 * no incluyen los s�telites artificiales que orbitan geoestacionalmente,su
 * objetivo estriba en estudiar otros cuerpos celestes.  
 *  
 * 
 * @author DanielaAGonzalezH
 *
 */

@Entity
@Table (name= "nave_espacial_no_tripulada")
public class naveEspacialNoTripulada extends NaveEspacial{

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@Column ( name = "cantidad_motores")
	private int cantidadMotores;
	@Column(name = "tipo_estudio")
	private String tipoEstudio;
	
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
   * @param cantidadMotores
   * @param tipoEstudio
   */
	public naveEspacialNoTripulada(String nombre, String pais, Date actividad, double velocidad,
			String tipoCombustible, double peso, double alto, TipoNave tipo, int cantidadMotores,
			String tipoEstudio) {
		super(nombre, pais, actividad, velocidad, tipoCombustible, peso, alto, tipoCombustible);
		this.cantidadMotores = cantidadMotores;
		this.tipoEstudio = tipoEstudio;
	}
	/**
	 * @return the cantidadMotores
	 */
	public int getCantidadMotores() {
		return cantidadMotores;
	}
	/**
	 * @param cantidadMotores the cantidadMotores to set
	 */
	public void setCantidadMotores(int cantidadMotores) {
		this.cantidadMotores = cantidadMotores;
	}
	/**
	 * @return the tipoEstudio
	 */
	public String getTipoEstudio() {
		return tipoEstudio;
	}
	/**
	 * @param tipoEstudio the tipoEstudio to set
	 */
	public void setTipoEstudio(String tipoEstudio) {
		this.tipoEstudio = tipoEstudio;
	}
	
	public naveEspacialNoTripulada() {
		
	}
	
	
	
	
	

}
