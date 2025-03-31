package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Operador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JfOperadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDocumento;
	private JTextField txtApellidos;
	private JTextField txtCorreo;
	private JTextField txtTipodedocumento;
	private JTextField txtNombres;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtMatricula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JfOperadores frame = new JfOperadores();
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
	public JfOperadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Documento");
		lblNewLabel_1.setBounds(188, 11, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(165, 36, 109, 20);
		contentPane.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setBounds(200, 67, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(165, 92, 109, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Correo");
		lblNewLabel_3.setBounds(200, 117, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(160, 142, 114, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtTipodedocumento = new JTextField();
		txtTipodedocumento.setBounds(10, 36, 117, 20);
		contentPane.add(txtTipodedocumento);
		txtTipodedocumento.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("T. de documento");
		lblNewLabel_4.setBounds(22, 11, 81, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nombres");
		lblNewLabel_5.setBounds(35, 67, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(10, 86, 117, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Direccion");
		lblNewLabel_6.setBounds(35, 117, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(10, 142, 130, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Telefono");
		lblNewLabel_7.setBounds(35, 173, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(10, 194, 130, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JButton txtRegistar = new JButton("  Registrar");
		txtRegistar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			 Operador cr = new Operador();
			 cr.create(Integer.parseInt(txtTipodedocumento.getText()), Integer.parseInt(txtDocumento.getText()), txtNombres.getText(), txtApellidos.getText(), txtDireccion.getText(), txtCorreo.getText(),txtTelefono.getText(), Integer.parseInt(txtMatricula.getText()));
			 
			}
		});
		txtRegistar.setBounds(309, 91, 89, 23);
		contentPane.add(txtRegistar);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(175, 194, 130, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Matricula");
		lblNewLabel.setBounds(212, 173, 46, 14);
		contentPane.add(lblNewLabel);
		
	}
}
