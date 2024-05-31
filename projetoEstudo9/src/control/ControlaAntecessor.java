package control;

import entity.Antecessor;

public class ControlaAntecessor {

	public Integer CalculoAbtebcessor(Antecessor antecessor) {
		Integer calculo = 0;
		calculo = antecessor.getNumero() - 1;
		return calculo;
	}
}
