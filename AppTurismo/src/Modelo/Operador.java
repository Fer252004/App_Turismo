package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Operador {

	Conexion conector = new Conexion();
	
	public int idoperador ;
	public int tipodocumento;  
	public int documento;
	public String nombre ;
	public String apellido ;
	public String direccion ;
	public String correo  ;
	public String telefono;
	public int matricula ;
	
	
	public int getIdoperador() {
		return idoperador;
	}
	public void setIdoperador(int idoperador) {
		this.idoperador = idoperador;
	}
	public int getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void create ( int tipodocumento, int documento, String nombre, String apellido, String direccion, String correo, String telefono, int matricula) {
		 Connection dbConnection = null;
	     PreparedStatement pst = null; 
	
	String scrip = "INSERT INTO tbloperador ( tipodocumento, documento, nombre, apellido, direccion, correo, telefono, matricula ) values (?, ?, ?, ?, ?, ?, ?, ?)";
	
	 try {
	    	dbConnection = conector.ConectarBD();
	        pst = dbConnection.prepareStatement(scrip);
	        pst.setString(1, nombre);
	        

	        pst.setInt(1, tipodocumento);
	        pst.setInt(2, documento);
	        pst.setString(3, nombre);
	        pst.setString(4, apellido);
	        pst.setString(5, direccion);
	        pst.setString(6, correo);
	        pst.setString(7, telefono);
	        pst.setInt(8, matricula);
	        
	        pst.executeUpdate();
	        
	        
	        JOptionPane.showConfirmDialog(null, "Registro Con exito");
	        
		} catch (Exception e) {
			System.out.println("Error: " +e.getMessage());
			
	
		}
}
	
  public void delete ( int idoperador) {
		
		
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx
		
		String script = "delete from tbloperador where idoperador  = ?";
		
		try {
			dbConnection = conector.ConectarBD();// abrir la conexion 
			pst = dbConnection.prepareStatement(script); // abrir el buffer
			
			//parametrizar el campo
			pst.setInt(1, idoperador);
			
			// confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿desea eliminar esta fila?");
			
			if(resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "fila eliminada");
			}
			
			
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
  public void Update( int tipodocumento, int documento, String nombre, String apellido, String direccion, String correo, String telefono, int matricula, int idoperador) {
		
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "Update tbloperador set  tipodocumento = ?, documento = ?, nombre = ?, apellido = ?, direccion = ?, correo = ?, telefono = ?, matricula = ? WHERE idoperador = ?;";
		
		try {
			dbConnection = conector.ConectarBD();// abrir la conexion 
			pst = dbConnection.prepareStatement(script); // abrir el buffer
			
			//parametrizar el campo
		
			pst.setInt(1, tipodocumento);
	        pst.setInt(2, documento);
	        pst.setString(3, nombre);
	        pst.setString(4, apellido);
	        pst.setString(5, direccion);
	        pst.setString(6, correo);
	        pst.setString(7, telefono);
	        pst.setInt(8, matricula);
	        pst.setInt(9, idoperador);
	        
	        			// confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿desea Actualizar esta fila?");
			
			if(resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "fila Actualizada");
			}
			
			
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
  
  public void read(int idoperador, JTextField tipodocumento, JTextField documento, JTextField nombre, JTextField apellido, JTextField direccion, JTextField correo, JTextField telefono, JTextField matricula) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		

		String script = "SELECT * FROM  tbloperador WHERE idoperador  = ?";
		
		try { 
			
		 dbConnection = conector.ConectarBD();// abrir la conexion 
			pst = dbConnection.prepareStatement(script); // abrir el buffer
		
	       pst.setInt(1, idoperador);
	       ResultSet rs = pst.executeQuery();
		 
		
		  while (rs.next()) {
		   
			  tipodocumento.setText(rs.getString(2));
			  documento.setText(rs.getString(3));
			  tipodocumento.setText(rs.getString(4));
			  documento.setText(rs.getString(5));  
			  nombre.setText(rs.getString(6));
			  apellido.setText(rs.getString(7));
			  direccion.setText(rs.getString(8));
			  correo.setText(rs.getString(9));
			  telefono.setText(rs.getString(10));
			  matricula.setText(rs.getString(11));
			 
			 


				
		  }
		      
		  
		 } catch (Exception e) {
		 	
		 	System.out.println(e.getMessage());

		 }

		 	 }
		
	}


