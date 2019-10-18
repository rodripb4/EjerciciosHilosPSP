package Ejemplo1;

public class NombreHilo extends Thread{

	private int x;
	NombreHilo (int x){
		this.x=x;
	}
	
	public void run() {
		for (int i=0; i<x; i++) {
			System.out.println("En el hilo... "+i);
		}
	}
}
