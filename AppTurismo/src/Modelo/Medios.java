package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Medios {
	
	
	Conexion conector = new Conexion();
	
	public int idmedio=0;
	public String nombre = ""; 
	public String observacion = "";
	public int idtipomedio =0;
	
	public int getIdmedio() {
		return idmedio;
	}
	public void setIdmedio(int idmedio) {
		this.idmedio = idmedio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int getIdtipomedio() {
		return idtipomedio;
	}
	public void setIdtipomedio(int idtipomedio) {
		this.idtipomedio = idtipomedio;
	}
	
	public void create(String nombre, String observacion ) {
		 Connection dbConnection = null;
	     PreparedStatement pst = null; 
	
	String scrip = "INSERT INTO tblmedio ( nombre, observacion ) values (?, ?)";
	
	 try {
	    	dbConnection = conector.ConectarBD();
	        pst = dbConnection.prepareStatement(scrip);
	        

	        pst.setString(1, nombre);
	        pst.setString(2, observacion);
	       
	        pst.executeUpdate();
	        
	        
	        JOptionPane.showConfirmDialog(null, "Registro Con exito");
	        
		} catch (Exception e) {
			System.out.println("Error: " +e.getMessage());
			

}
	 
	}
}
