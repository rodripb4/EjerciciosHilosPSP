package Actividad10;

public class Productor extends Thread{

	private Cola cola;
	private int numero;
	
	public Productor(Cola c, int n) {
		this.cola=c;
		this.numero=n;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			cola.put(i);
			System.out.println(i+": El productor "+numero+" ha producido: "+i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}
}
