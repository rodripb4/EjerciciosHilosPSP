package Actividad9;

public class Cola {

	private int numero;

	private boolean disponible =false;

	public int get() {
		if(disponible) {
			disponible=false;
			return numero;
		}
		return -1;
	}

	public void insertar(int valor) {
		this.numero=valor;
		this.disponible=true;
	}
	
}
