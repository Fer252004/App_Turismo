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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
    


public class JfTiposdemedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtobservacion1;

	Tipodemedio cr = new Tipodemedio();
	private JTextField txtIdtipodemedio;
	
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
		setBounds(100, 100, 608, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(109, 167, 129, 27);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtobservacion1 = new JTextField();
		txtobservacion1.setBounds(73, 253, 249, 76);
		contentPane.add(txtobservacion1);
		txtobservacion1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("  Nombre");
		lblNewLabel_1.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(37, 138, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel txtObservacion = new JLabel(" Observacion");
		txtObservacion.setFont(new Font("Bodoni MT Black", Font.PLAIN, 11));
		txtObservacion.setBounds(10, 228, 78, 14);
		contentPane.add(txtObservacion);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666542_save_icon.png"));
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
		btnGuardar.setBounds(382, 167, 78, 44);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel = new JLabel("     Gestion Tipos De Medios");
		lblNewLabel.setBounds(138, 11, 163, 34);
		contentPane.add(lblNewLabel);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			cr.delete(Integer.parseInt(txtIdtipodemedio.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3669361_delete_ic_icon.png"));
		btnEliminar.setBounds(382, 81, 78, 44);
		contentPane.add(btnEliminar);
		
		JLabel lblNewLabel_2 = new JLabel("Id Tipo De Medio");
		lblNewLabel_2.setBounds(10, 66, 101, 14);
		contentPane.add(lblNewLabel_2);
		
		txtIdtipodemedio = new JTextField();
		txtIdtipodemedio.setBounds(100, 81, 116, 27);
		contentPane.add(txtIdtipodemedio);
		txtIdtipodemedio.setColumns(10);
	}
}
