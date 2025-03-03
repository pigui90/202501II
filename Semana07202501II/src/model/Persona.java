package model;

import java.util.Date;

public class Persona {
	private String nombre;
	private int edad;
	private Date fechaNacimiento;
	private String residencia;
	private int cedula;

	public Persona() {
		super();
	}

	public Persona(String nombre, int edad, Date fechaNacimiento, String residencia, int cedula) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.residencia = residencia;
		this.cedula = cedula;
	}

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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getResidencia() {
		return residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	
	public String muestraPersona() {
		return "Nombre: " + this.nombre + 
				"\nCedula: " + this.cedula +
				"\nEdad: " + this.edad;
	}
	
	@Override
	public String toString() {
		return "Info Persona\nNombre: " + this.getNombre() + 
		"\nCedula: " + this.getCedula() +
		"\nEdad: " + this.getEdad();
	}

}
