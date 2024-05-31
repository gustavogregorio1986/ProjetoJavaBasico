package projetoEstudo0.entity;

import java.util.List;

import projetoEstudo0.Enum.EnumSexo;

public class Cliente {

	private String nomeCliente;
	private String emailCliente;
	private String cpf;
	private EnumSexo sexo;
	private Endereco endereco;
	private List<Telefone> Telefones;
	
	
	public Cliente() {
	}
	
	public Cliente(String nomeCliente, String emailCliente, String cpf, EnumSexo sexo) {
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public Cliente(Endereco endereco) {
		super();
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [nomeCliente=" + nomeCliente + ", emailCliente=" + emailCliente + ", cpf=" + cpf + ", sexo="
				+ sexo + ", endereco=" + endereco + "]";
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public EnumSexo getSexo() {
		return sexo;
	}

	public void setSexo(EnumSexo sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return Telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		Telefones = telefones;
	}
	
	
}