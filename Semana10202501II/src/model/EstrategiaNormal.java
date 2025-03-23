package model;

import javax.swing.JOptionPane;

public class EstrategiaNormal implements Estrategia{

	@Override
	public void calcularImpuestos() {
		JOptionPane.showMessageDialog(null, "Impuestos de la estrategia normal"
				+ "\nImpuestos 20%");
	}

	@Override
	public int calcularExoneracion() {
		return 100;
	}
	
	public void pedirDatos() {
		JOptionPane.showInputDialog("Puedo tener metodos diferentes o que no esten en el interface");
	}

}
