package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Sólo para probar que todo este funcionando.
@RestController
public class testController {
	
	@RequestMapping("/probando")
	public String saludoPrueba()
	{
		return "Está funcionando";
	}
}
