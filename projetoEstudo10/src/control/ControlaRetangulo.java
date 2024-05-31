package control;

import entity.Retangulo;

public class ControlaRetangulo {

	public Double calcularRetangulo(Retangulo retangulo) {
		Double calculo = 0.0;
		calculo = (retangulo.getAltura() * retangulo.getBase());
		return calculo;
	}
}
