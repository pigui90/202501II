package service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Producto;
import model.Vehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo[] vehiculos = new Vehiculo[10];

		List<Producto> productos = new ArrayList<Producto>();
		boolean seguir = true;
		int opcion = 0;
		int posVehiculo = 0;
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion"));
			switch (opcion) {
			case 1:
				if (posVehiculo < vehiculos.length) {
					Vehiculo vehiculo = new Vehiculo();
					vehiculo.setAnio(Integer.parseInt(JOptionPane.showInputDialog("Digite el año")));
					vehiculo.setModelo(JOptionPane.showInputDialog("Digite el modelo"));
					vehiculo.setPlaca(JOptionPane.showInputDialog("Digite el placa"));
					vehiculos[posVehiculo] = vehiculo;
					posVehiculo++;
				}
				break;
			case 2:
				for (int i = 0; i < vehiculos.length; i++) {
					if (vehiculos[i] != null) {
						JOptionPane.showMessageDialog(null, vehiculos[i].toString());
						
						/// ASi es otra forma de hacerlo
//						Vehiculo veh =  vehiculos[i];
//						JOptionPane.showMessageDialog(null, veh.toString());

					}
				}
				break;
			case 3:
				Producto producto = new Producto();
				producto.setCodigo(JOptionPane.showInputDialog("Digite el codigo"));
				producto.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite el id")));
				producto.setNombre(JOptionPane.showInputDialog("Digite el nombre"));
				productos.add(producto);

				break;
			case 4:
				for (Producto prod : productos) {
					JOptionPane.showMessageDialog(null, prod.toString());
				}
				break;
			case 5:
				int id = Integer.parseInt(JOptionPane.showInputDialog("Indique el id del producto a eliminar"));
				for (Producto prod : productos) {
					if(prod.getId() == id) {
						productos.remove(prod);
						break;
					}
				}
				break;
			case 6:

				break;
			case 7:
				seguir = false;
				break;

			default:
				break;
			}
		} while (seguir);
	}

}
