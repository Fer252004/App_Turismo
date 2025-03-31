package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	
	public Connection ConectarBD() {
		
		Connection Connection = null;
		
		try { 
			
			// parametros para conectarme a una base de datos
			Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_turismo", "root",  "2556229");
			System.out.println("Conected with the base successfully");
			
			}

		catch (SQLException e) {	
		System.out.println("error while connecting to the base ");
		
}
	return Connection; 

}

	
}
