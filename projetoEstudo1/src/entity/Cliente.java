package entity;

public class Cliente {

	private String nomeCliente;
	private String emailCliente;
	private String sexo;
	private String cpf;
	
	public Cliente() {
		
	}

	public Cliente(String nomeCliente, String emailCliente, String sexo, String cpf) {
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.sexo = sexo;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [nomeCliente=" + nomeCliente + ", emailCliente=" + emailCliente + ", sexo=" + sexo + ", cpf="
				+ cpf + "]";
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}