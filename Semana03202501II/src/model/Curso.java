package model;

/**
 * Clase que representa un curso de la universidad
 * @author Sergio
 * @since 28/01/2025
 */
public class Curso {
	private String nombre;
	private int nrc;

	/**
	 * Constructor sin parametros que sirve para inicializar los atributos de la
	 * clase
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public Curso() {

	}

	/***
	 * El constructor sobrecargado con 2 parametros
	 * 
	 * @param nombre valor que se le va a asignar al atributo nombre
	 * @param nrc    valor que se le va a asignar al atributo nrc
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public Curso(String nombre, int nrc) {
		this.nombre = nombre;
		this.nrc = nrc;
	}
	
	/**
	 * Cambiamos el valor actual del atributo por el valor del parametro que recibimos 
	 * @param nombreP El valor nuevo que se asignara al atributo especificado
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public void setNombre(String nombreP) {
		this.nombre = nombreP;
	}
	
	/**
	 * Metodo get del atributo nombre
	 * @return devuelve el valor actual del atributo nombre
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Cambiamos el valor actual del atributo por el valor del parametro que recibimos 
	 * @param nrc El valor nuevo que se asignara al atributo especificado
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public void setNrc(int nrc) {
		this.nrc = nrc;
	}
	
	/**
	 * Metodo get del atributo nrc
	 * @return devuelve el valor actual del atributo nrc
	 * @author Sergio
	 * @since 28/01/2025
	 */
	public int getNrc() {
		return this.nrc;
	}

}
