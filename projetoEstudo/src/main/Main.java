package main;

import entity.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNomeCliente("pedro");
		cliente.setEmailCliente("pedro@gmail.comm");
		cliente.setSexo("Masculino");
		
		System.out.print("Nome do cliente: " + cliente.getNomeCliente());
		System.out.print("Email do cliente: " + cliente.getEmailCliente());
		System.out.print("Sexo: " + cliente.getSexo());
	}
}
