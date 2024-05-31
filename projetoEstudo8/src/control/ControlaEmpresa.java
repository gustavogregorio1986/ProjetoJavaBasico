package control;

import Enum.EnumSituacao;
import entity.Empresa;

public class ControlaEmpresa {

	public void Habilitado(Empresa empresa) {
		EnumSituacao situacao = EnumSituacao.Ativo;
		
		 if (situacao == EnumSituacao.Ativo) {
	            System.out.println("Empresa ativa");
	     } else if (situacao == EnumSituacao.Desativo) {
	            System.out.println("Empresa inativa");
	     }
	}
}
