package main;

import control.ControlaFuncionario;
import entity.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNomeFuncionario("Marcos");
		funcionario.setCargo("desenvolkvedor");
		funcionario.setSalario(4300.00);
		
		ControlaFuncionario cf = new ControlaFuncionario();
		System.out.println("O calculo: " + cf.calculoTotal(funcionario));
		
	}
}
