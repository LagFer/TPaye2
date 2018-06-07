
public class SistemaOperativo implements iSistemaOperativo  {
	
	protected String nombre; // NOMBRE SISTEMA OPERATIVO
	protected String version; // VERSION SISTEMA OPERATIVO
	// IP O NO? 
	
	public SistemaOperativo(String v) {
		version = v;
	}
	
	public  void enviar(Paquete p, Conexion c) {
		
	}
	
/*	los paquetes de servicios los crea el OS? en caso contrario borrar
	public void who() {
		
	}
	
	public void ICMPRequest() {
		
	}
	
	public void ICMPResponse() {
		
	}
	
	public void SendMessage() { //Crea el paquete de servicio SendMessage
		Servicio servicio = new Servicio("SendMessage");
		Paquete paquete = new pServicio(servicio);
	}
*/
}
