package iteriam.sanitas.prueba.calculadora;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.fasterxml.classmate.TypeResolver;

@RunWith(MockitoJUnitRunner.class)
public class CalculadoraApplicationTest {

	CalculadoraApplication calculadoraApplication;

	@Before
	public void setUp() {
		TypeResolver typeResolver = new TypeResolver();
		calculadoraApplication = new CalculadoraApplication(typeResolver, "0.0.1");
	}

	@Test
	public void testApplication() {
		calculadoraApplication.swaggerApi();
	}

}
