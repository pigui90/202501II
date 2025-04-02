package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class Bienvenido extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNombre;
	private JPasswordField passwordField;

	
	/**
	 * Create the frame.
	 */
	public Bienvenido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNombre.setBounds(34, 28, 87, 30);
		contentPane.add(lblNombre);
		
		tfNombre = new JTextField();
		tfNombre.setText("0");
		tfNombre.setBounds(128, 36, 86, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		JButton btnMostrarNombre = new JButton("Mostrar");
		btnMostrarNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnMostrarNombre, "Hola me dieron click: " + tfNombre.getText());
			}
		});
		btnMostrarNombre.setBounds(128, 71, 109, 35);
		contentPane.add(btnMostrarNombre);
		String[] nombres = {"Sergio", "Gerardo", "Campos"};
		
		JComboBox comboBox = new JComboBox<String>(nombres);
		comboBox.setBounds(282, 71, 87, 22);
		contentPane.add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(24, 133, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(149, 133, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(131, 170, 214, 80);
		contentPane.add(textArea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(266, 25, 125, 20);
		contentPane.add(passwordField);
		
		JButton btnNavegar = new JButton("Navegar");
		btnNavegar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal principal = new Principal();
				principal.setVisible(true);
				setVisible(false);
			}
		});
		btnNavegar.setBounds(416, 313, 89, 23);
		contentPane.add(btnNavegar);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(315, 134, 54, 22);
		contentPane.add(spinner);
	}
}
