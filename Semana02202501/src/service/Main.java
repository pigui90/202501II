package service;

import javax.swing.JOptionPane;

/**
 * Clase Main que tiene el metodo main para poder ejecutar el codigo que se esta
 * viendo en la semana 2
 */
public class Main {

	/**
	 * Este es el metodo main donde se explica la clase de la semana 2
	 * 
	 * @param args Un parametro por defecto que usa el Java para poder ejecutar la
	 *             aplicacion
	 */
	public static void main(String[] args) {
		/*
		 * Se inicializan las variables numeros que vamos a usar para el ejemplo de los
		 * try-catch
		 */
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		int resultadoDivision;
		JOptionPane.showMessageDialog(null, "Bienvenidos a la clase 2 ", "Hola", JOptionPane.INFORMATION_MESSAGE);
		try {
			// Aqui se coloca el codigo que vamos a capturar o vigilar durante la ejecucion
			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Indique un numero"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Indique otro numero"));
			numero3 = Integer.parseInt(JOptionPane.showInputDialog("Indique el numero 3"));
			resultadoDivision = numero1 / numero2;
			JOptionPane.showMessageDialog(null, "El resultado de la division es: " + resultadoDivision,
					"Resultado de la division", JOptionPane.WARNING_MESSAGE);
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Debe indicar solamente numeros: " + nfe.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (ArithmeticException ex) {
			JOptionPane.showMessageDialog(null, "Hubo un problema en las operaciones matematicas: " + ex.getMessage(),
					"Error", JOptionPane.ERROR_MESSAGE);
		}

		try {

		} catch (Exception e) {

		}

		int numero4 = numero1 + numero2;

	}
	
	/**
	 * Metodo diseñado para realizar varios calculos matematicos entre 2 numeros
	 * @param numero1 Numero entero utilizado para ser calculos
	 * @param numero2 Segundo numero entero utilizado para realizar los calculos
	 * @return Retorna el resultado de la multiplicacion
	 * @author Sergio
	 * @since 21/01/2025
	 */
	public static int calculosMatematicos(int numero1, int numero2) {
		return numero1 * numero2;
	}
	
}
