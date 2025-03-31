package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Paquete;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JfPaquetes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIDOrigen;
	private JTextField txtIDDestino;
	private JTextField txtprecio;
	private JTextField txtFechadeventa;
	private JTextField txtHoradeventa;
	private JTextField txtHoradesalida;
	private JTextField txtFechadeejecucion;
	private JTextField txtObservaciones;
	private JTextField txtIdAgencia;
	private JTextField txtMatricula;
	private JTextField txtIdPromotor;
	private JTextField txtIdCliente;
	private JTextField txtIdMedio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JfPaquetes frame = new JfPaquetes();
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
	public JfPaquetes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIDOrigen = new JTextField();
		txtIDOrigen.setBounds(57, 47, 97, 30);
		contentPane.add(txtIDOrigen);
		txtIDOrigen.setColumns(10);
		
		txtIDDestino = new JTextField();
		txtIDDestino.setBounds(221, 47, 91, 30);
		contentPane.add(txtIDDestino);
		txtIDDestino.setColumns(10);
		
		txtprecio = new JTextField();
		txtprecio.setBounds(356, 47, 99, 30);
		contentPane.add(txtprecio);
		txtprecio.setColumns(10);
		
		txtFechadeventa = new JTextField();
		txtFechadeventa.setBounds(57, 129, 99, 30);
		contentPane.add(txtFechadeventa);
		txtFechadeventa.setColumns(10);
		
		txtHoradeventa = new JTextField();
		txtHoradeventa.setBounds(531, 47, 91, 30);
		contentPane.add(txtHoradeventa);
		txtHoradeventa.setColumns(10);
		
		txtHoradesalida = new JTextField();
		txtHoradesalida.setBounds(373, 129, 99, 30);
		contentPane.add(txtHoradesalida);
		txtHoradesalida.setColumns(10);
		
		txtFechadeejecucion = new JTextField();
		txtFechadeejecucion.setBounds(221, 129, 99, 30);
		contentPane.add(txtFechadeejecucion);
		txtFechadeejecucion.setColumns(10);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setBounds(514, 129, 91, 30);
		contentPane.add(txtObservaciones);
		txtObservaciones.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("IDOrigen");
		lblNewLabel_1.setBounds(78, 30, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("IDDestino");
		lblNewLabel_2.setBounds(235, 30, 62, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("  Precio");
		lblNewLabel_3.setBounds(374, 30, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("FechaDeventa");
		lblNewLabel_4.setBounds(78, 104, 72, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("   Horadeventa");
		lblNewLabel_5.setBounds(524, 30, 81, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("  Horadesalida");
		lblNewLabel_6.setBounds(378, 104, 77, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Fechadejecucion");
		lblNewLabel_7.setBounds(231, 104, 81, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Observaciones");
		lblNewLabel_8.setBounds(522, 104, 72, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnGuardar = new JButton("  Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Paquete cr = new Paquete();
				cr.create(Integer.parseInt(txtIDDestino.getText()), Integer.parseInt(txtIDOrigen.getText()) , txtprecio.getText(),  txtFechadeventa.getText(), txtHoradeventa.getText(), txtHoradesalida.getText(), txtFechadeejecucion.getText(), txtObservaciones.getText(), Integer.parseInt(txtIdAgencia.getText()), Integer.parseInt(txtMatricula.getText()), Integer.parseInt(txtIdPromotor.getText()), Integer.parseInt(txtIdCliente.getText()), Integer.parseInt(txtIdMedio.getText()));
			}
		});
		btnGuardar.setBounds(466, 317, 89, 23);
		contentPane.add(btnGuardar);
		
		txtIdAgencia = new JTextField();
		txtIdAgencia.setBounds(57, 213, 99, 35);
		contentPane.add(txtIdAgencia);
		txtIdAgencia.setColumns(10);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(235, 213, 97, 35);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		txtIdPromotor = new JTextField();
		txtIdPromotor.setBounds(397, 213, 91, 35);
		contentPane.add(txtIdPromotor);
		txtIdPromotor.setColumns(10);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(519, 213, 103, 35);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		txtIdMedio = new JTextField();
		txtIdMedio.setBounds(64, 305, 109, 35);
		contentPane.add(txtIdMedio);
		txtIdMedio.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id Agencia");
		lblNewLabel.setBounds(78, 188, 58, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_9 = new JLabel("Matricula");
		lblNewLabel_9.setBounds(251, 188, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Id Promotor");
		lblNewLabel_10.setBounds(412, 188, 58, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Id Cliente");
		lblNewLabel_11.setBounds(544, 188, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Id Medio");
		lblNewLabel_12.setBounds(90, 280, 46, 14);
		contentPane.add(lblNewLabel_12);
	}

}
