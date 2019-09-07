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
	private final CalculadoraService calculadoraService;

	@Autowired
	public CalculadoraController(CalculadoraService calculadoraService) {
		this.calculadoraService = calculadoraService;
	}

	/**
	 * Suma dos numeros encapsulados en el objeto EntradaSumaDTO compuesto por dos
	 * Double que se pasa como un JSON como un String
	 *
	 * @return Resultado de la suma
	 */
	@GetMapping("/suma")
	public ResultadoDTO suma(@RequestBody String entrada) {
		Gson gson = new Gson();
		return calculadoraService.suma(gson.fromJson(entrada, EntradaDTO.class));
	}

	/**
	 * Resta dos numeros, el segundo al primero encapsulados en el objeto
	 * EntradaSumaDTO compuesto por dos Double que se pasa como un JSON como un
	 * String
	 *
	 * @return Resultado de la suma
	 */
	@GetMapping("/resta")
	public ResultadoDTO resta(@RequestBody String entrada) {
		Gson gson = new Gson();
		return calculadoraService.resta(gson.fromJson(entrada, EntradaDTO.class));
	}

}
