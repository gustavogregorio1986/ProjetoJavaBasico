package control;

import entity.Estudo;

public class ControlaEstudo {

	public void ranger(Estudo estudo) {
		if(estudo.getNumero() <= 5) {
			System.out.println("concweito A");
		}else if(estudo.getNumero() <= 10) {
			System.out.println("concweito B");
		}else if(estudo.getNumero() <= 15) {
			System.out.println("concweito C");
		}else {
			System.out.println("concweito D");
		}
	}
}
