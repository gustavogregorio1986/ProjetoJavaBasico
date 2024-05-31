package main;

import control.ControlaRetangulo;
import entity.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo();
		retangulo.setAltura(3.4);
		retangulo.setBase(7.5);
		
		System.out.println("Altura: " + retangulo.getAltura());
		System.out.println("Base: " + retangulo.getBase());
		
		ControlaRetangulo cr = new ControlaRetangulo();
		System.out.println("calculo do retanguloi é: " + cr.calcularRetangulo(retangulo));
		
	}
}
