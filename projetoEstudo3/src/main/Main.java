package main;

import control.ControlaPessoa;
import entity.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNomePessoa("Pedro");
		pessoa.setIdade(34);
		pessoa.setSexo("masculino");
		
		System.out.println("Nome: " + pessoa.getNomePessoa());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Sexo: " + pessoa.getSexo());
		
		ControlaPessoa controlaPessoa = new ControlaPessoa();
		controlaPessoa.ControlaIdade(pessoa);
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNomePessoa("Marcos");
		pessoa1.setIdade(12);
		pessoa1.setSexo("masculino");
		
		System.out.println("Nome: " + pessoa1.getNomePessoa());
		System.out.println("Idade: " + pessoa1.getIdade());
		System.out.println("Sexo: " + pessoa1.getSexo());
		
		ControlaPessoa controlaPessoa1 = new ControlaPessoa();
		controlaPessoa1.ControlaIdade(pessoa1);
		
	}
}
