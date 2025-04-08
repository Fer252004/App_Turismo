package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Tipodemedio {
	
	
	public String nombre;
	public String observacion;
	public int idtipomedio;
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
	
	 public void create(String nombre, String observacion) {
	 Connection dbConnection = null;
     PreparedStatement pst = null; 
     
     
    String scrip ="INSERT INTO tbltipomedio (nombre, observacion) values (?, ?)";
    
    try {
    	dbConnection = conector.ConectarBD();
        pst = dbConnection.prepareStatement(scrip);
        
        
        pst.setString(1, nombre );
        pst.setString(2, observacion);
       
        pst.executeUpdate();
        
        
        JOptionPane.showConfirmDialog(null, "Registro Con exito");
        
	} catch (Exception e) {
		System.out.println("Error: " +e.getMessage());
		
		
		
		
	}
    
    
	 
	 }
	 public void delete( int idtipomedio) {
			
			
			Connection dbConnection = null;
			PreparedStatement pst = null; // preparar la trx
			
			String script = "delete from tbltipomedio where idtipomedio  = ?";
			
			try {
				dbConnection = conector.ConectarBD();// abrir la conexion 
				pst = dbConnection.prepareStatement(script); // abrir el buffer
				
				//parametrizar el campo
				pst.setInt(1, idtipomedio);
				
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
	 
	 public void Update( String nombre, String observacion, int idtipomedio) {
			
			
			Connection dbConnection = null;
			PreparedStatement pst = null;
			
			String script = "Update tbltipomedio set  nombre = ?, observacion = ? WHERE idtipomedio = ?;";
			
			try {
				dbConnection = conector.ConectarBD();// abrir la conexion 
				pst = dbConnection.prepareStatement(script); // abrir el buffer
				
				//parametrizar el campo
			
				 pst.setString(1, nombre );
			       pst.setString(2, observacion);
			       pst.setInt(3, idtipomedio);
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
	 
	 public void read(int idtipomedio, JTextField nombre, JTextField observacion) {
			
			Connection dbConnection = null;
			PreparedStatement pst = null;
			

			String script = "SELECT * FROM  tbltipomedio WHERE idtipomedio  = ?";
			
			try { 
				
				dbConnection = conector.ConectarBD();// abrir la conexion 
				pst = dbConnection.prepareStatement(script); // abrir el buffer
			
		       pst.setInt(1, idtipomedio);
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



