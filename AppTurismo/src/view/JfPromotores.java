package view;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Conexion;
import Modelo.Promotores;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JfPromotores extends JFrame {

	Conexion conector = new Conexion();
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtcorreopersonal;
	private JTextField txtapellido;
	private JTextField txtTipodedocumento;
	private JTextField txtDocumento;
	private JTextField txtdireccion;
	private JTextField txtcorreocor;
	private JTextField txtfechadenacimiento;
	private JTextField txttelefono;
	private JTextField txtcodigo;
	
	
	   Promotores cr = new Promotores();
	   private JButton btnborrar;
	   private JTextField txtidpromotor;
	   private JLabel lblNewLabel_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JfPromotores frame = new JfPromotores();
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
	public JfPromotores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 450);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(107, 37, 102, 35);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtcorreopersonal = new JTextField();
		txtcorreopersonal.setBounds(395, 37, 102, 35);
		contentPane.add(txtcorreopersonal);
		txtcorreopersonal.setColumns(10);
		
		txtapellido = new JTextField();
		txtapellido.setColumns(10);
		txtapellido.setBounds(107, 96, 102, 35);
		contentPane.add(txtapellido);
		
		txtTipodedocumento = new JTextField();
		txtTipodedocumento.setColumns(10);
		txtTipodedocumento.setBounds(107, 158, 102, 35);
		contentPane.add(txtTipodedocumento);
		
		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(107, 224, 102, 35);
		contentPane.add(txtDocumento);
		
		txtdireccion = new JTextField();
		txtdireccion.setColumns(10);
		txtdireccion.setBounds(107, 282, 102, 35);
		contentPane.add(txtdireccion);
		
		txtcorreocor = new JTextField();
		txtcorreocor.setColumns(10);
		txtcorreocor.setBounds(395, 96, 102, 35);
		contentPane.add(txtcorreocor);
		
		txtfechadenacimiento = new JTextField();
		txtfechadenacimiento.setColumns(10);
		txtfechadenacimiento.setBounds(395, 158, 102, 35);
		contentPane.add(txtfechadenacimiento);
		
		txttelefono = new JTextField();
		txttelefono.setColumns(10);
		txttelefono.setBounds(395, 224, 102, 35);
		contentPane.add(txttelefono);
		
		txtcodigo = new JTextField();
		txtcodigo.setColumns(10);
		txtcodigo.setBounds(395, 282, 102, 35);
		contentPane.add(txtcodigo);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 47, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(10, 106, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tipodedocumento");
		lblNewLabel_2.setBounds(10, 168, 87, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Documento");
		lblNewLabel_3.setBounds(10, 234, 87, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Direccion");
		lblNewLabel_4.setBounds(10, 292, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Correo Personal");
		lblNewLabel_5.setBounds(311, 47, 87, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Correo Cor");
		lblNewLabel_6.setBounds(332, 106, 66, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Fecha De Nacimiento");
		lblNewLabel_7.setBounds(283, 168, 102, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Telefono");
		lblNewLabel_8.setBounds(332, 234, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Codigo");
		lblNewLabel_9.setBounds(341, 287, 57, 25);
		contentPane.add(lblNewLabel_9);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Promotores cr = new Promotores();
				cr.create(txtnombre.getText(), txtapellido.getText(), Integer.parseInt(txtTipodedocumento.getText()), Integer.parseInt(txtDocumento.getText()), txtdireccion.getText(), txtcorreopersonal.getText(), txtcorreocor.getText(), txtfechadenacimiento.getText(), txttelefono.getText(), Integer.parseInt(txtcodigo.getText()));
			}
		});
		btnGuardar.setBounds(408, 361, 89, 23);
		contentPane.add(btnGuardar);
		
		btnborrar = new JButton("Borrar");
		btnborrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cr.delete(Integer.parseInt(txtidpromotor.getText()));
			}
		});
		btnborrar.setBounds(273, 361, 89, 23);
		contentPane.add(btnborrar);
		
		txtidpromotor = new JTextField();
		txtidpromotor.setBounds(83, 361, 113, 38);
		contentPane.add(txtidpromotor);
		txtidpromotor.setColumns(10);
		
		lblNewLabel_10 = new JLabel("Id  Promotor");
		lblNewLabel_10.setBounds(117, 336, 66, 14);
		contentPane.add(lblNewLabel_10);
	}

}

