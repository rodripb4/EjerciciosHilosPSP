package Actividad8;

public class Hilo extends Thread{
	private Saldo saldo;
	String nombre;

	public Hilo(String n, Saldo s) {
		setName(n);
		this.saldo=s;
	}
//llamamos al metodo a�adir saldo y le a�adiremos 10 por cada iteraci�n 
	public void run() {
		for(int i=1; i<4; i++) {
			saldo.aniadirsaldo(getName(), 10);
		}
	}

}
