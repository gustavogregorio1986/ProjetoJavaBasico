package entity;

public class Pessoa {

	private String nomePessoa;
	private String emailPessoa;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nomePessoa, String emailPessoa) {
		this.nomePessoa = nomePessoa;
		this.emailPessoa = emailPessoa;
	}

	@Override
	public String toString() {
		return "Pessoa [nomePessoa=" + nomePessoa + ", emailPessoa=" + emailPessoa + "]";
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getEmailPessoa() {
		return emailPessoa;
	}

	public void setEmailPessoa(String emailPessoa) {
		this.emailPessoa = emailPessoa;
	}
}
