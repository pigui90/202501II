package service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

			String fechaUsuario = JOptionPane.showInputDialog("Indique una fecha el formato debe ser yyyy/mm/dd");

			Date fecha = sdf.parse(fechaUsuario);

			JOptionPane.showMessageDialog(null, sdf.format(fecha));

			JOptionPane.showMessageDialog(null, "La fecha como Date es: " + fecha);

			LocalDate fechaLD = LocalDate.now();

			JOptionPane.showMessageDialog(null, fechaLD);

			fechaLD = fechaLD.plusDays(5);
			

			JOptionPane.showMessageDialog(null, fechaLD);

			Date fechaDiasSumados = Date.from(fechaLD.atStartOfDay(ZoneId.systemDefault()).toInstant());

			JOptionPane.showMessageDialog(null, sdf.format(fechaDiasSumados));

			Date hoy = new Date();

			LocalDate hoyLD = hoy.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

			hoyLD = hoyLD.minusMonths(4);

			JOptionPane.showMessageDialog(null, hoyLD);

			if (hoy.after(fecha)) {
				JOptionPane.showMessageDialog(null, "Hoy esta despues de la fecha indicada");
			} else {
				if (hoy.before(fecha)) {
					JOptionPane.showMessageDialog(null, "Hoy esta antes de la fecha indicada");
				} else {
					JOptionPane.showMessageDialog(null, "Hoy es igual a la fecha indicada");
				}
			}
			
			
			BigDecimal salario = new BigDecimal(100000);
			BigDecimal aumento = BigDecimal.TEN;
			salario = salario.add(aumento).multiply(new BigDecimal(5), MathContext.DECIMAL128).divide(new BigDecimal(100));

			JOptionPane.showMessageDialog(null, salario);
			
			
			String menu = "Menu Principal\n1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3";
			JOptionPane.showInputDialog(menu);
			
		} catch (ParseException pe) {
			JOptionPane.showMessageDialog(null, "error en el formato " + pe.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}

}
