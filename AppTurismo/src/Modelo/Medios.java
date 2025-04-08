package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
	
	
public void delete( int idmedio) {
		
		
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx
		
		String script = "delete from tblmedio where idmedio  = ?";
		
		try {
			dbConnection = conector.ConectarBD();// abrir la conexion 
			pst = dbConnection.prepareStatement(script); // abrir el buffer
			
			//parametrizar el campo
			pst.setInt(1, idmedio);
			
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

public void Update( String nombre, String observacion, int idmedio ) {
	
	
	Connection dbConnection = null;
	PreparedStatement pst = null;
	
	String script = "Update tblmedio set  nombre = ?, observacion = ?  WHERE idmedio = ?;";
	
	try {
		dbConnection = conector.ConectarBD();// abrir la conexion 
		pst = dbConnection.prepareStatement(script); // abrir el buffer
		
		//parametrizar el campo
	
		pst.setString(1, nombre);
        pst.setString(2, observacion);
        pst.setInt(3, idmedio);
        
	     
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
	
public void read( int idmedio, JTextField nombre, JTextField observacion  ) {
	
	
	Connection dbConnection = null;
	PreparedStatement pst = null;
	

	String script = "SELECT * FROM  tblmedio WHERE idmedio  = ?";
	
	try { 
		
		dbConnection = conector.ConectarBD();// abrir la conexion 
		pst = dbConnection.prepareStatement(script); // abrir el buffer
	
       pst.setInt(1, idmedio);
       ResultSet rs = pst.executeQuery();
	 
	
	  while (rs.next()) {
	   
		 nombre.setText(rs.getString(2));
		 observacion.setText(rs.getString(3));
		  
		    
		
}


} catch (Exception e) {

System.out.println(e.getMessage());

}
}

}
