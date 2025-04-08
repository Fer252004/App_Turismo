package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
	
public void delete ( int idtipo) {
		
		
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx
		
		String script = "delete from tbltipotransporte where idtipo  = ?";
		
		try {
			dbConnection = conector.ConectarBD();// abrir la conexion 
			pst = dbConnection.prepareStatement(script); // abrir el buffer
			
			//parametrizar el campo
			pst.setInt(1, idtipo);
			
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
public void Update( String nombre, String observacion, int Idtipo ) {
	
	
	Connection dbConnection = null;
	PreparedStatement pst = null;
	
	String script = "Update tbltipotransporte set  nombre = ?, observacion = ? WHERE Idtipo = ?;";
	
	try {
		dbConnection = conector.ConectarBD();// abrir la conexion 
		pst = dbConnection.prepareStatement(script); // abrir el buffer
		
		//parametrizar el campo
	
		  pst.setString(1, nombre);
	        pst.setString(2, observacion);
	        pst.setInt(3, Idtipo);
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

public void read(int Idtipo, JTextField nombre, JTextField observacion) {
	
	Connection dbConnection = null;
	PreparedStatement pst = null;
	

	String script = "SELECT * FROM  tbltipotransporte WHERE Idtipo  = ?";
	
	try { 
		
		dbConnection = conector.ConectarBD();// abrir la conexion 
		pst = dbConnection.prepareStatement(script); // abrir el buffer
	
       pst.setInt(1, Idtipo);
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
