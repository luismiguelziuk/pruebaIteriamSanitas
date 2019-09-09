package iteriam.sanitas.prueba.calculadora.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import iteriam.sanitas.prueba.calculadora.dto.entrada.EntradaDTO;
import iteriam.sanitas.prueba.calculadora.dto.salida.ResultadoDTO;
import iteriam.sanitas.prueba.calculadora.service.CalculadoraServiceImpl;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CalculadoraControllerTest {

	private CalculadoraController controller;
	private CalculadoraServiceImpl calculadoraService;
	private EntradaDTO prueba;
	private ResultadoDTO resultadoResta;
	private ResultadoDTO resultadoSuma;

	@BeforeEach
	public void setUp() {
		calculadoraService = Mockito.mock(CalculadoraServiceImpl.class);
		controller = new CalculadoraController(calculadoraService);
		prueba = new EntradaDTO(1.0, 2.0);
		resultadoResta = new ResultadoDTO(-1.0);
		resultadoSuma = new ResultadoDTO(3.0);
	}

	@Test
	public void testSuma() {
		Mockito.when(calculadoraService.suma(prueba)).thenReturn(resultadoSuma);
		assertEquals(controller.suma(prueba).getBody().getResultado(), new Double(3.0));
	}

	@Test
	public void testResta() {
		Mockito.when(calculadoraService.resta(prueba)).thenReturn(resultadoResta);
		assertEquals(controller.resta(prueba).getBody().getResultado(), new Double(-1.0));
	}
}
