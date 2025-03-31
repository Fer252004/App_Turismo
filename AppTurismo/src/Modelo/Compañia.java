package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Compañia {

	Conexion conector = new Conexion ();
	
	public int idcompania=0; 
	public String razonsocial= "";  
	public String direccion  = "";
	public String telefono  = "";
	public String fechacreacion  = "";
	public String correo = "";
	public String web = "";
	
	public int getIdcompania() {
		return idcompania;
	}
	public void setIdcompania(int idcompania) {
		this.idcompania = idcompania;
	}
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
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
	public String getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
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
	
	public void create( String razonsocial, String direccion, String telefono, String fechacreacion, String correo, String web  ) {
		 Connection dbConnection = null;
	     PreparedStatement pst = null; 
	     
	String scrip = "INSERT INTO tblcompania ( razonsocial, direccion, telefono, fechacreacion, correo, web  ) values (?, ?, ?, ?, ?, ?)";
	
	 try {
	    	dbConnection = conector.ConectarBD();
	        pst = dbConnection.prepareStatement(scrip);
	        

	        pst.setString(1, razonsocial);
	        pst.setString(2, direccion);
	        pst.setString(3, telefono);
	        pst.setString(4, fechacreacion);
	        pst.setString(5, correo);
	        pst.setString(6, web);
	        
	        pst.executeUpdate();
	        
	        
	        JOptionPane.showConfirmDialog(null, "Registro Con exito");
	        
		} catch (Exception e) {
			System.out.println("Error: " +e.getMessage());
			
	
		}
	
}
	
}
