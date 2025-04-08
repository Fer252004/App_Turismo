package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Paquete {
	    
	   Conexion conector = new Conexion();
	
	
	public int iddestino ;
	public int idorigen ;
	public String precio ;
	public String fechaventa ;
	public String horaventa ;
	public String horasalida ;
	public String fechaejecucion ;
	public String observaciones ;
	public int idagencia ;
	public int matricula ;
	public int idpromotor ;
	public int idcliente ;
	public int idmedio ;
	public int codigo;
	
     public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	public int getIddestino() {
		return iddestino;
	}
	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}
	public int getIdorigen() {
		return idorigen;
	}
	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getFechaventa() {
		return fechaventa;
	}
	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}
	public String getHoraventa() {
		return horaventa;
	}
	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}
	public String getHorasalida() {
		return horasalida;
	}
	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}
	public String getFechaejecucion() {
		return fechaejecucion;
	}
	public void setFechaejecucion(String fechaejecucion) {
		this.fechaejecucion = fechaejecucion;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public int getIdagencia() {
		return idagencia;
	}
	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getIdpromotor() {
		return idpromotor;
	}
	public void setIdpromotor(int idpromotor) {
		this.idpromotor = idpromotor;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public int getIdmedio() {
		return idmedio;
	}
	public void setIdmedio(int idmedio) {
		this.idmedio = idmedio;
	}
	
	public void create( int iddestino, int idorigen, String precio, String fechaventa, String horaventa,  String horasalida, String fechaejecucion, String observaciones, int idagencia, int matricula, int idpromotor, int idcliente, int idmedio  ) {
		 Connection dbConnection = null;
	     PreparedStatement pst = null; 
	
	String scrip = "INSERT INTO tblpaquete ( iddestino, idorigen, precio, fechaventa, horaventa, horasalida, fechaejecucion, observaciones, idagencia, matricula, idpromotor, idcliente, idmedio ) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
	
	 try {
	    	dbConnection = conector.ConectarBD();
	        pst = dbConnection.prepareStatement(scrip);
	        

	        pst.setInt(1, iddestino);
	        pst.setInt(2, idorigen);
	        pst.setString(3, precio);
	        pst.setNString(4, fechaventa);
	        pst.setString(5, horaventa);
	        pst.setString(6, horasalida);
	        pst.setString(7, fechaejecucion);
	        pst.setString(8, observaciones);
	        pst.setInt(9, idagencia);
	        pst.setInt(10, matricula);
	        pst.setInt(11, idpromotor);
	        pst.setInt(12, idcliente);
	        pst.setInt(13, idmedio);
	        
	        pst.executeUpdate();
	        
	        
	        JOptionPane.showConfirmDialog(null, "Registro Con exito");
	        
		} catch (Exception e) {
			System.out.println("Error: " +e.getMessage());
			
	
		}
	}
	
public void delete ( int codigo) {
		
		
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx
		
		String script = "delete from tblpaquete where codigo  = ?";
		
		try {
			dbConnection = conector.ConectarBD();// abrir la conexion 
			pst = dbConnection.prepareStatement(script); // abrir el buffer
			
			//parametrizar el campo
			pst.setInt(1, codigo);
			
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
	
public void Update( int iddestino, int idorigen, String precio, String fechaventa, String horaventa,  String horasalida, String fechaejecucion, String observaciones, int idagencia, int matricula, int idpromotor, int idcliente, int idmedio, int codigo ) {
	
	
	Connection dbConnection = null;
	PreparedStatement pst = null;
	
	String script = "Update tblpaquete set  iddestino = ?, idorigen = ?, precio = ?, fechaventa = ?, horaventa = ?, horasalida = ?, fechaejecucion = ?, observaciones = ?, idagencia = ?, matricula = ?, idpromotor = ?, idcliente = ?, idmedio = ? WHERE codigo = ?;";
	
	try {
		dbConnection = conector.ConectarBD();// abrir la conexion 
		pst = dbConnection.prepareStatement(script); // abrir el buffer
		
		//parametrizar el campo
	
		   pst.setInt(1, iddestino);
	        pst.setInt(2, idorigen);
	        pst.setString(3, precio);
	        pst.setNString(4, fechaventa);
	        pst.setString(5, horaventa);
	        pst.setString(6, horasalida);
	        pst.setString(7, fechaejecucion);
	        pst.setString(8, observaciones);
	        pst.setInt(9, idagencia);
	        pst.setInt(10, matricula);
	        pst.setInt(11, idpromotor);
	        pst.setInt(12, idcliente);
	        pst.setInt(13, idmedio);
	        pst.setInt(14, codigo);
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

public void read(int codigo, JTextField iddestino, JTextField idorigen, JTextField precio, JTextField fechaventa, JTextField horaventa,  JTextField horasalida, JTextField fechaejecucion, JTextField observaciones, JTextField idagencia, JTextField matricula, JTextField idpromotor, JTextField idcliente, JTextField idmedio  ) {
	
	
	Connection dbConnection = null;
	PreparedStatement pst = null;
	

	String script = "SELECT * FROM  tblcliente WHERE idcliente  = ?";
	
	try { 
		
		dbConnection = conector.ConectarBD();// abrir la conexion 
		pst = dbConnection.prepareStatement(script); // abrir el buffer
	
       pst.setInt(1, codigo);
       ResultSet rs = pst.executeQuery();
	 
	
	  while (rs.next()) {
	   
		  
    
		  iddestino.setText(rs.getString(2));
		  idorigen.setText(rs.getString(3));
		  precio.setText(rs.getString(4));
		  fechaventa.setText(rs.getString(5));
		  horaventa.setText(rs.getString(6));
		  horasalida.setText(rs.getString(7));  
		  fechaejecucion.setText(rs.getString(8));
		  observaciones.setText(rs.getString(9));
		  idagencia.setText(rs.getString(10));
		  matricula.setText(rs.getString(11));
		  idpromotor.setText(rs.getString(12));
		  idcliente.setText(rs.getString(13));
		  idmedio.setText(rs.getString(14));
	  	 
	 

}


} catch (Exception e) {

System.out.println(e.getMessage());

}

}

}
