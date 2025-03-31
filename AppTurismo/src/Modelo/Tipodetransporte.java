package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Tipodetransporte {
     
	
	Conexion conector = new Conexion();
	
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


	public int getIdtipo() {
		return Idtipo;
	}


	public void setIdtipo(int idtipo) {
		Idtipo = idtipo;
	}


	public String nombre = "";
	public String observacion = "";
	public int Idtipo ;
	
	
	public void create(String nombre, String observacion, int Idtipo ) {
		 Connection dbConnection = null;
	     PreparedStatement pst = null; 
	
	String scrip = "INSERT INTO tbltipotransporte ( nombre, observacion, Idtipo ) values (?, ?, ?)";
	
	 try {
	    	dbConnection = conector.ConectarBD();
	        pst = dbConnection.prepareStatement(scrip);
	        

	        pst.setString(1, nombre);
	        pst.setString(2, observacion);
	        pst.setInt(3, Idtipo);
	        pst.executeUpdate();
	        
	        
	        JOptionPane.showConfirmDialog(null, "Registro Con exito");
	        
		} catch (Exception e) {
			System.out.println("Error: " +e.getMessage());
			
	
		}
	
	}
}
