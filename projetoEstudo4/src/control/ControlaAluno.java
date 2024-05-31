package control;

import entity.Aluno;

public class ControlaAluno {

	public Double CalcularAluno(Aluno aluno) {
		Double calculo = 0.0;
		calculo = (aluno.getNota1() + aluno.getNota2())/2;
		if(calculo >= 7.0) {
			 System.out.println("Aprovado!");
		}else if(calculo > 3.0 && calculo < 6.0) {
			 calculo = (aluno.getNota1() + aluno.getNota2())/2;
		}else {
			System.out.println("Reprovado!");
		}
		return calculo;
	}
	
	public void SituacaoRecuperacao(Aluno aluno) {
		if(CalcularAluno(aluno) >= 5.0) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado");
		}
	}
}
