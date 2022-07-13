/**
 * 
 */
package com.sofkaU.estacion_espacial.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sofkaU.estacion_espacial.InterfaceServices.InterfazNaveNoTripuladaService;
import com.sofkaU.estacion_espacial.modelo.VehiculoLanzadera;
import com.sofkaU.estacion_espacial.modelo.naveEspacialNoTripulada;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 * @since 11/07/2022
 *
 *Controlador que manipula el flujo de los servicios 
 *Rest de microservicios de naves no tripuladas
 *
 */
@RestController
@RequestMapping("/naves")
@CrossOrigin("http://localhost:8080/")
public class ControladorNaveNoTripulada {
	
	@Autowired
	private InterfazNaveNoTripuladaService interfazNaveNoTripuladaService;
	
	
	@GetMapping
	@RequestMapping(value = "listarNaveNoTripulada", method = RequestMethod.GET)	
	public ResponseEntity<?> listarLanzadera(){
		List<naveEspacialNoTripulada> naveNoTripulada = this.interfazNaveNoTripuladaService.listar();
		return ResponseEntity.ok(naveNoTripulada);
	}
	
	@PostMapping
	@RequestMapping(value = "guardarNaveNoTripulada", method = RequestMethod.POST)
	public ResponseEntity<?> guardarNaveNoTripulada(@RequestBody naveEspacialNoTripulada naveNoTripulada ){
		
		naveEspacialNoTripulada noTripulada = this.interfazNaveNoTripuladaService.guardarNaveNoTripulada(naveNoTripulada);
		return ResponseEntity.status(HttpStatus.CREATED).body(noTripulada);
		
	}
	
	@GetMapping("/buscarNaveNoTripulada/{nombre}")	
	public ResponseEntity<?> buscarNombreNoTripulada(@PathVariable String nombre ){
		List<naveEspacialNoTripulada> listavehiculoLan = this.interfazNaveNoTripuladaService.listarPorNombre(nombre);
		return ResponseEntity.status(HttpStatus.CREATED).body(listavehiculoLan);
		
	}
	

}
