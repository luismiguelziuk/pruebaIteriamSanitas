package iteriam.sanitas.prueba.calculadora.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
	@ApiOperation(value = "Suma aritmetica", notes = "Devuelve la suma de dos elementos aritmeticos")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ResultadoDTO.class),
			@ApiResponse(code = 404, message = "Not Found", response = String.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = String.class) })
	@PostMapping("/suma")
	public @ResponseBody ResponseEntity<ResultadoDTO> suma(
			@ApiParam(value = "JSON con los numeros", required = true) @Valid @RequestBody EntradaDTO entrada) {
		ResultadoDTO resultado = calculadoraService.suma(entrada);
		return new ResponseEntity<>(resultado, HttpStatus.OK);
	}

	/**
	 * Resta dos numeros, el segundo al primero encapsulados en el objeto
	 * EntradaSumaDTO compuesto por dos Double que se pasa como un JSON como un
	 * String
	 *
	 * @return Resultado de la resta
	 */
	@ApiOperation(value = "Resta aritmetica", notes = "Devuelve la resta de dos elementos aritmeticos, el primero menos el segundo")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ResultadoDTO.class),
			@ApiResponse(code = 404, message = "Not Found", response = String.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = String.class) })
	@PostMapping("/resta")
	public @ResponseBody ResponseEntity<ResultadoDTO> resta(
			@ApiParam(value = "JSON con los numeros", required = true) @Valid @RequestBody EntradaDTO entrada) {
		ResultadoDTO resultado = calculadoraService.resta(entrada);
		return new ResponseEntity<>(resultado, HttpStatus.OK);
	}

}
