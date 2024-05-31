package control;

import entity.Pessoa;

public class ControlaPessoa {

	public void VerificarAlistamento(Pessoa pessoa) {
		if(pessoa.getIdade() >= 18 && pessoa.getSexo() == "masculino") {
			System.out.println(pessoa.getNomePessoa() + " pode se alistar");
		}else {
			System.out.println(pessoa.getNomePessoa() + " não pode se alistar");
		}
	}
}
