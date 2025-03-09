package test;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Prueba {

	static int contador = 0;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		JOptionPane.showMessageDialog(null, "Metodo antes de todos");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		JOptionPane.showMessageDialog(null, "Metodo despues de todos");

	}

	@BeforeEach
	void setUp() throws Exception {
		contador++;
		JOptionPane.showMessageDialog(null, "contador: " + contador);
	}

	@AfterEach
	void tearDown() throws Exception {
		JOptionPane.showMessageDialog(null, "Fin de la prueba: " + contador);

	}

	@Test
	void test() {
		int valor = 0;
		JOptionPane.showMessageDialog(null, "Hola este es el primer test");
		valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor "));
		JOptionPane.showMessageDialog(null, "El valor es " + valor);
		if(valor > 100) {
			fail("Fallo el test");
		}
		
	}
	
	@Test
	void test2() {
		String respuesta = "";
		JOptionPane.showMessageDialog(null, "Hola este es el segundo test");
		respuesta = JOptionPane.showInputDialog("Ingrese una respuesta ");
		JOptionPane.showMessageDialog(null, "El valor es " + respuesta);
	}

}
