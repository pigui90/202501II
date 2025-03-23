package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		try {
			File clase11 = new File("clase11.txt");
			File semana10 = new File("semana10.txt");
			if (!clase11.exists()) {
				clase11.createNewFile();
			}
			if (!semana10.exists()) {
				semana10.createNewFile();
			}

			String menu = "1. Leer Archivo clase 11\n2.Leer archivo semana10 \n3. Escribir Archivo clase11\n4. Escribir Archivo semana10\n5. Salir";
			int op = 0;
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog(menu));
				switch (op) {
				case 1:
					FileReader fileReader = new FileReader(clase11);
					BufferedReader br = new BufferedReader(fileReader);

					String lineaArchivo = br.readLine();
					String cadena = "";
					int contador;
					while (lineaArchivo != null) {
						contador = 0;
						do {
							while (contador < lineaArchivo.length() && lineaArchivo.charAt(contador) != '|') {
								cadena = cadena + lineaArchivo.charAt(contador);
								contador++;
								System.out.println(cadena);
							}
							contador++;
							JOptionPane.showMessageDialog(null, cadena);
//							cadena = cadena + "\n";
						} while (contador < lineaArchivo.length());
						cadena = cadena + "\n";

						lineaArchivo = br.readLine();
					}
//					JOptionPane.showMessageDialog(null, cadena);
					break;
				case 2:
					FileReader fr = new FileReader(semana10);
					BufferedReader brSemana10 = new BufferedReader(fr);
					String contenidoArchivo = brSemana10.readLine();
					while(contenidoArchivo != null) {
						JOptionPane.showMessageDialog(null, contenidoArchivo);
						contenidoArchivo = brSemana10.readLine();
					}
					
					break;
				case 3:
					FileWriter fw = new FileWriter(clase11, true);
					BufferedWriter bw = new BufferedWriter(fw);
					
					String texto = JOptionPane.showInputDialog("Digite un texto cualquiera para guardar en el archivo");
					bw.write(texto);
					bw.newLine();
					bw.close();
					break;
				case 4:
					FileWriter fwSemana10 = new FileWriter(semana10, false);
					BufferedWriter bwSemana10 = new BufferedWriter(fwSemana10);
					
					String lineaNueva = JOptionPane.showInputDialog("Digite un texto cualquiera para guardar en el archivo");
					bwSemana10.write(lineaNueva);
					bwSemana10.newLine();
					bwSemana10.close();
					break;
				default:
					break;
				}
			} while (op != 5);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
