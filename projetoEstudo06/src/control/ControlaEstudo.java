package control;

import entity.Estudo;

public class ControlaEstudo {

	public void VogalOrNaoVogal(Estudo estudo) {
	  if(estudo.getPalavra() == "a" && estudo.getPalavra() == "e" && estudo.getPalavra() == "i" && estudo.getPalavra() == "o" && estudo.getPalavra() == "u") {
		  System.out.println("a palavra  tem " + estudo.getPalavra());
	  }else {
		  System.out.println("a palavra não tem " + estudo.getPalavra());
	  }
	}
}
