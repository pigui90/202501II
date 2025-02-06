package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * CLase MAin con los ejercicios de la semana 4
 */
public class Main {

	/**
	 * MEtodo con los ejercicios de la clase
	 * 
	 * @param args Parametro por defecto
	 */
	public static void main(String[] args) {

		int opcion = 0;
		Date fechaMenu = new Date();
		String menu = "Menu Del Profe\n*********************\n1- Numeros Amigos\n2- Evalua Fechas\n3- Ejercicio 3\n4- Salir";
		do {
			try {
				// fechaMenu = new Date();
				opcion = Integer.parseInt(JOptionPane.showInputDialog("Fecha: " + fechaMenu + "\n" + menu));
				switch (opcion) {
				case 1:
					numerosAmigos();
					break;
				case 2:
					int dia = Integer.parseInt(JOptionPane.showInputDialog("Indique un dia"));
					int mes = Integer.parseInt(JOptionPane.showInputDialog("Indique un mes"));
					int year = Integer.parseInt(JOptionPane.showInputDialog("Indique un año"));
					JOptionPane.showMessageDialog(null, evaluaFechas(dia, mes, year));
					break;

				case 3:
					try {
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

						Date hoy = new Date();
						JOptionPane.showMessageDialog(null, hoy);

						hoy = sdf.parse(sdf.format(hoy));
						JOptionPane.showMessageDialog(null, "----------");

						JOptionPane.showMessageDialog(null, hoy);
					} catch (Exception e) {
						// TODO: handle exception
					}
					break;
				case 4:
					JOptionPane.showMessageDialog(null,
							"Saliendo del sistema, vuelva pronto, el profesor lo espera aqui");
					break;
				default:
					JOptionPane.showMessageDialog(null,
							"La opcion no existe, revise bien el codigo antes de preguntar al profesor", "Advertencia",
							JOptionPane.WARNING_MESSAGE);
					break;
				}
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Huele a peligro; " + nfe.getMessage(), "Error",
						JOptionPane.ERROR_MESSAGE);

			}

		} while (opcion != 4);
	}

	/**
	 * Metodo para determinar si los numeros son amigos
	 */
	public static void numerosAmigos() {
		try {
			int numero1;
			int numero2;
			int sumaDivNumero1 = 0;
			int sumaDivNumero2 = 0;

			// Pedir los datos al usuario
			numero1 = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite un numero para saber si son amigos porque el profesor me pidio este ejercicio"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite otro numero para saber si son amigos porque el profesor me pidio este ejercicio"));

			// Obtener los divisores de numero1
			for (int i = 1; i < numero1; i++) {
				if (numero1 % i == 0) {
					sumaDivNumero1 = sumaDivNumero1 + i;
				}
			}

			// Obtener los divisores de numeros2
			for (int j = 1; j < numero2; j++) {
				if (numero2 % j == 0) {
					sumaDivNumero2 = sumaDivNumero2 + j;
				}
			}

			// Preguntar si son amigos
			if (sumaDivNumero1 == numero2 && sumaDivNumero2 == numero1) {
				JOptionPane.showMessageDialog(null, "Si SON amigos porque el profesor explico que asi son los amigos");
			} else {
				JOptionPane.showMessageDialog(null,
						"No SON amigos porque el profesor explico que asi no son los amigos");
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	/**
	 * Metodo para averiguar si la fecha esta antes despues o es igual a hoy
	 * 
	 * @param day   el dia de la fecha
	 * @param month mes de la fecha a crear
	 * @param year  año de la fecha que escogio el usuario
	 * @return Un mensaje indicando si esta despues antes o es igual a la fecha de
	 *         hoy
	 */
	public static String evaluaFechas(int day, int month, int year) {
		String evaluacion = "";

		try {

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			String fecha = day + "/" + month + "/" + year;

			Date fechaUsuario = sdf.parse(fecha);
			Date hoy = new Date();

			hoy = sdf.parse(sdf.format(hoy));

			if (fechaUsuario.before(hoy)) {
				evaluacion = "Fecha indicada esta antes de la fecha de hoy";
			} else {
				if (fechaUsuario.after(hoy)) {
					evaluacion = "fecha indicada esta despues de la fecha de hoy ";
				} else {
					evaluacion = "Hoy es igual a la fecha indicada";
				}
			}
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Error en la fecha con el formato", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return evaluacion;

	}

}
