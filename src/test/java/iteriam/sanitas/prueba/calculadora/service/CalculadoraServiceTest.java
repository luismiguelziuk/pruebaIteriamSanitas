package iteriam.sanitas.prueba.calculadora.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import iteriam.sanitas.prueba.calculadora.dto.entrada.EntradaDTO;

@SpringBootTest
public class CalculadoraServiceTest {

	private CalculadoraServiceImpl calculadoraService = new CalculadoraServiceImpl();

	@Test
	public void testSuma() {
		EntradaDTO entrada = new EntradaDTO(1.5, 2.0);
		assertEquals(calculadoraService.suma(entrada).getResultado(), new Double(3.5));
	}

	@Test
	public void testResta() {
		EntradaDTO entrada = new EntradaDTO(1.5, 2.0);
		assertEquals(calculadoraService.resta(entrada).getResultado(), new Double(-0.5));
	}
}
