package entity;

public class Cliente {

	private String NomeCliente;
	private String emailCliente;
	private String sexo;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nomeCliente, String emailCliente, String sexo) {
		NomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Cliente [NomeCliente=" + NomeCliente + ", emailCliente=" + emailCliente + ", sexo=" + sexo + "]";
	}

	public String getNomeCliente() {
		return NomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
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
}
