
public class Terminal extends Dispositivo implements iDispositivoGenerador {
	
	
	private SistemaOperativo so; // SISTEMA OPERATIVO DEL DISPOSITIVO
	private DireccionIP defGat;
	
	public Terminal(String nomSO,String verSO) {
		super();
		SistemaOperativo so = new SistemaOperativo(verSO);
	}
	
	@Override
	public void generarPaquete() {
		
	}
	
	public void enviarPaquete() {
		so.enviar(p, this.conexion, defGat);
	}
	
	public void recibirPaquete(Paquete p) {
		so.recibir(p, this.conexion);
	}
}
