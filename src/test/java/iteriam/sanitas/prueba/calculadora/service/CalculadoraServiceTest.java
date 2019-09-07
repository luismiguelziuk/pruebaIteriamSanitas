package iteriam.sanitas.prueba.calculadora.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import iteriam.sanitas.prueba.calculadora.dto.entrada.EntradaDTO;

@RunWith(MockitoJUnitRunner.class)
public class CalculadoraServiceTest {

	private CalculadoraServiceImpl calculadoraService = new CalculadoraServiceImpl();

	@Test
	public void testSuma() {
		EntradaDTO entrada = new EntradaDTO(1.5, 2.0);
		calculadoraService.suma(entrada);
	}
	
	@Test
	public void testResta() {
		EntradaDTO entrada = new EntradaDTO(1.5, 2.0);
		calculadoraService.resta(entrada);
	}
}
