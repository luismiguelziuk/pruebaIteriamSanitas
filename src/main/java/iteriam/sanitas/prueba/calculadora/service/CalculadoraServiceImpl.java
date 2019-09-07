package iteriam.sanitas.prueba.calculadora.service;

import org.springframework.stereotype.Service;

import iteriam.sanitas.prueba.calculadora.dto.entrada.EntradaDTO;
import iteriam.sanitas.prueba.calculadora.dto.salida.ResultadoDTO;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

	@Override
	public ResultadoDTO suma(EntradaDTO entrada) {
		return new ResultadoDTO(entrada.getNumero1() + entrada.getNumero2());
	}

	@Override
	public ResultadoDTO resta(EntradaDTO entrada) {
		return new ResultadoDTO(entrada.getNumero1() - entrada.getNumero2());
	}

}
