package Ejemplo2;

public class HiloEjemplo1 extends Thread {
	
	public HiloEjemplo1(String nombre) {
		super(nombre);
		System.out.println("CREANDO HILO:"+getName());
	}
	
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Hilo:"+getName()+ " C = "+i);
		}
	}

}
