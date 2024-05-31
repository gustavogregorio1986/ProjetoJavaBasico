package entity;

public class PessoaPJ extends Pessoa{

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	private String cnpj;
	
	public PessoaPJ() {
		// TODO Auto-generated constructor stub
	}

	public PessoaPJ(String nomePessoa, String emailPessoa, String cnpj) {
		super(nomePessoa, emailPessoa);
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return "PessoaPJ [cnpj=" + cnpj + ", getNomePessoa()=" + getNomePessoa() + ", getEmailPessoa()="
				+ getEmailPessoa() + "]";
	}
}
