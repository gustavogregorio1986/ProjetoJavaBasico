package entity;

public class Funcionario {

	private String nomeFuncionario;
	private Double salario;
	private String cargo;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nomeFuncionario, Double salario, String cargo) {
		this.nomeFuncionario = nomeFuncionario;
		this.salario = salario;
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [nomeFuncionario=" + nomeFuncionario + ", salario=" + salario + ", cargo=" + cargo + "]";
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
