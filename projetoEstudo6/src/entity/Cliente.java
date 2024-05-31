package entity;

public class Cliente {

	private String nomeCliente;
	private String emailCliente;
	private String cpf;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nomeCliente, String emailCliente, String cpf) {
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [nomeCliente=" + nomeCliente + ", emailCliente=" + emailCliente + ", cpf=" + cpf + "]";
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
}
