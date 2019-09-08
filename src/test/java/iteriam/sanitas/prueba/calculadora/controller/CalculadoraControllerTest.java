package iteriam.sanitas.prueba.calculadora.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import iteriam.sanitas.prueba.calculadora.dto.entrada.EntradaDTO;
import iteriam.sanitas.prueba.calculadora.dto.salida.ResultadoDTO;
import iteriam.sanitas.prueba.calculadora.service.CalculadoraServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class CalculadoraControllerTest {

	private CalculadoraController controller;
	private CalculadoraServiceImpl calculadoraService;
	private EntradaDTO prueba;

	@Before
	public void setUp() {
		calculadoraService = Mockito.mock(CalculadoraServiceImpl.class);
		controller = new CalculadoraController(calculadoraService);
		prueba = new EntradaDTO(1.0, 2.0);
	}

	@Test
	public void testSuma() {
		Mockito.when(calculadoraService.suma(prueba)).thenReturn(new ResultadoDTO(0.0));
		controller.suma(prueba);
	}

	@Test
	public void testResta() {
		Mockito.when(calculadoraService.resta(prueba)).thenReturn(new ResultadoDTO(0.0));
		controller.resta(prueba);
	}
}
