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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tiposdetransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservacion;
	private JTextField txtIdtipo;

	
	   Tipodetransporte cr = new Tipodetransporte();
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
		setBounds(100, 100, 541, 325);
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
		btnGuardar.setBounds(314, 72, 89, 23);
		contentPane.add(btnGuardar);
		
		txtIdtipo = new JTextField();
		txtIdtipo.setBounds(147, 49, 104, 30);
		contentPane.add(txtIdtipo);
		txtIdtipo.setColumns(10);
		
		JLabel lblNewLabel3 = new JLabel("Id Tipo");
		lblNewLabel3.setBounds(57, 57, 55, 14);
		contentPane.add(lblNewLabel3);
		
		JButton brnEliminar = new JButton("Eliminar");
		brnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cr.delete(Integer.parseInt(txtIdtipo.getText()));
			}
		});
		brnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3669361_delete_ic_icon.png"));
		brnEliminar.setBounds(328, 106, 66, 48);
		contentPane.add(brnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cr.Update(txtNombre.getText(), txtObservacion.getText(), Integer.parseInt(txtIdtipo.getText()));
			}
		});
		btnActualizar.setBounds(348, 188, 89, 23);
		contentPane.add(btnActualizar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cr.read(Integer.parseInt(txtIdtipo.getText()), txtNombre, txtObservacion);
			}
		});
		btnConsultar.setBounds(436, 158, 89, 23);
		contentPane.add(btnConsultar);
	}
}
