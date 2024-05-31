package projetoEstudo0.entity;

import projetoEstudo0.Enum.EnumTipo;

public class Telefone {

	private String numero;
	private EnumTipo tipo;
	private Cliente cliente;
	
	public Telefone() {
		// TODO Auto-generated constructor stub
	}

	public Telefone(String numero, EnumTipo tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Telefone [numero=" + numero + ", tipo=" + tipo + "]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public EnumTipo getTipo() {
		return tipo;
	}

	public void setTipo(EnumTipo tipo) {
		this.tipo = tipo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
