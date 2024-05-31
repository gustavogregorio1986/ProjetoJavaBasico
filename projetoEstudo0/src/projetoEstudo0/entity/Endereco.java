package projetoEstudo0.entity;

public class Endereco {

	private String logradourto;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private Cliente cliente;
	
	public Endereco() {
	}

	public Endereco(String logradourto, String complemento, String bairro, String cidade, String estado) {
		this.logradourto = logradourto;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereco [logradourto=" + logradourto + ", complemento=" + complemento + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", estado=" + estado + "]";
	}

	public String getLogradourto() {
		return logradourto;
	}

	public void setLogradourto(String logradourto) {
		this.logradourto = logradourto;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
