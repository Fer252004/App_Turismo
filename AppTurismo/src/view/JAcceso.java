package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Promotores;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JAcceso extends JFrame {
	
	
	Promotores pr = new Promotores();
      
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdocumento;
	private JTextField txtContraseña;
	
     
     
     
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAcceso frame = new JAcceso();
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
	public JAcceso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtdocumento = new JTextField();
		txtdocumento.setBounds(247, 151, 137, 39);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		txtContraseña = new JTextField();
		txtContraseña.setColumns(10);
		txtContraseña.setBounds(247, 222, 137, 39);
		contentPane.add(txtContraseña);
		
		JLabel lblNewLabel = new JLabel("Contraseña");
		lblNewLabel.setBounds(161, 222, 72, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Documento");
		lblNewLabel_1.setBounds(161, 157, 59, 27);
		contentPane.add(lblNewLabel_1);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pr.ControlDeAcesso(Integer.parseInt(txtdocumento.getText()),txtContraseña.getText());
				
				
				
			}
		});
		btnEntrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3994380_access_enter_input_login_sign in_icon.png"));
		btnEntrar.setBounds(425, 248, 79, 57);
		contentPane.add(btnEntrar);
		
		JLabel lblNewLabel_2 = new JLabel("       Control De Acceso");
		lblNewLabel_2.setBounds(0, 0, 169, 59);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\control-de-acceso.png"));
		btnNewButton.setBounds(237, 21, 195, 81);
		contentPane.add(btnNewButton);
	}
}
