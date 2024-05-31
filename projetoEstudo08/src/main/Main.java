package main;

import control.ControlaEstudo;
import entity.Estudo;

public class Main {

	public static void main(String[] args) {
		
		Estudo estudo = new Estudo();
		estudo.setNumero(15);
		
		ControlaEstudo controlaEstudo = new ControlaEstudo();
		controlaEstudo.ranger(estudo);
		
	}
}
