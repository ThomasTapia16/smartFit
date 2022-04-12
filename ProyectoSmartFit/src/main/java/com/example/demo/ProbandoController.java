package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//clase solo de prueba
@RestController
public class ProbandoController {
	
	@RequestMapping("/probando")
	public String prueba() {
		return "funcionando correctamente";
	}
}
