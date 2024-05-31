package entity;

public class Pessoa {

	private String nomePessoa;
	private Integer idade;
	private String sexo;
	private String emailPessoa;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nomePessoa, Integer idade, String sexo, String emailPessoa) {
		this.nomePessoa = nomePessoa;
		this.idade = idade;
		this.sexo = sexo;
		this.emailPessoa = emailPessoa;
	}

	@Override
	public String toString() {
		return "Pessoa [nomePessoa=" + nomePessoa + ", idade=" + idade + ", sexo=" + sexo + ", emailPessoa="
				+ emailPessoa + "]";
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

	public String getEmailPessoa() {
		return emailPessoa;
	}

	public void setEmailPessoa(String emailPessoa) {
		this.emailPessoa = emailPessoa;
	}
}
