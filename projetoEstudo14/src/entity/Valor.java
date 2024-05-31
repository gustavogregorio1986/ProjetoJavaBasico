package entity;

public class Valor {

	private Double custoFabrica;
	private Double PERCENTUAL_IMPOSTOS;
	private Double valorDistribuidor;
	
	public Valor() {
		// TODO Auto-generated constructor stub
	}

	public Valor(Double custoFabrica, Double pERCENTUAL_IMPOSTOS, Double valorDistribuidor) {
		this.custoFabrica = custoFabrica;
		PERCENTUAL_IMPOSTOS = pERCENTUAL_IMPOSTOS;
		this.valorDistribuidor = valorDistribuidor;
	}
	
	@Override
	public String toString() {
		return "Valor [custoFabrica=" + custoFabrica + ", PERCENTUAL_IMPOSTOS=" + PERCENTUAL_IMPOSTOS
				+ ", valorDistribuidor=" + valorDistribuidor + "]";
	}
	
	public Double getCustoFabrica() {
		return custoFabrica;
	}

	public void setCustoFabrica(Double custoFabrica) {
		this.custoFabrica = custoFabrica;
	}

	public Double getPERCENTUAL_IMPOSTOS() {
		return PERCENTUAL_IMPOSTOS;
	}

	public void setPERCENTUAL_IMPOSTOS(Double pERCENTUAL_IMPOSTOS) {
		PERCENTUAL_IMPOSTOS = pERCENTUAL_IMPOSTOS;
	}

	public Double getValorDistribuidor() {
		return valorDistribuidor;
	}

	public void setValorDistribuidor(Double valorDistribuidor) {
		this.valorDistribuidor = valorDistribuidor;
	}
}
