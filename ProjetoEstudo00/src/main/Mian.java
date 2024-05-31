package main;

import control.ControlaNumero;
import entity.Estudo;

public class Mian {

	public static void main(String[] args) {
		
		Estudo estudo = new Estudo();
		
		estudo.setNumero(43);
		
		System.out.println("Numero: " + estudo.getNumero());
		
		ControlaNumero cn = new ControlaNumero();
		System.out.println("o sucesso é: " + cn.Sucessor(estudo));
		
	}
}
