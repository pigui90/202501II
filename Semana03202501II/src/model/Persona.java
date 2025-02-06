package model;

import java.util.Date;

import javax.swing.JOptionPane;

/**
 * Clase Persona que se va a utilizar para representar o un estudiante o un
 * profesor
 * 
 * @author Sergio
 * @since 28/01/2025
 */
public class Persona {

	// Atributos de la clase
	private long id;
	private String nombre;
	private int edad;
	private boolean esProfesor;
	private int cedula;

	/**
	 * Constructor sin parametros que sirve para inicializar los atributos de la
	 * clase
	 * 
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public Persona() {

	}

	/**
	 * Metodo get del atributo id
	 * 
	 * @return el valor del atributo id
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public long getId() {
		return this.id;
	}

	/**
	 * Metodo set del atributo id
	 * 
	 * @param id el valor que se va a guardar en el atributo id
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Metodo get del atributo nombre
	 * 
	 * @return el valor del atributo nombre
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Metodo set del atributo nombre
	 * 
	 * @param nombre el valor que se va a guardar en el atributo nombre
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get del atributo edad
	 * 
	 * @return el valor del atributo edad
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public int getEdad() {
		return this.edad;
	}

	/**
	 * Metodo set del atributo edad
	 * 
	 * @param edad el valor que se va a guardar en el atributo edad
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Metodo get del atributo esProfesor
	 * 
	 * @return el valor del atributo esProfesor
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public boolean getEsProfesor() {
		return this.esProfesor;
	}

	/**
	 * Metodo set del atributo esProfesor
	 * 
	 * @param esProfesor el valor que se va a guardar en el atributo esProfesor
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public void setEsProfesor(boolean esProfesor) {
		this.esProfesor = esProfesor;
	}

	/**
	 * Metodo get del atributo cedula
	 * 
	 * @return el valor del atributo cedula
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public int getCedula() {
		return this.cedula;
	}

	/**
	 * Metodo set del atributo cedula
	 * 
	 * @param cedula el valor que se va a guardar en el atributo cedula
	 */
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	/**
	 * Un metodo que devuelve la informacion de ciertos atributos de Persona
	 * 
	 * @return un String que concatena varios atributos de persona
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public String mostrarInformacion() {
		return "Nombre: " + this.getNombre() + "\nEdad: " + this.getEdad() + "\nCedula: " + this.getCedula();
	}

	/**
	 * Calcula el año de nacimiento segun la edad de la persona
	 * 
	 * @return Retorna una fecha con el año de nacimiento de la persona
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public Date calculaFechaNacimiento() {
		// this.getEdad() añoActual restarle la edad, con esto obtendriamos el año de
		// nacimiento
		return new Date();
	}

	/**
	 * Muestra en un cuadro de dialogo la informacion de ciertos atributos de
	 * Persona
	 * 
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public void muestraInformacion() {
		String informacion = ("Nombre: " + this.getNombre() + "\nEdad: " + this.getEdad() + "\nCedula: "
				+ this.getCedula());
		JOptionPane.showMessageDialog(null, informacion);
	}

}
