package entity;

public class Funcionario {

	private String nomeFuncionario;
	private Double salario;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nomeFuncionario, Double salario) {
		this.nomeFuncionario = nomeFuncionario;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nomeFuncionario=" + nomeFuncionario + ", salario=" + salario + "]";
	}
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
