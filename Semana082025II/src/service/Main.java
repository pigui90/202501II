package service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.swing.JOptionPane;

import model.Producto;

public class Main {

	public static void main(String[] args) {
		String menu = "Ejercicio 1\nEjercicio 2\nEjercicio 3";
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

		switch (opcion) {
		case 1:
			try {
				boolean correcto = false;
				Date fechaInicio;
				Date fechaFinal;
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				do {
					fechaInicio = sdf
							.parse(JOptionPane.showInputDialog("Digite una fecha con el formato dd/MM/yyyy"));
					fechaFinal = sdf
							.parse(JOptionPane.showInputDialog("Digite otra fecha con formato dd/MM/yyyy"));

					if (fechaInicio.after(fechaFinal)) {
						JOptionPane.showMessageDialog(null, "LA fecha de inicio esta despues", "Error",
								JOptionPane.ERROR_MESSAGE);
					}else {
						correcto = true;
					}
				} while (!correcto);

				LocalDate fechaInicioLD = fechaInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				LocalDate fechaFinalLD = fechaFinal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

				int contador = 0;
				
				while(fechaInicioLD.isBefore(fechaFinalLD) || fechaInicioLD.isEqual(fechaFinalLD)) {
					contador++;
					fechaInicioLD = fechaInicioLD.plusDays(1);
				}
				
				JOptionPane.showMessageDialog(null, "La cantidad de dias es: " + contador);
				
				

			} catch (ParseException pe) {
				JOptionPane.showMessageDialog(null, "Error en el parseo", "Error", JOptionPane.ERROR_MESSAGE);
			}
			break;
		case 2:
			BigDecimal precio;
			BigDecimal descuento;
			String nombre;
			int cantidad;
			
			Producto producto = new Producto();
			
			precio = new BigDecimal(JOptionPane.showInputDialog("Indique el precio del producto"));
			producto.setPrecio(precio);
			producto.setDescuento(new BigDecimal(JOptionPane.showInputDialog("Indique el descuento del producto")));
			producto.setNombre(JOptionPane.showInputDialog("Indique el nombre del producto"));
			cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos"));
			producto.setCantidad(cantidad);
			
			
			precio = new BigDecimal(JOptionPane.showInputDialog("Indique el precio de otro producto"));
			descuento = new BigDecimal(JOptionPane.showInputDialog("Indique el descuento de otro producto"));
			nombre = JOptionPane.showInputDialog("Indique el nombre de otro producto");
			cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos"));
			
			Producto producto2 = new Producto(precio, descuento, nombre, cantidad);

			BigDecimal prod1Descuento = producto.calculaPrecioDescuento();
			BigDecimal prod2Descuento = producto2.calculaPrecioDescuento();

			
			if(prod1Descuento.intValue() < prod2Descuento.intValue()) {
				JOptionPane.showMessageDialog(null, "El producto mas barato es: " + producto.toString() + " Con el monto final de : " + prod1Descuento );
			}else {
				if(prod2Descuento.intValue() < prod1Descuento.intValue()) {
					JOptionPane.showMessageDialog(null, "El producto mas barato es: " + producto2.toString() + " Con el monto final de : " + prod2Descuento );
				}else {
					JOptionPane.showMessageDialog(null, "ambos productos tienen el mismo precio final");
				}
			}
			
			
			

			break;
		case 3:
			
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Pedir un numero entero"));
			
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Pedir otro numero entero"));
			int cantidadDivisores = 0;
			String compuestos = "";
			for (int i = num1; i <= num2; i++) {
				cantidadDivisores = 0;
				for(int j = 1; j <= i; j++) {
					if(i % j == 0) {
						cantidadDivisores++;
					}
				}
				if(cantidadDivisores > 2) {
					compuestos = compuestos + i + "\n";
				}
				
			}
			
			JOptionPane.showMessageDialog(null, compuestos);
			
			break;

		default:
			break;
		}
	}

}
