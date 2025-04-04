package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Agencia {

	
	Conexion conector = new Conexion();
	
    public int idagencia;
	public String nombre ;
	public String direccion ;
	public String telefono;
	public String correo ;
	public String web ;
	public int idcompania;
	
	public int getidagencia() {
		return idagencia;
	}
	public void setidagencia(int idagencia) {
		this.idagencia = idagencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public int getIdcompania() {
		return idcompania;
	}
	public void setIdcompania(int idcompania) {
		this.idcompania = idcompania;
	}

	public void create( int idagencia, String nombre, String direccion, String telefono, String correo, String web, int idcompania ) {
		 Connection dbConnection = null;
	     PreparedStatement pst = null; 
	
	String scrip = "INSERT INTO tblagencias ( idagencia,  nombre, direccion, telefono, correo, web, idcompania) values (?, ?, ?, ?, ?, ?)";
	
	 try {
	    	dbConnection = conector.ConectarBD();
	        pst = dbConnection.prepareStatement(scrip);
	        
	        pst.setInt(1, idagencia);
		    pst.setString(2, nombre);
	        pst.setString(3, direccion);
	        pst.setString(4, telefono);
	        pst.setString(5, correo);
	        pst.setString(6, web);
	        pst.setInt(7, idcompania);
	        pst.executeUpdate();
		
	        
	        JOptionPane.showConfirmDialog(null, "Registro Con exito");
	        
		} catch (Exception e) {
			System.out.println("Error: " +e.getMessage());
			
	
		}
	
	}
	
	public void delete( int idagencia) {
		
		
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx
		
		String script = "delete from tblagencias where idagencia  = ?";
		
		try {
			dbConnection = conector.ConectarBD();// abrir la conexion 
			pst = dbConnection.prepareStatement(script); // abrir el buffer
			
			
			//parametrizar el campo
			pst.setInt(1, idagencia);
			
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
	
	 public void Update(int idagencia, String nombre, String direccion, String telefono, String correo, String web, int idcompania ) {
		
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "Update tblagencias set idagencia = ?, nombre = ?, direccion = ?, telefono = ?, correo = ?, web = ?, WHERE idcompania = ?;";
		
		try {
			dbConnection = conector.ConectarBD();// abrir la conexion 
			pst = dbConnection.prepareStatement(script); // abrir el buffer
			
			//parametrizar el campo
			    pst.setInt(1, idagencia);
			    pst.setString(2, nombre);
		        pst.setString(3, direccion);
		        pst.setString(4, telefono);
		        pst.setString(5, correo);
		        pst.setString(6, web);
		        pst.setInt(7, idcompania);
		        pst.executeUpdate();
			
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
		
	}
	
     
 


	


