package entity;

import Enum.EnumSituacao;

public class Empresa {

	private String nomeEmpresa;
	private String setor;
	private EnumSituacao situacao;
	
	public Empresa() {
		// TODO Auto-generated constructor stub
	}

	
    

	public Empresa(String nomeEmpresa, String setor, EnumSituacao situacao) {
		this.nomeEmpresa = nomeEmpresa;
		this.setor = setor;
		this.situacao = situacao;
	}




	@Override
	public String toString() {
		return "Empresa [nomeEmpresa=" + nomeEmpresa + ", setor=" + setor + ", situacao=" + situacao + "]";
	}



	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public EnumSituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(EnumSituacao situacao) {
		this.situacao = situacao;
	}
}
