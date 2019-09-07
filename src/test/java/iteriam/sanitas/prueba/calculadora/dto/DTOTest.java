package iteriam.sanitas.prueba.calculadora.dto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import iteriam.sanitas.prueba.calculadora.dto.entrada.EntradaDTO;
import iteriam.sanitas.prueba.calculadora.dto.salida.ResultadoDTO;

@RunWith(MockitoJUnitRunner.class)
public class DTOTest {


	@Test
	public void testDTOEntrada() {
		EntradaDTO entrada = new EntradaDTO();
		entrada.setNumero1(2.0);
		entrada.setNumero2(1.5);
		entrada.toString();
	}
	
	@Test
	public void testDTORespuesta() {
		ResultadoDTO resultado = new ResultadoDTO();
		resultado.setResultado(0.0);
		resultado.toString();
	}
}
