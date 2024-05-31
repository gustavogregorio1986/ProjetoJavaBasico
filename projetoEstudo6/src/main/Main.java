package main;

import java.util.ArrayList;
import java.util.List;

import entity.Cliente;

public class Main {

	public static void main(String[] args) {
		
	    List<Cliente> listaCliente = new ArrayList<Cliente>();
	    
	    Cliente cliente = new Cliente("cassio","cassio@gmail.com","0987654321");
	    Cliente cliente1 = new Cliente("luiz","luiz@gmail.com","1234567890");
	    Cliente cliente2 = new Cliente("michel","michel@gmail.com","7654123098");
	    Cliente cliente3 = new Cliente("Bruna","bruna@gmail.com","0987654321");
	    Cliente cliente4 = new Cliente("sergio","sergio@gmail.com","7651234098");
	    
	    listaCliente.add(cliente);
	    listaCliente.add(cliente1);
	    listaCliente.add(cliente2);
	    listaCliente.add(cliente3);
	    listaCliente.add(cliente4);
	    
	    for (var cli : listaCliente) {
			System.out.println(cli);
		}
		
	}
}
