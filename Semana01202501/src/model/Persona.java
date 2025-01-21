package model;

public class Persona {
	
	private String nombre;
	private int edad;
	private boolean extranjero;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad, boolean extranjero) {
		this.nombre = nombre;
		this.edad = edad;
		this.extranjero = extranjero;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
