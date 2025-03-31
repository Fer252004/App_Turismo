package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Agencia;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class JfAgencia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtdireccion;
	private JTextField txttelefono;
	private JTextField txtcorreo;
	private JTextField txtweb;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField txtIDcompañia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JfAgencia frame = new JfAgencia();
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
	public JfAgencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(51, 34, 102, 26);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(234, 34, 126, 26);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(21, 102, 111, 26);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setBounds(172, 102, 111, 26);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txtweb = new JTextField();
		txtweb.setBounds(298, 102, 126, 26);
		contentPane.add(txtweb);
		txtweb.setColumns(10);
		
		lblNewLabel_1 = new JLabel("   Nombre");
		lblNewLabel_1.setBounds(72, 9, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("     Direccion");
		lblNewLabel_2.setBounds(256, 9, 63, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("  Telefono ");
		lblNewLabel_3.setBounds(51, 83, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("    Correo");
		lblNewLabel_4.setBounds(198, 83, 60, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("     PaginaWeb");
		lblNewLabel_5.setBounds(323, 80, 78, 20);
		contentPane.add(lblNewLabel_5);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Agencia cr = new Agencia();
				
				cr.create(txtnombre.getText(), txtdireccion.getText(), txttelefono.getText(), txtcorreo.getText(), txtweb.getText(), Integer.parseInt(txtIDcompañia.getText()));
			}
		});
		btnRegistrar.setBounds(234, 177, 89, 23);
		contentPane.add(btnRegistrar);
		
		txtIDcompañia = new JTextField();
		txtIDcompañia.setBounds(21, 175, 111, 26);
		contentPane.add(txtIDcompañia);
		txtIDcompañia.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id Compañia");
		lblNewLabel.setBounds(24, 150, 87, 14);
		contentPane.add(lblNewLabel);
	}
}
