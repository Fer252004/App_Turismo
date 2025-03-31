package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Vehiculos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JfVehiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtmatricula;
	private JTextField txtpuestos;
	private JTextField txtcategoria;
	private JTextField txtplaca;
	private JTextField txtmodelo;
	private JTextField txtmarca;
	private JTextField txtnumeromotor;
	private JTextField txtidtipo;
	private JLabel lblNewLabel_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JfVehiculo frame = new JfVehiculo();
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
	public JfVehiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Matricula");
		lblNewLabel.setBounds(31, 22, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtmatricula = new JTextField();
		txtmatricula.setBounds(31, 47, 86, 20);
		contentPane.add(txtmatricula);
		txtmatricula.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Puestos");
		lblNewLabel_1.setBounds(31, 78, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Placa");
		lblNewLabel_2.setBounds(217, 22, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtpuestos = new JTextField();
		txtpuestos.setBounds(31, 103, 86, 20);
		contentPane.add(txtpuestos);
		txtpuestos.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Categoria");
		lblNewLabel_3.setBounds(31, 149, 73, 14);
		contentPane.add(lblNewLabel_3);
		
		txtcategoria = new JTextField();
		txtcategoria.setBounds(31, 174, 86, 20);
		contentPane.add(txtcategoria);
		txtcategoria.setColumns(10);
		
		txtplaca = new JTextField();
		txtplaca.setBounds(190, 47, 107, 20);
		contentPane.add(txtplaca);
		txtplaca.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Marca");
		lblNewLabel_4.setBounds(381, 22, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txtmodelo = new JTextField();
		txtmodelo.setBounds(200, 103, 86, 20);
		contentPane.add(txtmodelo);
		txtmodelo.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Modelo");
		lblNewLabel_6.setBounds(217, 78, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		txtmarca = new JTextField();
		txtmarca.setBounds(354, 47, 86, 20);
		contentPane.add(txtmarca);
		txtmarca.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Id Tipo");
		lblNewLabel_7.setBounds(239, 149, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		txtnumeromotor = new JTextField();
		txtnumeromotor.setBounds(375, 103, 86, 20);
		contentPane.add(txtnumeromotor);
		txtnumeromotor.setColumns(10);
		
		txtidtipo = new JTextField();
		txtidtipo.setBounds(217, 174, 86, 20);
		contentPane.add(txtidtipo);
		txtidtipo.setColumns(10);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Vehiculos cr = new Vehiculos();
				cr.create(Integer.parseInt(txtmatricula.getText()), Integer.parseInt(txtplaca.getText()), txtmarca.getText(), Integer.parseInt(txtpuestos.getText()), txtmodelo.getText(), txtnumeromotor.getText(), txtcategoria.getText(), Integer.parseInt(txtidtipo.getText()));
			
			}
		});
		btnRegistrar.setBounds(354, 236, 89, 23);
		contentPane.add(btnRegistrar);
		
		lblNewLabel_8 = new JLabel("Numero De Motor");
		lblNewLabel_8.setBounds(364, 78, 89, 14);
		contentPane.add(lblNewLabel_8);
	}
}

