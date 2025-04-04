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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JTextField txtidcompañia;
	private JLabel lblNewLabel_6;
	private JButton btnEliminar;
    
	
	Compañia cr = new Compañia();
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
		setBounds(100, 100, 573, 356);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtrazonsocial = new JTextField();
		txtrazonsocial.setBounds(170, 63, 86, 20);
		contentPane.add(txtrazonsocial);
		txtrazonsocial.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(170, 117, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(170, 176, 86, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(351, 63, 86, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtFechadecreacion = new JTextField();
		txtFechadecreacion.setBounds(331, 117, 117, 20);
		contentPane.add(txtFechadecreacion);
		txtFechadecreacion.setColumns(10);
		
		txtWeb = new JTextField();
		txtWeb.setBounds(351, 176, 86, 20);
		contentPane.add(txtWeb);
		txtWeb.setColumns(10);
		
		lblNewLabel = new JLabel("Razon social");
		lblNewLabel.setBounds(180, 38, 76, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Direccion");
		lblNewLabel_1.setBounds(351, 38, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Telefono");
		lblNewLabel_2.setBounds(180, 94, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Correo");
		lblNewLabel_3.setBounds(180, 151, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Web");
		lblNewLabel_4.setBounds(367, 151, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Fecha de Creacion ");
		lblNewLabel_5.setBounds(351, 94, 108, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					
				Compañia cr = new Compañia();
				cr.create(txtrazonsocial.getText(),txtDireccion.getText(), txtTelefono.getText(), txtFechadecreacion.getText(), txtCorreo.getText(), txtWeb.getText());
			}
		});
		btnRegistrar.setBounds(180, 227, 89, 23);
		contentPane.add(btnRegistrar);
		
		txtidcompañia = new JTextField();
		txtidcompañia.setBounds(27, 63, 86, 20);
		contentPane.add(txtidcompañia);
		txtidcompañia.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Id Compañia");
		lblNewLabel_6.setBounds(39, 38, 74, 14);
		contentPane.add(lblNewLabel_6);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.delete(Integer.parseInt(txtidcompañia.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3669361_delete_ic_icon.png"));
		btnEliminar.setBounds(361, 218, 76, 41);
		contentPane.add(btnEliminar);
	}
}
