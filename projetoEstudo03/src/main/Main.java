package main;

import control.ControlaMes;
import entity.Mes;

public class Main {

	public static void main(String[] args) {
		
		Mes mes = new Mes();
		
		mes.setNumero(8);
		
		System.out.println("Numero: " + mes.getNumero());
		
		ControlaMes controlaMes = new ControlaMes();
		controlaMes.NumeroMes(mes);
		
	}
}
