package main;

import control.ControlaIdade;
import entity.Idade;

public class Main {

	public static void main(String[] args) {
		
		Idade idade = new Idade();
		idade.setAno(1987);
		idade.setMes(05);
		idade.setDias(13);
		
		System.out.println("Ano: " + idade.getAno());
		System.out.println("Mes: " + idade.getMes());
		System.out.println("Dia: " + idade.getDias());
		
		ControlaIdade ci = new ControlaIdade();
 		System.out.println("Calculo: " + ci.calcularIdade(idade));
		
	}
}
