package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

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
}
