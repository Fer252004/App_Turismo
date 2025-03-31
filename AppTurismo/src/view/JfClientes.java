package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Cliente;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JfClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombres;
	private JTextField txtAlergias;
	private JTextField txtEstadocivil;
	private JTextField txtDireccion;
	private JTextField txtTipodedocumento;
	private JTextField txtDocumento;
	private JTextField txtApellidos;
	private JTextField txtEps;
	private JTextField txtFechadenacimiento;
	private JTextField txtCorreo;
	private JTextField txtNumerotelefonico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JfClientes frame = new JfClientes();
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
	public JfClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(10, 79, 108, 28);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		
		txtAlergias = new JTextField();
		txtAlergias.setBounds(10, 126, 108, 28);
		contentPane.add(txtAlergias);
		txtAlergias.setColumns(10);
		
		txtEstadocivil = new JTextField();
		txtEstadocivil.setBounds(10, 180, 108, 28);
		contentPane.add(txtEstadocivil);
		txtEstadocivil.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(161, 180, 97, 28);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtTipodedocumento = new JTextField();
		txtTipodedocumento.setBounds(67, 30, 97, 28);
		contentPane.add(txtTipodedocumento);
		txtTipodedocumento.setColumns(10);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(265, 30, 97, 28);
		contentPane.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(161, 79, 97, 28);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtEps = new JTextField();
		txtEps.setBounds(306, 79, 97, 28);
		contentPane.add(txtEps);
		txtEps.setColumns(10);
		
		txtFechadenacimiento = new JTextField();
		txtFechadenacimiento.setBounds(161, 126, 97, 28);
		contentPane.add(txtFechadenacimiento);
		txtFechadenacimiento.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(306, 126, 97, 28);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtNumerotelefonico = new JTextField();
		txtNumerotelefonico.setBounds(306, 180, 97, 28);
		contentPane.add(txtNumerotelefonico);
		txtNumerotelefonico.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipodedocumento");
		lblNewLabel_1.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(67, 11, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("   Nombres");
		lblNewLabel_3.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(30, 61, 75, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellidos");
		lblNewLabel_4.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(171, 61, 59, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("     Eps");
		lblNewLabel_5.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(316, 61, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Alergias");
		lblNewLabel_6.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(42, 110, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("FechadeNacimiento");
		lblNewLabel_7.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(161, 110, 123, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("  Correo");
		lblNewLabel_8.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(326, 110, 65, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("    EstadoCivil");
		lblNewLabel_9.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(10, 165, 85, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("   Direccion");
		lblNewLabel_10.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		lblNewLabel_10.setBounds(171, 165, 75, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("  NumeroTelefonico");
		lblNewLabel_11.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		lblNewLabel_11.setBounds(295, 165, 118, 14);
		contentPane.add(lblNewLabel_11);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			  Cliente create = new Cliente(); 
			  create.create(Integer.parseInt(txtTipodedocumento.getText()), Integer.parseInt(txtDocumento.getText()), txtNombres.getText(), txtApellidos.getText(), txtEps.getText(), txtAlergias.getText(), txtFechadenacimiento.getText(), txtCorreo.getText(), txtEstadocivil.getText(), txtDireccion.getText(), txtNumerotelefonico.getText());
			
			  txtTipodedocumento.setText("");
			  txtDocumento.setText("");
			  txtNombres.setText("");
			  txtApellidos.setText("");
			  txtEps.setText("");
			  txtAlergias.setText("");
			  txtFechadenacimiento.setText("");
			  txtCorreo.setText("");
			  txtEstadocivil.setText("");
			  txtDireccion.setText("");
			  txtNumerotelefonico.setText("");
			 
			  }
		});
		btnNewButton.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		btnNewButton.setBounds(273, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_12 = new JLabel(" Documento");
		lblNewLabel_12.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		lblNewLabel_12.setBounds(265, 11, 75, 14);
		contentPane.add(lblNewLabel_12);
		
		
	}

}
