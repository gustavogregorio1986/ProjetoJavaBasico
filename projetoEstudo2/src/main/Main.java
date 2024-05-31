package main;

import control.ControlaEstudo;
import entity.Estudo;

public class Main {

	public static void main(String[] args) {
		
		Estudo estudo = new Estudo();
		estudo.setNumero(4);
		
		System.out.println("Numero: " + estudo.getNumero());
		
		ControlaEstudo ce = new ControlaEstudo();
	    ce.ValoresNumericos(estudo);
		
	}
}
