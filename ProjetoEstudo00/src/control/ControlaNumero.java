package control;

import entity.Estudo;

public class ControlaNumero {

	public Integer Sucessor(Estudo estudo) {
		Integer sucessor = 0;
		sucessor = estudo.getNumero() + 1;
		return sucessor;
	}
}
