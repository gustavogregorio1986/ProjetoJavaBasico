package main;

import control.Calculadora;
import entity.Estudo;

public class Main {

	public static void main(String[] args) {
		
		Estudo estudo = new Estudo();
		estudo.setNumero1(32);
		estudo.setNumero2(43);
		
		Calculadora calculadora = new Calculadora();
		System.out.println("A soma é: " + calculadora.Somar(estudo));
	
		Estudo estudo1 = new Estudo();
		estudo1.setNumero1(43);
		estudo1.setNumero2(12);
		
		Calculadora calculadora1 = new Calculadora();
		System.out.println("Subtrair: " + calculadora.subtracao(estudo1));
		
		Estudo estudo2 = new Estudo();
		estudo2.setNumero1(54);
		estudo2.setNumero2(21);
		
		Calculadora calculadora2 = new Calculadora();
		System.out.println("Multiplicar: " + calculadora2.multiplicar(estudo2));
		
		Estudo estudo3 = new Estudo();
		estudo3.setNumero1(90);
		estudo3.setNumero2(2);
		
		Calculadora calculadora3 = new Calculadora();
		System.out.println("Dividir: " + calculadora3.dividir(estudo3));
	}
}
