package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Agencia;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JLabel lblNewLabel_6;
	private JTextField txtIdagencia;
      
	 Agencia cr = new Agencia(); 
	
	
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
		setBounds(100, 100, 594, 360);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(21, 98, 102, 26);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(156, 98, 126, 26);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(313, 98, 111, 26);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setBounds(173, 175, 111, 26);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txtweb = new JTextField();
		txtweb.setBounds(298, 175, 126, 26);
		contentPane.add(txtweb);
		txtweb.setColumns(10);
		
		lblNewLabel_1 = new JLabel("   Nombre");
		lblNewLabel_1.setBounds(40, 73, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("     Direccion");
		lblNewLabel_2.setBounds(184, 73, 63, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("  Telefono ");
		lblNewLabel_3.setBounds(346, 71, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("    Correo");
		lblNewLabel_4.setBounds(197, 147, 60, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("     PaginaWeb");
		lblNewLabel_5.setBounds(328, 144, 78, 20);
		contentPane.add(lblNewLabel_5);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666542_save_icon.png"));
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Agencia cr = new Agencia();
				
				try {
					
					cr.create(Integer.parseInt(txtIdagencia.getText()),txtnombre.getText(), txtdireccion.getText(), txttelefono.getText(), txtcorreo.getText(), txtweb.getText(), Integer.parseInt(txtIDcompañia.getText()));
					txtIdagencia.setText("");
					txtnombre.setText("");
					txtdireccion.setText("");
					txttelefono.setText("");
					txtcorreo.setText("");
					txtweb.setText("");
					txtIDcompañia.setText("");
					
				} catch (Exception E) {
				  JOptionPane.showMessageDialog(null, "Ingrese datos");
				}
			  }
		});
		btnRegistrar.setBounds(364, 227, 89, 40);
		contentPane.add(btnRegistrar);
		
		txtIDcompañia = new JTextField();
		txtIDcompañia.setBounds(21, 175, 111, 26);
		contentPane.add(txtIDcompañia);
		txtIDcompañia.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id Compañia");
		lblNewLabel.setBounds(24, 150, 87, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_6 = new JLabel("Id Agencia");
		lblNewLabel_6.setBounds(184, 11, 63, 14);
		contentPane.add(lblNewLabel_6);
		
		txtIdagencia = new JTextField();
		txtIdagencia.setBounds(156, 36, 99, 26);
		contentPane.add(txtIdagencia);
		txtIdagencia.setColumns(10);
		
		JButton btneliminar = new JButton("Eliminar");
		btneliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cr.delete(Integer.parseInt(txtIdagencia.getText()));
			}
		});
		btneliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3669361_delete_ic_icon.png"));
		btneliminar.setBounds(37, 227, 63, 40);
		contentPane.add(btneliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cr.Update(txtnombre.getText(), txtdireccion.getText(), txttelefono.getText(), txtcorreo.getText(), txtweb.getText(), Integer.parseInt(txtIDcompañia.getText()), Integer.parseInt(txtIdagencia.getText()));
			}
		});
		btnActualizar.setBounds(197, 236, 102, 31);
		contentPane.add(btnActualizar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cr.read(Integer.parseInt(txtIdagencia.getText()), txtnombre, txtdireccion, txttelefono, txtcorreo, txtweb, txtIDcompañia);
			
			
			}
			
		});
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9004762_search_find_zoom_magnifier_icon.png"));
		btnConsultar.setBounds(474, 36, 69, 55);
		contentPane.add(btnConsultar);
	}
}
