package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JRadioButton rdbtRestar;
	private JRadioButton rdbtSuma;
	private JRadioButton rdbtMultiplicar;
	private JRadioButton rdbtDividir;
	private JTextField tfRespuesta;
	private JLabel lblNewLabel_2;
	private JButton btnRegresar;

	

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Num 1");
		lblNewLabel.setBounds(10, 22, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Num 2");
		lblNewLabel_1.setBounds(10, 62, 46, 14);
		contentPane.add(lblNewLabel_1);

		tfNum1 = new JTextField();
		tfNum1.setBounds(74, 19, 86, 20);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);

		tfNum2 = new JTextField();
		tfNum2.setBounds(74, 59, 86, 20);
		contentPane.add(tfNum2);
		tfNum2.setColumns(10);

		rdbtSuma = new JRadioButton("Sumar");
		rdbtSuma.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (rdbtSuma.isSelected()) {
					rdbtRestar.setSelected(false);
					rdbtDividir.setSelected(false);
					rdbtMultiplicar.setSelected(false);
				}
			}
		});
		rdbtSuma.setBounds(10, 104, 109, 23);
		contentPane.add(rdbtSuma);

		rdbtRestar = new JRadioButton("Restar");
		rdbtRestar.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (rdbtRestar.isSelected()) {
					rdbtSuma.setSelected(false);
					rdbtDividir.setSelected(false);
					rdbtMultiplicar.setSelected(false);
				}
			}
		});
		rdbtRestar.setBounds(116, 104, 109, 23);
		contentPane.add(rdbtRestar);

		rdbtMultiplicar = new JRadioButton("Multiplicar");
		rdbtMultiplicar.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (rdbtMultiplicar.isSelected()) {
					rdbtSuma.setSelected(false);
					rdbtDividir.setSelected(false);
					rdbtRestar.setSelected(false);
				}
			}
		});
		rdbtMultiplicar.setBounds(236, 104, 109, 23);
		contentPane.add(rdbtMultiplicar);

		rdbtDividir = new JRadioButton("Dividir");
		rdbtDividir.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (rdbtDividir.isSelected()) {
					rdbtSuma.setSelected(false);
					rdbtRestar.setSelected(false);
					rdbtMultiplicar.setSelected(false);
				}
			}
		});
		rdbtDividir.setBounds(347, 104, 109, 23);
		contentPane.add(rdbtDividir);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(tfNum1.getText());
					int num2 = Integer.parseInt(tfNum2.getText());
					int resultado = 0;
					if (!rdbtDividir.isSelected() 
							&& !rdbtMultiplicar.isSelected() 
							&& !rdbtSuma.isSelected()
							&& !rdbtRestar.isSelected()) {
						JOptionPane.showMessageDialog(btnCalcular, "Seleccione una operacion ", "Advertencia",
								JOptionPane.WARNING_MESSAGE);
					} else {
						if (rdbtDividir.isSelected()) {
							resultado = num1 / num2;
						}
						if (rdbtMultiplicar.isSelected()) {
							resultado = num1 * num2;
						}
						if (rdbtSuma.isSelected()) {
							resultado = num1 + num2;
						}
						if (rdbtRestar.isSelected()) {
							resultado = num1 - num2;
						}
						tfRespuesta.setText(String.valueOf(resultado));
//						JOptionPane.showMessageDialog(btnCalcular, "El resultado es : " + resultado);
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(btnCalcular, "Error ", "Error", JOptionPane.ERROR_MESSAGE);

				}
			}
		});
		btnCalcular.setBounds(21, 149, 89, 23);
		contentPane.add(btnCalcular);
		
		tfRespuesta = new JTextField();
		tfRespuesta.setEnabled(false);
		tfRespuesta.setEditable(false);
		tfRespuesta.setBounds(139, 192, 86, 20);
		contentPane.add(tfRespuesta);
		tfRespuesta.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Respuesta");
		lblNewLabel_2.setBounds(33, 195, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Bienvenido bienvenido = new Bienvenido();
				bienvenido.setVisible(true);
			}
		});
		btnRegresar.setBounds(367, 238, 89, 23);
		contentPane.add(btnRegresar);
	}

}
