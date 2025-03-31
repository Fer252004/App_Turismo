package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Medios;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class JfMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombres;
	private JTextField txtObservacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JfMedios frame = new JfMedios();
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
	public JfMedios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombres = new JTextField();
		txtNombres.addMouseListener(new MouseAdapter() {
			
		
		});
		txtNombres.setBounds(134, 96, 128, 32);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtObservacion = new JTextField();
		txtObservacion.setBounds(104, 151, 238, 73);
		contentPane.add(txtObservacion);
		txtObservacion.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombres");
		lblNewLabel.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		lblNewLabel.setBounds(191, 75, 56, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel3 = new JLabel("  Observacion");
		lblNewLabel3.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		lblNewLabel3.setBounds(10, 151, 87, 19);
		contentPane.add(lblNewLabel3);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Medios cr = new Medios();
				cr.create(txtNombres.getText(), txtObservacion.getText());
				
				txtNombres.setText("");
				txtObservacion.setText("");
			}
		});
		btnGuardar.setBounds(305, 101, 89, 23);
		contentPane.add(btnGuardar);
	}
}
