package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Cliente {
	
	Conexion conector = new Conexion();
	
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
	public int  idcliente;
	
	
	
	public int tipodocumento;  
	public int getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
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

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
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

public void Update( int  tipodocumento, int documento, String nombre, String apellidos, String eps, String alergias, String fechanacimiento, String correo, String estadocivil, String direccion, String telefonico, int idcliente ) {
	
	
	Connection dbConnection = null;
	PreparedStatement pst = null;
	
	String script = "Update tblcliente set  tipodocumento = ?, documento = ?, nombre = ?, apellidos = ?, eps = ?, alergias = ?, fechanacimiento = ?, correo = ?, estadocivil = ?, direccion = ?, telefonico = ? WHERE idcliente = ?;";
	
	try {
		dbConnection = conector.ConectarBD();// abrir la conexion 
		pst = dbConnection.prepareStatement(script); // abrir el buffer
		
		//parametrizar el campo
	
		    pst.setInt(1, tipodocumento);
	        pst.setInt( 2, documento);
	        pst.setString(3, nombre);
	        pst.setString(4, apellidos);
	        pst.setString(5, eps);
	        pst.setString(6, alergias);
	        pst.setString(7, fechanacimiento);
	        pst.setString(8, correo);
	        pst.setString(9, estadocivil);
	        pst.setString(10, direccion);
	        pst.setString(11, telefonico);
	        pst.setInt(12, idcliente);
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
	

public void read( int idcliente, JTextField tipodocumento, JTextField documentos , JTextField nombre , JTextField Apellidos, JTextField Eps, JTextField Alergias, JTextField fechanacimiento, JTextField Correo, JTextField Estadocivil, JTextField Direccion, JTextField telefonico ) {
	
	
	Connection dbConnection = null;
	PreparedStatement pst = null;
	

	String script = "SELECT * FROM  tblcliente WHERE idcliente  = ?";
	
	try { 
		
		dbConnection = conector.ConectarBD();// abrir la conexion 
		pst = dbConnection.prepareStatement(script); // abrir el buffer
	
       pst.setInt(1, idcliente);
       ResultSet rs = pst.executeQuery();
	 
	
	  while (rs.next()) {
	   
		  
    
		tipodocumento.setText(rs.getString(1));
		documentos.setText(rs.getString(2));
		nombre.setText(rs.getString(3));
		Apellidos.setText(rs.getString(4));
		Eps.setText(rs.getString(5));
		Alergias.setText(rs.getString(6));  
		fechanacimiento.setText(rs.getString(7));
		Correo.setText(rs.getString(8));
		Estadocivil.setText(rs.getString(9));
		Direccion.setText(rs.getString(10));
		telefonico.setText(rs.getString(11));
		
	  
	  	 
	 

}


} catch (Exception e) {

System.out.println(e.getMessage());

}

}
}  
	
	

