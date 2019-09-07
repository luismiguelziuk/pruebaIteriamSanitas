package iteriam.sanitas.prueba.calculadora.dto.entrada;

public class EntradaDTO {

	Double numero1;
	Double numero2;

	public EntradaDTO(Double numero1, Double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public EntradaDTO() {
	}

	public Double getNumero1() {
		return numero1;
	}

	public void setNumero1(Double numero1) {
		this.numero1 = numero1;
	}

	public Double getNumero2() {
		return numero2;
	}

	public void setNumero2(Double numero2) {
		this.numero2 = numero2;
	}

	@Override
	public String toString() {
		return "EntradaSumaDTO [numero1=" + getNumero1() + ", numero2=" + getNumero2() + "]";
	}

}
