package main;

import control.ControlaFuncionario;
import entity.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNomeFuncionario("Luiz");
		funcionario.setSalario(4300.00);
		
		System.out.println("Nome do Funcionario: " + funcionario.getNomeFuncionario());
		System.out.println("Salario: " + funcionario.getSalario());
		
		ControlaFuncionario controlaFuncionario = new ControlaFuncionario();
		System.out.println("Calculo: " + controlaFuncionario.calcularReajuste(funcionario));
		
		System.out.println("Calculo total: " + controlaFuncionario.calcularTotal(funcionario));
		
	}
}