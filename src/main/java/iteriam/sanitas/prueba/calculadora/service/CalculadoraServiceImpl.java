package iteriam.sanitas.prueba.calculadora.service;

import org.springframework.stereotype.Service;

import io.corp.calculator.TracerImpl;
import iteriam.sanitas.prueba.calculadora.dto.entrada.EntradaDTO;
import iteriam.sanitas.prueba.calculadora.dto.salida.ResultadoDTO;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

	TracerImpl trazador = new TracerImpl();

	@Override
	public ResultadoDTO suma(EntradaDTO entrada) {
		ResultadoDTO result = new ResultadoDTO(entrada.getNumero1() + entrada.getNumero2());
		trazador.trace(result);
		return result;
	}

	@Override
	public ResultadoDTO resta(EntradaDTO entrada) {
		ResultadoDTO result = new ResultadoDTO(entrada.getNumero1() - entrada.getNumero2());
		trazador.trace(result);
		return result;
	}

}
