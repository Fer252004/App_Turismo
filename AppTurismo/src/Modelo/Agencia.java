package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Agencia {

	
	Conexion conector = new Conexion();
	

	public String nombre ;
	public String direccion ;
	public String telefono;
	public String correo ;
	public String web ;
	public int idcompania;
	
	
	
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

	public void create( String nombre, String direccion, String telefono, String correo, String web, int idcompania ) {
		 Connection dbConnection = null;
	     PreparedStatement pst = null; 
	
	String scrip = "INSERT INTO tblagencias ( nombre, direccion, telefono, correo, web, idcompania) values (?, ?, ?, ?, ?, ?)";
	
	 try {
	    	dbConnection = conector.ConectarBD();
	        pst = dbConnection.prepareStatement(scrip);
	        

	        pst.setString(1, nombre);
	        pst.setString(2, direccion);
	        pst.setString(3, telefono);
	        pst.setString(4, correo);
	        pst.setString(5, web);
	        pst.setInt(6, idcompania);
	        pst.executeUpdate();
	        
	        
	        JOptionPane.showConfirmDialog(null, "Registro Con exito");
	        
		} catch (Exception e) {
			System.out.println("Error: " +e.getMessage());
			
	
		}
	
	}
}

