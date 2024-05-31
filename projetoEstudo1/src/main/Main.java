package main;

import java.util.ArrayList;
import java.util.List;

import entity.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNomeCliente("Marcos");
		cliente.setEmailCliente("marcos@gmail.com");
		cliente.setSexo("masculino");
		cliente.setCpf("1234567890");
		
		//System.out.println("Nome do Cliente: " + cliente.getNomeCliente());
		//System.out.println("Email do Cliente: " + cliente.getEmailCliente());
		//System.out.println("Sexo: " + cliente.getSexo());
		//System.out.println("Nome do Cliente: " + cliente.getCpf());
		
		Cliente cliente1 = new Cliente();
		cliente1.setNomeCliente("Michel");
		cliente1.setEmailCliente("michel@gmail.com");
		cliente1.setSexo("masculino");
		cliente1.setCpf("0987654321");
		
		//System.out.println("Nome do Cliente: " + cliente1.getNomeCliente());
		//System.out.println("Email do Cliente: " + cliente1.getEmailCliente());
		//System.out.println("Sexo: " + cliente1.getSexo());
		//System.out.println("Nome do Cliente: " + cliente1.getCpf());
		
		Cliente cliente2 = new Cliente();
		cliente2.setNomeCliente("Mario");
		cliente2.setEmailCliente("mario@gmail.com");
		cliente2.setSexo("masculino");
		cliente2.setCpf("7890123456");
		
		//System.out.println("Nome do Cliente: " + cliente2.getNomeCliente());
		//System.out.println("Email do Cliente: " + cliente2.getEmailCliente());
		//System.out.println("Sexo: " + cliente2.getSexo());
		//System.out.println("Nome do Cliente: " + cliente2.getCpf());
		
		Cliente cliente3 = new Cliente();
		cliente3.setNomeCliente("Gabriel");
		cliente3.setEmailCliente("gabriel@gmail.com");
		cliente3.setSexo("masculino");
		cliente3.setCpf("567134098");
		
		//System.out.println("Nome do Cliente: " + cliente3.getNomeCliente());
		//System.out.println("Email do Cliente: " + cliente3.getEmailCliente());
		//System.out.println("Sexo: " + cliente3.getSexo());
		//System.out.println("Nome do Cliente: " + cliente3.getCpf());
		
		Cliente cliente4 = new Cliente();
		cliente4.setNomeCliente("Alexnadre");
		cliente4.setEmailCliente("alexandre@gmail.com");
		cliente4.setSexo("masculino");
		cliente4.setCpf("9087123456");
		
		//System.out.println("Nome do Cliente: " + cliente4.getNomeCliente());
		//System.out.println("Email do Cliente: " + cliente4.getEmailCliente());
		//System.out.println("Sexo: " + cliente4.getSexo());
		//System.out.println("Nome do Cliente: " + cliente4.getCpf());
		
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		listaCliente.add(cliente);
		listaCliente.add(cliente1);
		listaCliente.add(cliente2);
		listaCliente.add(cliente3);
		listaCliente.add(cliente4);
		
		for (var item : listaCliente) {
			System.out.println(item);
		}
		
	}
}
