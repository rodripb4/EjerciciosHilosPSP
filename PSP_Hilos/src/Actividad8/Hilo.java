package Actividad8;

public class Hilo extends Thread{
	private Saldo saldo;
	String nombre;

	public Hilo(String n, Saldo s) {
		setName(n);
		this.saldo=s;
	}
//llamamos al metodo añadir saldo y le añadiremos 10 por cada iteración 
	public void run() {
		for(int i=1; i<4; i++) {
			saldo.aniadirsaldo(getName(), 10);
		}
	}

}
