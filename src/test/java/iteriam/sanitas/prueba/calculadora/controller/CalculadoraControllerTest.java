package iteriam.sanitas.prueba.calculadora.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import iteriam.sanitas.prueba.calculadora.dto.entrada.EntradaDTO;
import iteriam.sanitas.prueba.calculadora.dto.salida.ResultadoDTO;
import iteriam.sanitas.prueba.calculadora.service.CalculadoraServiceImpl;

@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
public class CalculadoraControllerTest {

	private CalculadoraController controller;
	private CalculadoraServiceImpl calculadoraService;
	private String prueba;

	@Before
	public void setUp() {
		calculadoraService = Mockito.mock(CalculadoraServiceImpl.class);
		prueba = "{\"numero1\":\"1.5\", \"numero2\":\"2\"}";
		controller = new CalculadoraController(calculadoraService);
	}

	@Test
	public void testSuma() {
		Mockito.when(calculadoraService.suma(Matchers.any(EntradaDTO.class))).thenReturn(new ResultadoDTO(0.0));
		controller.suma(prueba);
	}

	@Test
	public void testResta() {
		Mockito.when(calculadoraService.resta(Matchers.any(EntradaDTO.class))).thenReturn(new ResultadoDTO(0.0));
		controller.resta(prueba);
	}
}
