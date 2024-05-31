package entity;

public class Retangulo {

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	private Double base;
	private Double altura;
	
	public Retangulo() {
		// TODO Auto-generated constructor stub
	}

	public Retangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Retangulo [base=" + base + ", altura=" + altura + "]";
	}
}
