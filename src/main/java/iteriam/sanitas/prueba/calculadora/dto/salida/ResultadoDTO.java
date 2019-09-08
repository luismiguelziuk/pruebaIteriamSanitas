package iteriam.sanitas.prueba.calculadora.dto.salida;

import io.swagger.annotations.ApiModelProperty;

public class ResultadoDTO {

	@ApiModelProperty(value = "Resultado", required = true, example = "1", position = 1)
	Double resultado;

	public ResultadoDTO(Double resultado) {
		this.resultado = resultado;
	}

	public ResultadoDTO() {
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "ResultadoDTO [resultado=" + getResultado() + "]";
	}
}
