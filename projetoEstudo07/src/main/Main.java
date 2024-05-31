package main;

import control.ControlaEstudo;
import entity.Estudo;

public class Main {

	public static void main(String[] args) {
		
		Estudo estudo = new Estudo();
		estudo.setNumero(43);
		
		System.out.println("Numwero; " + estudo.getNumero());
		
		ControlaEstudo controlaEstudo = new ControlaEstudo();
		System.out.println("Calculo: " + controlaEstudo.CalcularEstudo(estudo));
		
	}
}
