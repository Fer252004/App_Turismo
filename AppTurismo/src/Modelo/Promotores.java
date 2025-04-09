package Modelo;

import java.security.Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;
import view.JPrincipal;




public class Promotores {

	  Conexion Connection = new Conexion();
	 Conexion conector = new Conexion();
	 
	public int idpromotor =0;
	public String nombre = "";
	public String apellido = "";
	public int tipodocumento =0;
	public int documento =0;
	public String direccion = "";
	public String correopersonal = "";
	public String correocorp  = "";
	public String fechanacimiento = "";
	public String telefono = "";
	public int codigo =0;
	public String Contraseña;
	
	JPrincipal Principal = new JPrincipal();
			
	public int getIdpromotor() {
		return idpromotor;
	}
	public void setIdpromotor(int idpromotor) {
		this.idpromotor = idpromotor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreopersonal() {
		return correopersonal;
	}
	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}
	public String getCorreocorp() {
		return correocorp;
	}
	public void setCorreocorp(String correocorp) {
		this.correocorp = correocorp;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void create( String nombre, String apellido, int tipodocumento, int documento, String direccion, String correopersonal, String correocorp, String fechanacimiento, String telefono, int codigo  ) {
		 Connection dbConnection = null;
	     PreparedStatement pst = null; 
	
	String scrip = "INSERT INTO tblpromotores ( nombre, apellido, tipodocumento, documento, direccion, correopersonal, correocorp, fechanacimiento, telefono, codigo ) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
	
	 try {
	    	dbConnection = conector.ConectarBD();
	        pst = dbConnection.prepareStatement(scrip);
	        

	        pst.setString(1, nombre);
	        pst.setString(2, apellido);
	        pst.setInt(3, tipodocumento);
	        pst.setInt (4, documento);
	        pst.setString(5, direccion);
	        pst.setString(6, correopersonal);
	        pst.setString(7, correocorp);
	        pst.setString(8, fechanacimiento);
	        pst.setString(9, telefono);
	        pst.setInt(10, codigo);
	        
	        pst.executeUpdate();
	        
	        
	        JOptionPane.showConfirmDialog(null, "Registro Con exito");
	        
		} catch (Exception e) {
			System.out.println("Error: " +e.getMessage());
			
	
		}
	}
	
public void delete ( int idpromotor) {
		
		
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx
		
		String script = "delete from tblpromotores where idpromotor  = ?";
		
		try {
			dbConnection = conector.ConectarBD();// abrir la conexion 
			pst = dbConnection.prepareStatement(script); // abrir el buffer
			
			//parametrizar el campo
			pst.setInt(1, idpromotor);
			
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

public void Update(  String nombre, String apellido, int tipodocumento, int documento, String direccion, String correopersonal, String correocorp, String fechanacimiento, String telefono, int codigo, int idpromotor  ) {
	
	
	Connection dbConnection = null;
	PreparedStatement pst = null;
	
	String script = "Update tblpromotores set  nombre = ?, apellido = ?, tipodocumento = ?, documento = ?, direccion = ?, correopersonal = ?, correocorp = ?, fechanacimiento = ?,  telefono = ?, codigo = ? WHERE idpromotor = ?;";
	
	try {
		dbConnection = conector.ConectarBD();// abrir la conexion 
		pst = dbConnection.prepareStatement(script); // abrir el buffer
		
		//parametrizar el campo
	
		 pst.setString(1, nombre);
	        pst.setString(2, apellido);
	        pst.setInt(3, tipodocumento);
	        pst.setInt (4, documento);
	        pst.setString(5, direccion);
	        pst.setString(6, correopersonal);
	        pst.setString(7, correocorp);
	        pst.setString(8, fechanacimiento);
	        pst.setString(9, telefono);
	        pst.setInt(10, codigo);
	        pst.setInt(11, idpromotor);
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


  public void read(int idpromotor, JTextField nombre, JTextField apellido, JTextField tipodocumento, JTextField documento, JTextField direccion, JTextField correopersonal, JTextField correocorp, JTextField fechanacimiento,  JTextField telefono, JTextField codigo) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		

		String script = "SELECT * FROM  tblpromotores WHERE idpromotor  = ?";
		
		try { 
			
		 dbConnection = conector.ConectarBD();// abrir la conexion 
			pst = dbConnection.prepareStatement(script); // abrir el buffer
		
	       pst.setInt(1, idpromotor);
	       ResultSet rs = pst.executeQuery();
		 
		
		  while (rs.next()) {
		   
			  nombre.setText(rs.getString(2));
			  apellido.setText(rs.getString(3));
			  tipodocumento.setText(rs.getString(4));
			  documento.setText(rs.getString(5));  
			  direccion.setText(rs.getString(6));
			  correopersonal.setText(rs.getString(7));
			  correocorp.setText(rs.getString(8));
			  fechanacimiento.setText(rs.getString(9));
			  telefono.setText(rs.getString(10));
			  codigo.setText(rs.getString(11));
			 
			 


				
		  }
		      
		  
		 } catch (Exception e) {
		 	
		 	System.out.println(e.getMessage());

		 }

  }
  



  
  public void ControlDeAcesso(int documento, String Contraseña) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		

		String script = "SELECT * FROM  tblpromotores WHERE documento = ? and Contraseña = ?";
		
		                          
				
			try { 
				
				dbConnection = conector.ConectarBD();
			   pst = dbConnection.prepareStatement(script);
			   pst.setInt(1, documento);
			   pst.setString(2, Contraseña);
				ResultSet resultSet = pst.executeQuery();
			if (resultSet.next()) {
				
				Principal.setVisible(true);
				JOptionPane.showMessageDialog(null, "Acesso permitido");
			}
			
			else {
              JOptionPane.showMessageDialog(null, "Datos incorrecto O Se te a olvidado llenar un campo");
			}
			
			}catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
  }
			}
		
		
  
  
