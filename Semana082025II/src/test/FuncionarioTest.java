package test;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Funcionario;

/**
 * Clase test para la clase funcionario
 * 
 */
class FuncionarioTest {
	static Funcionario funcionario;
	int num1;
	int num2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		JOptionPane.showMessageDialog(null, "INICIALIZANDO INSTANCIA DE FUNCIONARIO");
		funcionario = new Funcionario();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		JOptionPane.showMessageDialog(null, "FINALIZANDO PRUEBAS");

	}

	@BeforeEach
	void setUp() throws Exception {
		num1 = 0;
		num2 = 0;
	}

	@AfterEach
	void tearDown() throws Exception {
		JOptionPane.showMessageDialog(null,"Este es el valor de numero 1 " + num1);
		JOptionPane.showMessageDialog(null,"Este es el valor de numero 2 " + num2);

	}
	/**
	 * Metodo test para el metodo testMuestraFuncionario
	 */
	@Test
	void testMuestraFuncionario() {
		JOptionPane.showMessageDialog(null,funcionario.muestraFuncionario());
	}
	
	/**
	 * Metodo test para el metodo esMayor
	 */
	@Test
	void testMayor() {
		try {
			
			JOptionPane.showMessageDialog(null, "Test de Mayor");
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para la variable num1"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para la variable num2"));
			assertTrue(funcionario.esMayor(num1, num2), "num1 es menor o igual a num2");
			
		}catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	/**
	 * MEtodo test para el metodo esMenor
	 */
	@Test
	void testMenor() {
		try {
			
			assertTrue(funcionario.esMenor(), "num1 es mayor o igual a num2");
			
		}catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
