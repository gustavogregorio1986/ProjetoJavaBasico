package main;

import java.util.ArrayList;
import java.util.List;

import Enum.EnumSexo;
import entity.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		
		Pessoa pessoa = new Pessoa("Macio","marcio@gmaiul.com", EnumSexo.Masculino);
		Pessoa pessoa1 = new Pessoa("Luiz","luiz@gmaiul.com", EnumSexo.Masculino);
		Pessoa pessoa2 = new Pessoa("Alexandre","alexnadre@gmaiul.com", EnumSexo.Masculino);
		Pessoa pessoa3 = new Pessoa("Michel","michel@gmaiul.com", EnumSexo.Masculino);
		Pessoa pessoa4 = new Pessoa("Mario","mario@gmaiul.com", EnumSexo.Masculino);
		Pessoa pessoa5 = new Pessoa("Fernanda","fernanda@gmaiul.com", EnumSexo.Feminino);
		Pessoa pessoa6 = new Pessoa("Bruna","bruna@gmaiul.com", EnumSexo.Feminino);
		
		listaPessoa.add(pessoa);
		listaPessoa.add(pessoa1);
		listaPessoa.add(pessoa2);
		listaPessoa.add(pessoa3);
		listaPessoa.add(pessoa4);
		listaPessoa.add(pessoa5);
		listaPessoa.add(pessoa6);
		
		for (var item : listaPessoa) {
			System.out.println(item);
		}
		
	}
}
