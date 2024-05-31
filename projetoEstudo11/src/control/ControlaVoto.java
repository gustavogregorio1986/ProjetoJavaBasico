package control;

import entity.Voto;

public class ControlaVoto {

	public Double calculopercentualBrancos(Voto voto) {
		Double calculo = 0.0;
		calculo = voto.getVotosBracos() / voto.getTotalEleitores() * 100;
		return calculo;
	}
	
	public Double calculoPercentualNullos(Voto voto) {
		Double calculo = 0.0;
		calculo = voto.getVotosNullos() / voto.getTotalEleitores() * 100;
		return calculo;
	}
	
	public Double calculoPercenrtualValidos(Voto voto) {
		Double calculo = 0.0;
		calculo = voto.getVotosValidos() / voto.getTotalEleitores() * 100;
		return calculo;
	}
}
