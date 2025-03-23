package model;

import javax.swing.JOptionPane;

public class EstrategiaAvanzada implements Estrategia{
	
	@Override
	public void calcularImpuestos() {
		JOptionPane.showMessageDialog(null, "Impuestos de la estrategia avanzada"
				+ "\nImpuestos 30%"
				+ "\nDescuento por hijos"
				+ "\nSe cobra mas por estar casado"
				+ "\nSe cobra por propiedad que tenga");
	}

	@Override
	public int calcularExoneracion() {
		return 1000;
	}

}
