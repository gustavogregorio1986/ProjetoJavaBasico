package main;

import control.ControlaPessoa;
import entity.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNomePessoa("ana");
		pessoa.setIdade(34);
		pessoa.setSexo("feminino");
		pessoa.setEmailPessoa("marcos@gmail.com");
		
		System.out.println("Nome da Pessoa: " + pessoa.getNomePessoa());
		System.out.println("Sexo: " + pessoa.getSexo());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Nome da Pessoa: " + pessoa.getEmailPessoa());
		
		ControlaPessoa controlaPessoa = new ControlaPessoa();
		controlaPessoa.VerificarAlistamento(pessoa);
	}
}
