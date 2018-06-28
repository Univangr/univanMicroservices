package com.curso.microservicios.holamundo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="almacensaludos")
public interface AlmacenSaludosService {
	
	@RequestMapping("/Saludos/{tipo}")
	public SaludoIn saludos (@PathVariable(name="tipo") String tipo);

}
