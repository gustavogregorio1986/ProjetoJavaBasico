package control;

import entity.Pessoa;

public class ControlaPessoa {

	public void ControlaIdade(Pessoa pessoa) {
		if(pessoa.getIdade() >= 18) {
			System.out.println(pessoa.getNomePessoa() + " tem " + pessoa.getIdade() + " maior de idade");
		}else {
			System.out.println(pessoa.getNomePessoa() + " tem " + pessoa.getIdade() + " menor de idade");
		}
	}
}
