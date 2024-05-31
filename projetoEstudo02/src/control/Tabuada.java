package control;

import entity.Estudo;

public class Tabuada {

	public Integer calculoTabuada(Estudo estudo) {
		int resultado = 0;
		for(int i = 0; i <= 10; i++) {
			resultado = estudo.getNumero() * i;
			System.out.println(estudo.getNumero() + " X " + i + " = " + resultado);
		}
		return resultado;
	}
}
