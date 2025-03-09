package model;

import javax.swing.JOptionPane;

/**
 * Clase Funcionario
 */
public class Funcionario {
	private String nombre;
	private int edad;
	private int cedula;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public Funcionario(String nombre, int edad, int cedula) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.cedula = cedula;
	}

	public Funcionario() {
		super();
	}

	public String muestraFuncionario() {
		return "Este metodo muestra la informacion del funcionario y lo va a colocar el estudiante";
	}

	/**
	 * MEtodo para saber si es mayor
	 * @param num1 valor por quien preguntamos si es mayor
	 * @param num2 valor con el que comparamos el num1
	 * @return true si num1 es mayor a num2, de lo contrario retorna false
	 * @author Sergio
	 * @since 4/3/2025
	 */
	public Boolean esMayor(int num1, int num2) {
		// compara num1 con num2 y retorna el valor de una vez
		return num1 > num2;
	}

	/**
	 * Metodo para saber si es menor
	 * @return true si num1 es menor a num2, de lo contrario retorna false
	 */
	public Boolean esMenor() {
		JOptionPane.showMessageDialog(null, "Test de Menor");
		// Pido el valor para num1
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para la variable num1"));
		// pido el valor para num2
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para la variable num2"));
		// compara num1 con num2 y retorna el valor de una vez
		return num1 < num2;
	}

}
