package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Operador;
import Modelo.Promotores;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JTextField txtidoperador;
	private JLabel lblNewLabel_8;
  
	
	Operador cr = new  Operador();
	
	 private JButton btnEliminar;
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
		setBounds(100, 100, 510, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Documento");
		lblNewLabel_1.setBounds(248, 11, 68, 14);
		contentPane.add(lblNewLabel_1);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(228, 36, 109, 20);
		contentPane.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setBounds(256, 67, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(228, 86, 109, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Correo");
		lblNewLabel_3.setBounds(270, 117, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(228, 142, 114, 20);
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
		txtRegistar.setBounds(376, 85, 89, 23);
		contentPane.add(txtRegistar);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(228, 194, 130, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Matricula");
		lblNewLabel.setBounds(270, 173, 46, 14);
		contentPane.add(lblNewLabel);
	
		txtidoperador = new JTextField();
		txtidoperador.setBounds(379, 36, 86, 20);
		contentPane.add(txtidoperador);
		txtidoperador.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Id Operador");
		lblNewLabel_8.setBounds(395, 11, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cr.delete(Integer.parseInt(txtidoperador.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3669361_delete_ic_icon.png"));
		btnEliminar.setBounds(376, 129, 81, 46);
		contentPane.add(btnEliminar);
		
	}
}
