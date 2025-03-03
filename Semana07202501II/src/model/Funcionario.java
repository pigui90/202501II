package model;

import java.math.BigDecimal;
import java.util.Date;

public class Funcionario extends Persona {

	private String lugarTrabajo;
	private String gradoAcademico;
	private BigDecimal salario;

	public Funcionario() {
		super();
	}

	public Funcionario(String lugarTrabajo, String gradoAcademico, BigDecimal salario) {
		super();
		this.lugarTrabajo = lugarTrabajo;
		this.gradoAcademico = gradoAcademico;
		this.salario = salario;
	}
	
	

	public Funcionario(String nombre, int edad, Date fechaNacimiento, String residencia, int cedula,
			String lugarTrabajo, String gradoAcademico, BigDecimal salario) {
		super(nombre, edad, fechaNacimiento, residencia, cedula);
		this.lugarTrabajo = lugarTrabajo;
		this.gradoAcademico = gradoAcademico;
		this.salario = salario;
	}
	
	

	public Funcionario(String nombre, int edad, Date fechaNacimiento, String residencia, int cedula) {
		super(nombre, edad, fechaNacimiento, residencia, cedula);
		// TODO Auto-generated constructor stub
	}

	public String getLugarTrabajo() {
		return lugarTrabajo;
	}

	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}

	public String getGradoAcademico() {
		return gradoAcademico;
	}

	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public String muestraPersona() {
		return super.muestraPersona()+
				"\nGrado Academico: " + this.gradoAcademico +
				 "\nSalario: " + this.salario ;
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString() +
//				"\nGrado Academico: " + this.gradoAcademico +
//				 "\nSalario: " + this.salario;
//	}
	
	@Override
	public boolean equals(Object obj) {
		Funcionario fun = (Funcionario) obj;
		if(fun.getCedula() == this.getCedula() && fun.getNombre().equals(this.getNombre())) {
			return true;
		}else {
			return false;
		}
	}
}
