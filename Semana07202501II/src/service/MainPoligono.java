package service;

import javax.swing.JOptionPane;

import model.Cuadrado;

public class MainPoligono {

	public static void main(String[] args) {
		
		Cuadrado cuadrado = new Cuadrado(4, 10);
		
		JOptionPane.showMessageDialog(null, cuadrado.calculaArea());
		JOptionPane.showMessageDialog(null, cuadrado.calculaPerimetro());

	}
}
