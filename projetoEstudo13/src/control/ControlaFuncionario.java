package control;

import entity.Funcionario;

public class ControlaFuncionario {

	public Double calcularReajuste(Funcionario funcionario) {
		Double calculo = 0.0;
		calculo = funcionario.getSalario() * 0.5;
		return calculo;
	}
	
	public Double calcularTotal(Funcionario funcionario) {
		Double calculo = 0.0;
		calculo = funcionario.getSalario() + calcularReajuste(funcionario);
		return calculo;
	}
}
