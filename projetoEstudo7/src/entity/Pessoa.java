package entity;

import Enum.EnumSexo;

public class Pessoa {

	private String nomePessoa;
	private String emailPessoa;
	private EnumSexo sexo;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nomePessoa, String emailPessoa, EnumSexo sexo) {
		this.nomePessoa = nomePessoa;
		this.emailPessoa = emailPessoa;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nomePessoa=" + nomePessoa + ", emailPessoa=" + emailPessoa + ", sexo=" + sexo + "]";
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

	public EnumSexo getSexo() {
		return sexo;
	}

	public void setSexo(EnumSexo sexo) {
		this.sexo = sexo;
	}
}
