package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class miventana {

	private JFrame frame;
	private JTextField txtCod;
	private JTextField txtNom;
	private JTextField txtLoc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					miventana window = new miventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public miventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 37, 377, 156);
		panel.setBackground(new Color(255, 255, 128));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Código Departamento:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(30, 30, 150, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre Departamento:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(30, 68, 150, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Localidad Departamento:");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(30, 108, 168, 14);
		panel.add(lblNewLabel_1_1_1);
		
		txtCod = new JTextField();
		txtCod.setForeground(new Color(0, 128, 255));
		txtCod.setBackground(new Color(255, 128, 255));
		txtCod.setBounds(210, 27, 47, 20);
		panel.add(txtCod);
		txtCod.setColumns(10);
		
		txtNom = new JTextField();
		txtNom.setForeground(new Color(0, 0, 0));
		txtNom.setBackground(new Color(255, 255, 255));
		txtNom.setColumns(10);
		txtNom.setBounds(210, 65, 133, 20);
		panel.add(txtNom);
		
		txtLoc = new JTextField();
		txtLoc.setBackground(new Color(255, 255, 255));
		txtLoc.setForeground(new Color(0, 0, 0));
		txtLoc.setColumns(10);
		txtLoc.setBounds(208, 105, 135, 20);
		panel.add(txtLoc);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel.setBounds(25, 11, 377, 14);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Insertar Datos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBounds(62, 215, 115, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLimpiarDatos = new JButton("Limpiar Datos");
		txtCod.setText("");
		btnLimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTON LIMPIAR");
			}
		});
		btnLimpiarDatos.setFont(new Font("Arial", Font.BOLD, 12));
		btnLimpiarDatos.setBackground(Color.WHITE);
		btnLimpiarDatos.setBounds(246, 215, 115, 23);
		frame.getContentPane().add(btnLimpiarDatos);
	}
}
