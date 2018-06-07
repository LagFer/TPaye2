
public class Router extends Dispositivo implements iDispositivoGenerador {
	
	private SistemaOperativo so; // SISTEMA OPERATIVO DEL DISPOSITIVO
	
	public Router(String nomSO, String verSO) {
		super();
		SistemaOperativo so = new SistemaOperativo(nomSO, verSO);
	}
	
	@Override
	public void enviarPaquete() {
		so.enviar();
	}
	
	@Override
	public void generarPaquete() {
		
	}
	
}
