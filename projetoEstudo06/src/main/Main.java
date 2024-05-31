package main;

import control.ControlaEstudo;
import entity.Estudo;

public class Main {

	public static void main(String[] args) {
		
		Estudo estudo = new Estudo();
		estudo.setPalavra("armario");
		
		System.out.println("Palavra e´: " + estudo.getPalavra());
		
		ControlaEstudo controlaEstudo = new ControlaEstudo();
		controlaEstudo.VogalOrNaoVogal(estudo);
		
	}
}
