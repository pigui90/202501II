package service;

import javax.swing.JOptionPane;

import model.Contexto;
import model.EstrategiaAvanzada;
import model.EstrategiaNormal;
import model.Servidor;

public class Main {

	public static void main(String[] args) {
		
		Servidor servidor1 = Servidor.getServidor();
		
		JOptionPane.showMessageDialog(null, servidor1.getIp() + " - " + servidor1.getConexion(), "Servidor 1", JOptionPane.INFORMATION_MESSAGE);
		
		Servidor servidor2 = Servidor.getServidor();

		JOptionPane.showMessageDialog(null, servidor2.getIp() + " - " + servidor2.getConexion(), "Servidor 2", JOptionPane.INFORMATION_MESSAGE);

		Contexto contexto = new Contexto(new EstrategiaNormal());
		
		EstrategiaAvanzada estrategiaAvanzada = new EstrategiaAvanzada();
		
		Contexto contexto2 = new Contexto(estrategiaAvanzada);
		Contexto contexto3 = new Contexto();
		
		contexto3.setEstrategia(estrategiaAvanzada);
		
		
		contexto.calculaImpuesto();
		contexto2.calculaImpuesto();
		contexto3.calculaImpuesto();
		
		contexto3.setEstrategia(new EstrategiaNormal());
		
		contexto3.calculaImpuesto();

		
	}

}
