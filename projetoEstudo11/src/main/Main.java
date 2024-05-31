package main;

import control.ControlaVoto;
import entity.Voto;

public class Main {

	public static void main(String[] args) {
		
		 Voto voto = new Voto();
		 voto.setTotalEleitores(45.43);
		 voto.setVotosBracos(32.1);
		 voto.setVotosNullos(3.2);
		 voto.setVotosValidos(2.1);
		 
		 System.out.println("Total de Eleitores: " + voto.getTotalEleitores());
		 System.out.println("Votos Brancos: " + voto.getVotosBracos());
		 System.out.println("Votios Nullos: " +  voto.getVotosNullos());
		 System.out.println("Votos Validos: " + voto.getVotosValidos());
		 
		 ControlaVoto controlaVoto = new ControlaVoto();
		 
		 System.out.println("votos va,lidos: " + controlaVoto.calculoPercenrtualValidos(voto));
		 System.out.println("Votos Brancos: " + controlaVoto.calculopercentualBrancos(voto));
		 System.out.println("Votos Nullos: " + controlaVoto.calculoPercentualNullos(voto));
		
	}
}
