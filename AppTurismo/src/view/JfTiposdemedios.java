package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Tipodemedio;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JfTiposdemedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtobservacion1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JfTiposdemedios frame = new JfTiposdemedios();
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
	public JfTiposdemedios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(111, 81, 129, 27);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtobservacion1 = new JTextField();
		txtobservacion1.setBounds(91, 164, 249, 76);
		contentPane.add(txtobservacion1);
		txtobservacion1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("  Nombre");
		lblNewLabel_1.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(139, 56, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel txtObservacion = new JLabel(" Observacion");
		txtObservacion.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		txtObservacion.setBounds(20, 139, 78, 14);
		contentPane.add(txtObservacion);
		
		JButton btnGuardar = new JButton(" Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			 
				Tipodemedio cr = new Tipodemedio();
				cr.create(txtNombre.getText(), txtobservacion1.getText());
		         txtNombre.setText("");
		         txtobservacion1.setText("");
		 
			}
		});
		btnGuardar.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		btnGuardar.setBounds(303, 109, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel = new JLabel("     Gestion Tipos De Medios");
		lblNewLabel.setBounds(138, 11, 163, 34);
		contentPane.add(lblNewLabel);
	}
}
