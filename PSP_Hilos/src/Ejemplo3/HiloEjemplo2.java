package Ejemplo3;

public class HiloEjemplo2 extends Thread {

	public void run() {
		Thread.currentThread();
		System.out.println(
				"Dentro del Hilo : "+Thread.currentThread().getName()+
				"\n\tPrioridad : "+Thread.currentThread().getPriority()+
				"\n\tID : "+Thread.currentThread().getId()+
				"\n\tHilos activos : "+Thread.activeCount());
	}
}
