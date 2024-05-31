package entity;

public class Pessoa {

	private String nomePessoa;
	private Integer idade;
	private String sexo;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nomePessoa, Integer idade, String sexo) {
		this.nomePessoa = nomePessoa;
		this.idade = idade;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "pessoa [nomePessoa=" + nomePessoa + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
