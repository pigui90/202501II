package service;

import javax.swing.JOptionPane;

public class Ejercicios {

	public static void main(String[] args) {

		int opcion = 0;

		do {

			opcion = Integer.parseInt(JOptionPane
					.showInputDialog("1- Ejercicio 1\n2- Ejercicio 2\n3- Ejercicio 3\n4- Ejercicio 4\n5- Salir"));
			switch (opcion) {
			case 1:
				double numero = 0.0;
				do {
					numero = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero positivo"));
					if (numero == 0) {
						break;
					}
				} while (numero < 1);
				if (numero != 0) {
					for (int i = 1; i <= numero; i++) {
						JOptionPane.showMessageDialog(null,
								"El resultado de la division de " + i + " entre " + numero + " es: " + (i / numero));
					}
				}
				break;
			case 2:
				String palabra = "";
				boolean seguir = true;
				do {
					String deletreada = "";
					palabra = JOptionPane.showInputDialog("Digite una palabra para deletrear");
					if (!palabra.equalsIgnoreCase("fin")) {
						for (int j = 0; j < palabra.length(); j++) {
							deletreada = deletreada + palabra.charAt(j) + " ";
						}
						JOptionPane.showMessageDialog(null, deletreada);
					} else {
						seguir = false;
					}
				} while (seguir);
				break;
			case 3:
				double num1 = Double.parseDouble(JOptionPane.showInputDialog("Indique un primer numero"));
				double num2 = Double.parseDouble(JOptionPane.showInputDialog("Indique un segundo numero"));

				double resultado = 0;

				resultado = num1 + num2;
				JOptionPane.showMessageDialog(null,
						"El resultado de la suma " + num1 + " + " + num2 + " es: " + (num1 + num2));
				resultado = resultado + (num1 - num2);
				JOptionPane.showMessageDialog(null,
						"El resultado de la resta " + num1 + " - " + num2 + " es: " + (num1 - num2));
				resultado = resultado + (num1 * num2);
				JOptionPane.showMessageDialog(null,
						"El resultado de la multiplicacion " + num1 + " * " + num2 + " es: " + (num1 * num2));
				resultado = resultado + (num1 / num2);
				JOptionPane.showMessageDialog(null,
						"El resultado de la division " + num1 + " / " + num2 + " es: " + (num1 / num2));
				JOptionPane.showMessageDialog(null, "El resultado de las sumas de las operaciones es: " + resultado);

				break;
			case 4:
				boolean continuar = true;
				String name = "";
				do {
					name = JOptionPane.showInputDialog("Digame su nombre para poder saludarlo");
					JOptionPane.showMessageDialog(null, "Hola " + name + " es un placer saludarlo");
					continuar = Boolean.parseBoolean(JOptionPane.showInputDialog("Desea continuar? TRUE/FALSE"));
				}while(continuar);
				JOptionPane.showMessageDialog(null, "Gracias por participar ");

				break;

			case 5:
				JOptionPane.showMessageDialog(null, "Adios");

				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida");

				break;
			}
		} while (opcion != 5);

	}

}
