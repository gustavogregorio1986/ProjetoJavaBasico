package main;

import control.ControlaAntecessor;
import entity.Antecessor;

public class Main {

	public static void main(String[] args) {
		
		Antecessor antecessor = new Antecessor();
		
		antecessor.setNumero(43);
		
		System.out.println("O numero é: " + antecessor.getNumero());
		
		ControlaAntecessor ca = new ControlaAntecessor();
		System.out.println("O numero antecessor é: " + ca.CalculoAbtebcessor(antecessor));
		
	}
}
