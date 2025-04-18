package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Vehiculos {

	
	Conexion conector = new Conexion();
	
	public int matricula; 
	public int placa ;
	public String marca ;
	public int puestos;
	public String modelo ;
	public String numeromotor ;
	public String categoria;
	public int idtipo;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getPlaca() {
		return placa;
	}
	public void setPlaca(int placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNumeromotor() {
		return numeromotor;
	}
	public void setNumeromotor(String numeromotor) {
		this.numeromotor = numeromotor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}
	
	
	public void create( int matricula, int placa, String marca, int puestos, String modelo, String numeromotor, String  categoria, int idtipo  ) {
		 Connection dbConnection = null;
	     PreparedStatement pst = null;      
	     
	
	String scrip = "INSERT INTO tblvehiculo ( matricula, placa, marca, puestos, modelo, numeromotor, categoria, idtipo) values (?, ?, ?, ?, ?, ?, ?, ?)";
	
	 try {
	    	dbConnection = conector.ConectarBD();
	        pst = dbConnection.prepareStatement(scrip);
	        

	        pst.setInt(1, matricula);
	        pst.setInt(2, placa);
	        pst.setString(3, marca);
	        pst.setInt(4, puestos);
	        pst.setString(5, modelo);
	        pst.setString(6, numeromotor);
	        pst.setString(7, categoria);
	        pst.setInt(8, idtipo);
	        
	        pst.executeUpdate();
	        
	        
	        JOptionPane.showConfirmDialog(null, "Registro Con exito");
	        
		} catch (Exception e) {
			System.out.println("Error: " +e.getMessage());
			
	
		}
	}
	
	
     public void delete ( int matricula) {
		
		
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx
		
		String script = "delete from tblvehiculo where matricula  = ?";
		
		try {
			dbConnection = conector.ConectarBD();// abrir la conexion 
			pst = dbConnection.prepareStatement(script); // abrir el buffer
			
			//parametrizar el campo
			    pst.setInt(1, matricula);
			
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
     
     public void Update( int placa, String marca, int puestos, String modelo, String numeromotor, String  categoria, int idtipo, int matricula  ) {
    		
    		
    		Connection dbConnection = null;
    		PreparedStatement pst = null;
    		
    		String script = "Update tblvehiculo set  placa = ?, marca = ?, puestos = ?, modelo = ?, numeromotor = ?, categoria = ?, Idtipo = ? WHERE matricula = ?;";
    		
    		try {
    			dbConnection = conector.ConectarBD();// abrir la conexion 
    			pst = dbConnection.prepareStatement(script); // abrir el buffer
    			
    			//parametrizar el campo
    		

    	       
    	        pst.setInt(1, placa);
    	        pst.setString(2, marca);
    	        pst.setInt(3, puestos);
    	        pst.setString(4, modelo);
    	        pst.setString(5, numeromotor);
    	        pst.setString(6, categoria);
    	        pst.setInt(7, idtipo);
    	        pst.setInt(8, matricula);
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
     
     public void read(int matricula, JTextField placa, JTextField marca, JTextField puestos, JTextField modelo, JTextField numeromotor, JTextField  categoria, JTextField idtipo) {
 		
 		Connection dbConnection = null;
 		PreparedStatement pst = null;
 		

 		String script = "SELECT * FROM  tblvehiculo WHERE matricula  = ?";
 		
 		try { 
 			
 		 dbConnection = conector.ConectarBD();// abrir la conexion 
 			pst = dbConnection.prepareStatement(script); // abrir el buffer
 		
 	       pst.setInt(1, matricula);
 	       ResultSet rs = pst.executeQuery();
 		 
 		
 		  while (rs.next()) {
 		   
 			 placa.setText(rs.getString(2));
 			marca.setText(rs.getString(3));
 			puestos.setText(rs.getString(4));
 			modelo.setText(rs.getString(5));  
 			numeromotor.setText(rs.getString(6));
 			categoria.setText(rs.getString(7));
 			idtipo.setText(rs.getString(8));
 			  
 			
 				
 		  }
 		      
 		  
 		 } catch (Exception e) {
 		 	
 		 	System.out.println(e.getMessage());

 		 }

 		 	 }
 		
}




