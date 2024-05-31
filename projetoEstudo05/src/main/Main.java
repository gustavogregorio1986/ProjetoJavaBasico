package main;

import control.ControlaProduto;
import entity.Produto;

public class Main {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.setNomeProduto("caneta");
		produto.setDescricao("caneta preta bic escrita simpoles paar pessoas simples");
		produto.setPreco(4.5);
		produto.setQuantidade(4);
		
		System.out.println("Nome do produto: " + produto.getNomeProduto());
		System.out.println("Descrição: " + produto.getDescricao());
		System.out.println("Preço: " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getQuantidade());
		
		ControlaProduto cp = new ControlaProduto();
		System.out.println("Calculo: " + cp.calculoProduto(produto));
	}
}
