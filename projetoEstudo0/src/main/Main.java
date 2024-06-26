package main;

import java.util.ArrayList;
import java.util.List;

import projetoEstudo0.Enum.EnumSexo;
import projetoEstudo0.Enum.EnumTipo;
import projetoEstudo0.entity.Cliente;
import projetoEstudo0.entity.Endereco;
import projetoEstudo0.entity.Telefone;

public class Main {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		
		Cliente cliente = new Cliente(endereco);
		cliente.setNomeCliente("pedro");
		cliente.setEmailCliente("pedro@gmail.com");
		cliente.setCpf("1234567890");
		cliente.setSexo(EnumSexo.Masculino);
		
		System.out.println("Nome do Cliente: " + cliente.getNomeCliente());
		System.out.println("Email do Cliente: " + cliente.getEmailCliente());
		System.out.println("Cpf do Cliente: " + cliente.getCpf());
		System.out.println("Sexo do Cliente: " + cliente.getSexo());
		
		cliente.getEndereco().setLogradourto("Rua x");
		cliente.getEndereco().setComplemento("numero 45");
		cliente.getEndereco().setBairro("flamengo");
		cliente.getEndereco().setCidade("Rio de Janeiro");
		cliente.getEndereco().setEstado("Rio de Janeiro");
		
		List<Telefone> listaTel = new ArrayList<Telefone>();
		
		Telefone telefone1 = new Telefone();
		telefone1.setTipo(EnumTipo.Residencial);
		telefone1.setNumero("278787873");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo(EnumTipo.Celular);
		telefone2.setNumero("9767899779");
		
		System.out.println("Tipo 1: " + telefone1.getTipo());
		System.out.println("Numero 1: " + telefone1.getNumero());
		
		System.out.println("Tipo 2: " + telefone2.getTipo());
		System.out.println("Numero 2: " + telefone2.getNumero());
		
		listaTel.add(telefone1);
		listaTel.add(telefone2);
		
		System.out.println(listaTel);
	}
}
