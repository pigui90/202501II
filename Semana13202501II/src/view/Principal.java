package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextArea taArchivo;
	private JScrollPane scroll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == '*') {
					e.consume();
				}
			}
		});
		textField.setBounds(56, 40, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnArchivo = new JButton("Cargar");
		btnArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser chooser = new JFileChooser();
					chooser.showOpenDialog(btnArchivo);
					File archivo = chooser.getSelectedFile();

					FileReader fr = new FileReader(archivo);
					BufferedReader br = new BufferedReader(fr);
					String linea = br.readLine();
					String contenido = "";
					while (linea != null) {
						contenido = contenido.concat(linea).concat("\n");
						linea = br.readLine();
					}
					taArchivo.setText(contenido);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(btnArchivo, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnArchivo.setBounds(56, 84, 89, 23);
		contentPane.add(btnArchivo);

		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(56, 131, 97, 23);
		contentPane.add(chckbxNewCheckBox);

		taArchivo = new JTextArea();
		scroll = new JScrollPane(taArchivo);
		scroll.setBounds(220, 38, 164, 150);
		contentPane.add(scroll);
		
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	}
}
