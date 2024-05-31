package control;

import entity.Produto;

public class ControlaProduto {

	public Double calculoProduto(Produto produto) {
		Double calculo = 0.0;
		calculo = produto.getPreco() * produto.getQuantidade();
		return calculo;
	}
}
