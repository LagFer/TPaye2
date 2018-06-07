
public class Conexion {
	
	private DireccionIP placa; // IP DEL DISPOSITIVO
	private Dispositivo destino; // DISPOSITIVO AL QUE ESTA CONECTADO
	
	public Conexion() { //Conexion de dispositivo sin conexion a otro
		DireccionIP placa = new DireccionIP();
	}
	
	public Conexion(Dispositivo d) {
		DireccionIP placa = new DireccionIP();
		destino = d;
	}
}
