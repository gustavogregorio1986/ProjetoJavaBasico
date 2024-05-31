package control;

import entity.Idade;

public class ControlaIdade {

	public Integer calcularIdade(Idade idade) {
		Integer calculo = 0;
		calculo = (idade.getAno() * 360) + (idade.getMes() * 30) + idade.getDias();
		return calculo;
	}
}
