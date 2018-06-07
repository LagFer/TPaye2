import java.util.ArrayList;
import java.util.List;

public class Hub extends Dispositivo {
	
	private static int puertos;
	
	Conexion[] conexiones = new Conexion[puertos]; // LISTA DE DISPOSITIVOS CONECTADOS A LA RED FISICA
	
	public void agregarConexion() { 
		
	}
	
	public void quitarConexion() { //quitar dispositivo de la lista de conexiones (?)
		
	}
	
	
}
