package service;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

/**
 * Clase destinada para realizar los ejercicios de la clase 2
 */
public class EjerciciosClase {
	/*
	 * Variables staticas que se usaran en el metodo main
	 */
	static int opcion = 0;
	static String menu = "1. Numero Par\n2.Numero Random" + " \n3. Division de numeros \n4. \n5. Salir";

	/**
	 * Metodo main con la logica de los ejercicios de la clase 2
	 * 
	 * @param args Parametros por defecto de Java para ejecutar el programa
	 */
	public static void main(String[] args) {
		// Variables que se usaran en diferentes momentos en el metodo
		int numero;
		double dividendo;
		double divisor;
		boolean divisionCorrecta;
		do {
			// Se usa el try para poder capturar las excepciones que puedan ocasionarse al
			// ejecutar el sistema
			try {
				// Aqui solicitamos la opcion al usuario
				opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

				switch (opcion) {
				case 1:

					// Realizamos un ciclo para validar que el numero sea positivo
					do {
						numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
						// Si el numero es positivo, entonces llamamos al metodo para saber si el numero
						// es par
						if (numero > 0) {
							numeroPar(numero);
						} else {
							// Si es negativo o 0, indicamos un error al usuario
							JOptionPane.showMessageDialog(null, "El numero debe ser positivo.....", "Problemas",
									JOptionPane.ERROR_MESSAGE);
						}
					} while (numero <= 0);
					break;
				case 2:
					// se llama al metodo random para ejecutar su logica
					numeroRandom();
					break;
				case 3:
					do {
						try {
							dividendo = Double.parseDouble(JOptionPane.showInputDialog("Digite el dividendo"));
							divisor = Double.parseDouble(JOptionPane.showInputDialog("Digite el divisor"));
							if (divisor != 0) {
								JOptionPane.showMessageDialog(null, divisionNumeros(dividendo, divisor));
								divisionCorrecta = true;
							} else {
								JOptionPane.showMessageDialog(null, "el divisor no puede ser 0", "Error",
										JOptionPane.ERROR_MESSAGE);
								divisionCorrecta = false;
							}
						} catch (InputMismatchException ex) {
							JOptionPane.showMessageDialog(null,
									"No se digito el formato correcto para el numero decimal", "Error",
									JOptionPane.ERROR_MESSAGE);
							divisionCorrecta = false;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
							divisionCorrecta = false;
						}
					} while (!divisionCorrecta);
					break;
				case 4:

					break;
				case 5:
					// Muestra un mensaje de despedida
					JOptionPane.showMessageDialog(null, "Saliendo del sistema.....", "Bye",
							JOptionPane.WARNING_MESSAGE);
					break;
				default:
					// Muestra un mensaje si la opcion no esta predeterminada
					JOptionPane.showMessageDialog(null, "Opcion no valida.....", "Cuidado",
							JOptionPane.WARNING_MESSAGE);
					break;
				}
			} catch (NumberFormatException nfe) {
				// En el caso de que la excepcion sea por digitar un valor que no tenga un
				// formato numerico
				JOptionPane.showMessageDialog(null, "Error al digitar un valor numerico", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			// Se muestra el menu, siempre y cuando sea diferente a 5 la opcion escogida por
			// el usuario
		} while (opcion != 5);

	}

	/**
	 * Metodo para determinar si un numero es par o no
	 * 
	 * @param numero El valor al cual se le va a determinar si es par o no
	 */
	public static void numeroPar(int numero) {
		// Si el residuo de la division entre 2 es igual a 0, entonces el numero es par
		if (numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "El numero es Par", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		} else {
			// Si no, el numero es impar
			JOptionPane.showMessageDialog(null, "El numero es Impar", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	/**
	 * Metodo para jugar a adivinar un numero random, el limite lo define el usuario
	 * dentro del metodo
	 */
	public static void numeroRandom() {
		// Variables para usar en la ejecucion del metodo
		boolean adivino = false;
		boolean numeroCorrecto;
		int numeroLimite = 0;
		double rand;
		int numeroAdivinar;
		int numeroUsuario = 0;
		do {
			try {
				// Se solicita al usuario el limite del random
				numeroLimite = Integer
						.parseInt(JOptionPane.showInputDialog("Indique un numero para saber el limite del random"));
				if (numeroLimite > 0) {
					numeroCorrecto = true;
				} else {
					// Si el numero no es positivo se le muestra un mensaje al usuario
					JOptionPane.showMessageDialog(null, "Ingrese un numero positivo", "Error",
							JOptionPane.ERROR_MESSAGE);
					numeroCorrecto = false;
				}

			} catch (NumberFormatException nfe) {
				// En el caso de que la excepcion sea por digitar un valor que no tenga un
				// formato numerico
				JOptionPane.showMessageDialog(null, "Error al digitar un valor numerico", "Error",
						JOptionPane.ERROR_MESSAGE);
				numeroCorrecto = false;
			}
		} while (!numeroCorrecto);
		// Se calcula el numero random con decimales
		rand = (Math.random()) * numeroLimite;
		// Se convierte de double a int
		numeroAdivinar = (int) rand;
		// Se imprime en consola para poder llegar a adivinar el numero
		System.out.println(numeroAdivinar);

		do {
			try {
				// Pedimos al usuario un numero para que intente adivinar
				numeroUsuario = Integer.parseInt(
						JOptionPane.showInputDialog("Trate de adivinar el numero, entre 0 y " + numeroLimite));
				// Si no adivina, se le muestra un mensaje de advertencia
				if (numeroUsuario != numeroAdivinar) {
					JOptionPane.showMessageDialog(null, "No adivino el numero vuelva a intentarlo", "Casi casi",
							JOptionPane.WARNING_MESSAGE);
				} else {
					// Si adivina el numero se coloca true para que salga del ciclo
					adivino = true;
				}
			} catch (NumberFormatException nfe) {
				// En el caso de que la excepcion sea por digitar un valor que no tenga un
				// formato numerico
				JOptionPane.showMessageDialog(null, "Error al digitar un valor numerico", "Error",
						JOptionPane.ERROR_MESSAGE);
				adivino = false;
			}
		} while (!adivino);
		// al salir del ciclo significa que ya adivino el numero y se le muestra el
		// mensaje
		JOptionPane.showMessageDialog(null, "Felicidades adivino el numero");
	}

	/**
	 * Un metodo que devuelve el resultado de una divison de 2 numeros con decimales
	 * 
	 * @param dividendo el numero que se divide
	 * @param divisor   el numero por el cual se divide
	 * @return Se retorna el resultado de la division
	 */
	public static double divisionNumeros(double dividendo, double divisor) {
		return dividendo / divisor;
	}

}
