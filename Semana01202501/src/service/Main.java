package service;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(operacionesVarias(6, 7)+ "\n");
		System.out.print(operacionesVarias(12, 41)+ "\n");
		System.out.print(operacionesVarias(6, 1)+ "\n");
		System.out.print(operacionesVarias(9, 0)+ "\n");
		System.out.println("\n--------------------------------------");
		System.out.println(operacionesVarias(4, 2));
		System.out.println(operacionesVarias(10, 4));
		System.out.println(operacionesVarias(3, 6));
		System.out.println(operacionesVarias(5, 5));
		
		System.out.println("Digame su nombre");
		String nombre = scan.next();
		System.out.println("su nombre es: " + nombre);
		
		scan.close();
		
		
		String direccion = JOptionPane.showInputDialog("Indique la direccion de su casa");
		
		JOptionPane.showMessageDialog(null, "Su direccion indicada es: " + direccion);
		
	}

	public static int operacionesVarias(int numero1, int numero2){
		int resultado = (numero1 * 3) + (numero2 + 6);
		return resultado;
	}
}
