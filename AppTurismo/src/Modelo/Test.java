package Modelo;
import javax.swing.JOptionPane;
import Controlador.Conexion;

public class Test {

	public static void main(String[] args) {
		Conexion Test  = new Conexion();
		
		if(Test.ConectarBD() !=null) {
			
			JOptionPane.showConfirmDialog(null, "Conectado a la BD");
			
			
		}
		else {
			
			JOptionPane.showConfirmDialog(null, "No Conectado a la BD");
	}

}

}

