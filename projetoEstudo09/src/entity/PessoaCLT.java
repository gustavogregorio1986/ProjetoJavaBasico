package entity;

public class PessoaCLT extends Pessoa{

	private String cpf;
	
	public PessoaCLT() {
		// TODO Auto-generated constructor stub
	}

	public PessoaCLT(String nomePessoa, String emailPessoa, String cpf) {
		super(nomePessoa, emailPessoa);
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "PessoaCLT [cpf=" + cpf + ", getCpf()=" + getCpf() + ", getNomePessoa()=" + getNomePessoa()
				+ ", getEmailPessoa()=" + getEmailPessoa() + "]";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
