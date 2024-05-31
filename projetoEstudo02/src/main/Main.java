package main;

import control.Tabuada;
import entity.Estudo;

public class Main {

	public static void main(String[] args) {
		
		Estudo estudo = new Estudo();
		estudo.setNumero(7);
		
		Tabuada tabuada = new Tabuada();
		System.out.println(tabuada.calculoTabuada(estudo));
		
	}
}
