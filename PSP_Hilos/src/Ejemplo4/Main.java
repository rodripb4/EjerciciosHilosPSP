package Ejemplo4;

public class Main {

	public static void main(String[] args) {
		//Primer hilo
		PrimerHiloR hilo1 = new PrimerHiloR();
		new Thread(hilo1).start();
		
		//Segundo Hilo
		PrimerHiloR hilo2 = new PrimerHiloR();
		Thread hilo = new Thread(hilo2);
		hilo.start();
		
		//Tercer hilo
		new Thread(new PrimerHiloR()).start();
		
	}

}
