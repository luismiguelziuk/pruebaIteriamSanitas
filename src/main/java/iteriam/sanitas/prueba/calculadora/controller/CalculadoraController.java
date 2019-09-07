package iteriam.sanitas.prueba.calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import iteriam.sanitas.prueba.calculadora.dto.entrada.EntradaDTO;
import iteriam.sanitas.prueba.calculadora.dto.salida.ResultadoDTO;
import iteriam.sanitas.prueba.calculadora.service.CalculadoraService;

@RestController
@RequestMapping("/calculadora") 
public class CalculadoraController {
	@Autowired
	private CalculadoraService calculadoraService;
	
	  /**
	   * Suma dos numeros encapsulados en el ojeto EntradaSumaDTO compuesto por dos Double
	   *
	   * @return Resultado de la suma 
	   */
	@GetMapping("/suma")
	public ResultadoDTO suma(@RequestBody String entrada) {
		Gson gson = new Gson();
		return calculadoraService.sumar(gson.fromJson(entrada, EntradaDTO.class));
	}
	

}
