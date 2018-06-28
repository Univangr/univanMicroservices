package com.curso.microservicios.saludos;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Saludos")
public class SaludosController {

	@GetMapping("/{tipo}")
	public ResponseEntity<Saludo> get(
			@PathVariable String tipo) {

		if (tipo.equals("adios")) {
			return new ResponseEntity<Saludo>(new Saludo("AdiosAlmacen", "!!!!", null), HttpStatus.OK);
		} else {
			return new ResponseEntity<Saludo>(new Saludo("HolaAlmacen", "!!!!", null), HttpStatus.OK);
		}

	}
}
