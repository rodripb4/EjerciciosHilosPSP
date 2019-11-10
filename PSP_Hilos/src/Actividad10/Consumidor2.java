package Actividad10;

public class Consumidor2 extends Thread {
	

	private Cola cola;
	private int  numero;
	
	public Consumidor2(Cola c, int n) {
		this.cola=c;
		this.numero=n;
		
	}
	
	public void run() {
		int valor=0;
		for(int i =0; i<5; i++) {
			valor= cola.get();
			try {
				sleep(190);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("    "+i+":   El consumidor "+numero+" ha condumido "+valor);
		}
	}

}
