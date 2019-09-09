package iteriam.sanitas.prueba.calculadora.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import iteriam.sanitas.prueba.calculadora.dto.entrada.EntradaDTO;
import iteriam.sanitas.prueba.calculadora.dto.salida.ResultadoDTO;

@SpringBootTest
public class DTOTest {
	
	private String resultadoEntrada;
	private String resultadoRespuesta;

	@BeforeEach
	public void setUp() {
		resultadoEntrada = new EntradaDTO(2.0, 1.5).toString();
		resultadoRespuesta = new ResultadoDTO(0.0).toString();
	}

	@Test
	public void testDTOEntrada() {
		EntradaDTO entrada = new EntradaDTO();
		entrada.setNumero1(2.0);
		entrada.setNumero2(1.5);
		assertEquals(entrada.toString(), resultadoEntrada);
	}
	
	@Test
	public void testDTORespuesta() {
		ResultadoDTO resultado = new ResultadoDTO();
		resultado.setResultado(0.0);
		resultado.toString();
		assertEquals(resultado.toString(), resultadoRespuesta);
	}
}
