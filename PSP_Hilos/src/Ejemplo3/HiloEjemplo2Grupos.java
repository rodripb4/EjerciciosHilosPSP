package Ejemplo3;

public class HiloEjemplo2Grupos extends Thread {

	public void run() {
		System.out.println("Información del hilo: "+Thread.currentThread().toString());
		
		for(int i=0; i<1000; i++) {
			i++;
			System.out.println(Thread.currentThread().getName()+
					"Finalizando la ejecución.");
		}
	}
	
}
