package main;

import Enum.EnumSituacao;
import control.ControlaEmpresa;
import entity.Empresa;

public class Main {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa("IBM","tecnologia",EnumSituacao.Desativo);
		
		System.out.println(empresa);
		
		ControlaEmpresa controlaEmpresa = new ControlaEmpresa();
		
		controlaEmpresa.Habilitado(empresa);
		
       
		
	}
}
