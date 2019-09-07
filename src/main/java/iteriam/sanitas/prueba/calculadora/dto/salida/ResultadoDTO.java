package iteriam.sanitas.prueba.calculadora.dto.salida;

public class ResultadoDTO {
	
	Double resultado;
	
	public ResultadoDTO(Double resultado) {
		this.resultado = resultado;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	
	@Override
	public String toString() {
		return "ResultadoSumaDTO [resultado=" + resultado + "]";
	}
}
