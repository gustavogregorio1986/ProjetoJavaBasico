package control;

import entity.Funcionario;

public class ControlaFuncionario {

	public Double CalcularSalario(Funcionario funcionario) {
		Double calculo = 0.0;
		if(funcionario.getSalario() > 2500) {
			calculo = funcionario.getSalario() * 0.2;
		}else if(funcionario.getSalario() >= 3000){
			calculo = funcionario.getSalario() * 0.3;
		}else if(funcionario.getSalario() >= 3500) {
			calculo = funcionario.getSalario() * 0.4;
		}else {
			calculo = funcionario.getSalario() * 0.5;
		}
		
		return calculo;
	}
	
	public Double calculoTotal(Funcionario funcionario) {
		Double calculo = 0.0;
		calculo = CalcularSalario(funcionario) + funcionario.getSalario();
		return calculo;
	}
}