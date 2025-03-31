package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Tipodetransporte;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class Tiposdetransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservacion;
	private JTextField txtIdtipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tiposdetransporte frame = new Tiposdetransporte();
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
	public Tiposdetransporte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(153, 106, 98, 30);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtObservacion = new JTextField();
		txtObservacion.addMouseListener(new MouseAdapter() {
			
		});
		txtObservacion.setBounds(133, 169, 205, 61);
		contentPane.add(txtObservacion);
		txtObservacion.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(66, 114, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("    Observacion");
		lblNewLabel_1.setBounds(34, 162, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Tipodetransporte cr = new Tipodetransporte();
				cr.create(txtNombre.getText(), txtObservacion.getText(), Integer.parseInt(txtIdtipo.getText()));
			}
		});
		btnGuardar.setBounds(305, 75, 89, 23);
		contentPane.add(btnGuardar);
		
		txtIdtipo = new JTextField();
		txtIdtipo.setBounds(147, 49, 104, 30);
		contentPane.add(txtIdtipo);
		txtIdtipo.setColumns(10);
		
		JLabel lblNewLabel3 = new JLabel("Id Tipo");
		lblNewLabel3.setBounds(57, 57, 55, 14);
		contentPane.add(lblNewLabel3);
	}
}
