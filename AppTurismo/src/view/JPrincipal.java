package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class JPrincipal extends JFrame {

	
	    
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPrincipal frame = new JPrincipal();
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
	public JPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgencia = new JButton("");
		btnAgencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JfAgencia Ag = new JfAgencia();
				Ag.setVisible(true);
			}
			
		});
		btnAgencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				
			}
		});
		btnAgencia.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\7648081_travel_agency_service_tourism_icon.png"));
		btnAgencia.setBounds(70, 97, 72, 52);
		contentPane.add(btnAgencia);
		
		JLabel btnNewButton_ = new JLabel("Agencia");
		btnNewButton_.setBounds(81, 78, 46, 14);
		contentPane.add(btnNewButton_);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9042710_packages_icon.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JfPaquetes Paquetes = new JfPaquetes();	
				Paquetes.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(56, 207, 89, 58);
		contentPane.add(btnNewButton_1);
		
		JButton btnCliente = new JButton("");
		btnCliente.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3709754_assistance_business_client_service_support_icon.png"));
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JfClientes Cliente = new JfClientes();
				
				Cliente.setVisible(true);
				}
		});
		btnCliente.setBounds(218, 97, 81, 52);
		contentPane.add(btnCliente);
		
		JButton btnCompañia = new JButton("");
		btnCompañia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JfCompañia Compañia = new JfCompañia();
				Compañia.setVisible(true);
			}
		});
		btnCompañia.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\7898491_company_business_finance_office_marketing_icon.png"));
		btnCompañia.setBounds(366, 97, 89, 52);
		contentPane.add(btnCompañia);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\5340247_chat_media_network_social_telegram_icon.png"));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JfMedios Medios = new JfMedios();
				Medios.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(521, 97, 81, 52);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4417115_headset_operator_person_support_mic_icon.png"));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JfOperadores Operador = new JfOperadores();
				Operador.setVisible(true);
				
			}
		});
		btnNewButton_5.setBounds(676, 101, 89, 48);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\211873_person_stalker_icon.png"));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JfPromotores Promotor = new JfPromotores();
				Promotor.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(218, 207, 81, 58);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\medios-en-la-nube.png"));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JfTiposdemedios Tipodemedio = new JfTiposdemedios();
				Tipodemedio.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(380, 202, 81, 63);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\coche.png"));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JfVehiculo vehiculos = new JfVehiculo();
				vehiculos.setVisible(true);
				
			}
		});
		btnNewButton_8.setBounds(553, 207, 89, 58);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\camion.png"));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tiposdetransporte Tipodetransporte = new Tiposdetransporte();
				Tipodetransporte.setVisible(true);
			}
		});
		btnNewButton_9.setBounds(694, 207, 81, 58);
		contentPane.add(btnNewButton_9);
		
		JLabel lblNewLabel = new JLabel("Cliente");
		lblNewLabel.setBounds(232, 78, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Compañia");
		lblNewLabel_1.setBounds(380, 78, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Medios");
		lblNewLabel_2.setBounds(531, 78, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Operador");
		lblNewLabel_3.setBounds(685, 76, 60, 18);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Paquetes");
		lblNewLabel_4.setBounds(70, 182, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Promotores");
		lblNewLabel_5.setBounds(218, 182, 62, 18);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tipos De Medios");
		lblNewLabel_6.setBounds(390, 182, 81, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Vehiculos");
		lblNewLabel_7.setBounds(576, 182, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Tipo De Transporte");
		lblNewLabel_8.setBounds(701, 180, 107, 18);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("             Formularios De Registros");
		lblNewLabel_9.setFont(new Font("Bodoni MT Black", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(150, 11, 492, 48);
		contentPane.add(lblNewLabel_9);
	}
}
