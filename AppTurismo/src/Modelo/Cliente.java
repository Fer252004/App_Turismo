package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Cliente {
	
	Conexion conector = new Conexion();
	
	public int tipodocumento;  
	public int documento;  
	public String nombre ;
	public String apellidos ;
	public String eps;
	public String alergias;
	public String fechanacimiento; 
	public String correo ;
	public String estadocivil ;
	public String direccion;
	public String telefonico;
	
	

	public int getTipodocumento() {
		return tipodocumento;
	}




	public void setTipodocumento(int tipodocumento) {
		tipodocumento = tipodocumento;
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




	public String getApellidos() {
		return apellidos;
	}




	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}




	public String getEps() {
		return eps;
	}




	public void setEps(String eps) {
		this.eps = eps;
	}




	public String getAlergias() {
		return alergias;
	}




	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}




	public String getFechanacimiento() {
		return fechanacimiento;
	}




	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}




	public String getCorreo() {
		return correo;
	}




	public void setCorreo(String correo) {
		this.correo = correo;
	}




	public String getEstadocivil() {
		return estadocivil;
	}




	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}




	public String getDireccion() {
		return direccion;
	}




	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}




	public String getTelefonico() {
		return telefonico;
	}




	public void setTelefonico(String telefonico) {
		this.telefonico = telefonico;
	}




	
	

	
	
	public void create(int tipodocumento, int documentos , String nombre , String Apellidos, String Eps, String Alergias, String fechanacimiento, String Correo, String Estadocivil, String Direccion, String telefonico ) {
		 Connection dbConnection = null;
	     PreparedStatement pst = null; 
	
	
	String scrip = "INSERT INTO tblcliente ( tipodocumento, documento, nombre, Apellidos, Eps, Alergias, fechanacimiento, Correo, Estadocivil, Direccion, telefonico ) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	 try {
	    	dbConnection = conector.ConectarBD();
	        pst = dbConnection.prepareStatement(scrip);
	        
	        
	        pst.setInt(1, tipodocumento);
	        pst.setInt(2, documentos);
	        pst.setString(3, nombre);
	        pst.setString(4, Apellidos);
	        pst.setString(5, Eps);
	        pst.setString(6, Alergias);
	        pst.setString(7, fechanacimiento);
	        pst.setString(8, Correo);
	        pst.setString(9, Estadocivil);
	        pst.setString(10, Direccion);
	        pst.setString(11, telefonico);
	       
	        pst.executeUpdate();
	        
	        
	        JOptionPane.showConfirmDialog(null, "Registro Con exito");
	        
		} catch (Exception e) {
			System.out.println("Error: " +e.getMessage());
			
		}
		  
		    
		  
	  }

public void delete( int idcliente) {
		
		
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx
		
		String script = "delete from tblcliente where idcliente  = ?";
		
		try {
			dbConnection = conector.ConectarBD();// abrir la conexion 
			pst = dbConnection.prepareStatement(script); // abrir el buffer
			
			//parametrizar el campo
			pst.setInt(1, idcliente);
			
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
	  }
	
	

