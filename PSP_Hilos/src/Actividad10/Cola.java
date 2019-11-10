package Actividad10;

public class Cola {
	
	private int numero;

	private boolean disponible =false;

	public synchronized int get() {
		while(!disponible) {
			try {
				wait();
			}catch(InterruptedException ex) {
				
			}
		
			
		}
		
		disponible=false;
		notify();
		return numero;
	}

	public synchronized void put(int valor) {
		while(disponible) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.numero=valor;
		this.disponible=true;
		notify();
	}

}
