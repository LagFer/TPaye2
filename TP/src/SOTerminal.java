
public class SOTerminal extends SistemaOperativo {

	public SOTerminal(String v) {
		super(v);
	}
	
	public void enviar(Paquete p, Conexion c, DireccionIP def) {
		boolean esta = false; //booleana que indica si la ip destino esta en la red del dispositivo
		buscarDestino(p.destino, c, d, esta); //procedimiento que busca el destino en la red del dispositivo (en variable d guarda el dispositivo buscado
		if (esta) {
			enviarPaq(p,d);
		} else {
			pRuteo pNew = new pRuteo(p); //se mete el paquete de servicio dentro de un paquete de ruteo
			enviarPaq(pNew, def); //se envia al default gateway el nuevo paquete de ruteo
		}
	}
	
	public void recibir(Paquete p, Conexion c) {
		buscarDestino(p.destino, c, d, esta)
	}
}
