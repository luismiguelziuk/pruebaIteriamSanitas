package iteriam.sanitas.prueba.calculadora.service;

import iteriam.sanitas.prueba.calculadora.dto.entrada.EntradaDTO;
import iteriam.sanitas.prueba.calculadora.dto.salida.ResultadoDTO;

public interface CalculadoraService {

	public ResultadoDTO suma(EntradaDTO entrada);

	public ResultadoDTO resta(EntradaDTO entrada);
}
