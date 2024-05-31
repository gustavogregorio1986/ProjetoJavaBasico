package control;

import entity.Estudo;

public class Calculadora {

	public Integer Somar(Estudo estudo) {
		Integer somar = 0;
		somar = estudo.getNumero1() + estudo.getNumero2();
		return somar;
	}
	
	public Integer subtracao(Estudo estudo) {
		Integer subtracao = 0;
		subtracao = estudo.getNumero1() - estudo.getNumero2();
		return subtracao;
	}
	
	public Integer multiplicar(Estudo estudo) {
		Integer multiplicar = 0;
		multiplicar = estudo.getNumero1() * estudo.getNumero2();
		return multiplicar;
	}
	
	public Integer dividir(Estudo estudo) {
		Integer dividir = 0;
		try {
			if(estudo.getNumero2() > 0)
			{
				dividir = estudo.getNumero1() / estudo.getNumero2();
			}else {
				throw new Exception(" não pode ser dividoido pro zero");
			}
		}catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		return dividir;
	}
}
