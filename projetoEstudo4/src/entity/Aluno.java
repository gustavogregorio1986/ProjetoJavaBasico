package entity;

public class Aluno {

	private String nomeAluno;
	private Double nota1;
	private Double nota2;
	private Double recuperacao;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nomeAluno, Double nota1, Double nota2, Double recuperacao) {
		this.nomeAluno = nomeAluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.recuperacao = recuperacao;
	}

	@Override
	public String toString() {
		return "Aluno [nomeAluno=" + nomeAluno + ", nota1=" + nota1 + ", nota2=" + nota2 + ", recuperacao="
				+ recuperacao + "]";
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getRecuperacao() {
		return recuperacao;
	}

	public void setRecuperacao(Double recuperacao) {
		this.recuperacao = recuperacao;
	}
}
