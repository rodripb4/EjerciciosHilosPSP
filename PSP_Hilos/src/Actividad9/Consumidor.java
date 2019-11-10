package Actividad9;

public class Consumidor extends Thread {


	private Cola cola;
	private int  numero;
	
	public Consumidor(Cola c, int n) {
		this.cola=c;
		this.numero=n;
		
	}
	
	public void run() {
		int valor=0;
		for(int i=0; i<5; i++) {
			valor= cola.get();
		
			System.out.println("El consumidor "+ numero +" ha condumido "+ valor);
		}
	}
}
