package entity;

public class Idade {

	private Integer ano;
	private Integer mes;
	private Integer dias;
	
	public Idade() {
		// TODO Auto-generated constructor stub
	}

	public Idade(Integer ano, Integer mes, Integer dias) {
		this.ano = ano;
		this.mes = mes;
		this.dias = dias;
	}
	
	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}
	
}
