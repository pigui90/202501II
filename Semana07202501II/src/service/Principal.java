package service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import model.Funcionario;
import model.Persona;

public class Principal {

	public static void main(String[] args) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			int edad = Integer.parseInt(JOptionPane.showInputDialog("Indiqueme la edad de la persona"));
			String nombre = JOptionPane.showInputDialog("Indique el nombre de la persona");
			Date fechaNacimiento = sdf
					.parse(JOptionPane.showInputDialog("Indique la fecha de nacimiento con formato dd/MM/yyyy"));
			String residencia = JOptionPane.showInputDialog("Indique donde vive teus");
			int cedula = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de cedula"));
			String lugarTrabajo = JOptionPane.showInputDialog("Coloque su lugar de trabajo");
			String gradoAcademico = JOptionPane.showInputDialog("Ponga su grado academico");
			BigDecimal salario = new BigDecimal(JOptionPane.showInputDialog("Raje con su salario"));
			//////////////////////////////////////////////////////

			Funcionario funcionario = new Funcionario();
			JOptionPane.showMessageDialog(null, "Funcionario 1 sin los Set \n " + funcionario.muestraPersona());

			funcionario.setCedula(cedula);
			funcionario.setEdad(edad);
			funcionario.setFechaNacimiento(fechaNacimiento);
			funcionario.setGradoAcademico(gradoAcademico);
			funcionario.setLugarTrabajo(lugarTrabajo);
			funcionario.setNombre(nombre);
			funcionario.setResidencia(residencia);
			funcionario.setSalario(salario);
			
			JOptionPane.showMessageDialog(null, "Funcionario  \n " +funcionario.muestraPersona());

			//////////////////////////////////////////////////////
			
			Funcionario funcionario2 = new Funcionario(lugarTrabajo, gradoAcademico, salario);
			JOptionPane.showMessageDialog(null, "Funcionario 2 \n " +funcionario2.muestraPersona());
			
			//////////////////////////////////////////////////////

			Funcionario funcionario3 = new Funcionario(nombre, edad, fechaNacimiento, residencia, cedula);
			JOptionPane.showMessageDialog(null, "Funcionario 3 \n " + funcionario3.muestraPersona());

			//////////////////////////////////////////////////////

			Funcionario funcionario4 = new Funcionario(nombre, edad, fechaNacimiento, residencia, cedula, lugarTrabajo, gradoAcademico, salario);
			JOptionPane.showMessageDialog(null, "Funcionario 4 \n " + funcionario4.muestraPersona());

			Funcionario funcionario5 = funcionario;
			//***********************************************************
			JOptionPane.showMessageDialog(null, nombre.toString());
			JOptionPane.showMessageDialog(null, fechaNacimiento.toString());
			JOptionPane.showMessageDialog(null, salario.toString());
			JOptionPane.showMessageDialog(null, funcionario.toString() + " - " + funcionario4.toString() + " - " + funcionario5.toString());
			
			//***********************************************************

			Persona persona = new Persona(nombre, edad, fechaNacimiento, residencia, cedula);
			JOptionPane.showMessageDialog(null, persona.toString());
			
			//----------------------------------------------------------
			
			if(funcionario4.equals(funcionario)) {
				JOptionPane.showMessageDialog(null, "SON IGUALITOS");
			}else {
				JOptionPane.showMessageDialog(null, "No son iguales", "Error", JOptionPane.WARNING_MESSAGE);
			}
			
			if(funcionario.equals(funcionario5)) {
				JOptionPane.showMessageDialog(null, "SON IGUALITOS");
			}else {
				JOptionPane.showMessageDialog(null, "No son iguales", "Error", JOptionPane.WARNING_MESSAGE);
			}
			
			if(funcionario5.equals(funcionario4)) {
				JOptionPane.showMessageDialog(null, "SON IGUALITOS");
			}else {
				JOptionPane.showMessageDialog(null, "No son iguales", "Error", JOptionPane.WARNING_MESSAGE);
			}
			
			//----------------------------------------------------------

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al ejecutar el sistema", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

}
