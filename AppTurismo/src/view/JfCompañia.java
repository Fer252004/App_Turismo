package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Compañia;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class JfCompañia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtrazonsocial;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtDireccion;
	private JTextField txtFechadecreacion;
	private JTextField txtWeb;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JfCompañia frame = new JfCompañia();
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
	public JfCompañia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 333);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtrazonsocial = new JTextField();
		txtrazonsocial.setBounds(102, 49, 86, 20);
		contentPane.add(txtrazonsocial);
		txtrazonsocial.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(102, 103, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(102, 162, 86, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(283, 49, 86, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtFechadecreacion = new JTextField();
		txtFechadecreacion.setBounds(283, 103, 117, 20);
		contentPane.add(txtFechadecreacion);
		txtFechadecreacion.setColumns(10);
		
		txtWeb = new JTextField();
		txtWeb.setBounds(283, 162, 86, 20);
		contentPane.add(txtWeb);
		txtWeb.setColumns(10);
		
		lblNewLabel = new JLabel("Razon social");
		lblNewLabel.setBounds(112, 24, 76, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Direccion");
		lblNewLabel_1.setBounds(299, 25, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Telefono");
		lblNewLabel_2.setBounds(112, 80, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Correo");
		lblNewLabel_3.setBounds(114, 145, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Web");
		lblNewLabel_4.setBounds(299, 145, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Fecha de Creacion ");
		lblNewLabel_5.setBounds(293, 80, 108, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					
				Compañia cr = new Compañia();
				cr.create(txtrazonsocial.getText(),txtDireccion.getText(), txtTelefono.getText(), txtFechadecreacion.getText(), txtCorreo.getText(), txtWeb.getText());
			}
		});
		btnRegistrar.setBounds(290, 227, 89, 23);
		contentPane.add(btnRegistrar);
	}
}
