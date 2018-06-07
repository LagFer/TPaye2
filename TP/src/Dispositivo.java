
public class Dispositivo { //Deberia ser abstracto?
	
	protected Conexion conexion;
	
	public Dispositivo() { //Dispositivo sin conexion a otro dispositivo (?)
		Conexion conexion = new Conexion();
	}
	
	public Dispositivo(Dispositivo disp) { //Dispositivo al cual se le pasa el dispositivo (Hub, router) al que está conectado (?)
		Conexion conexion = new Conexion(disp);
	}
	
	public void enviarPaquete() {
		
	}
	
	public void generarPaquete() {
		
	}
}
