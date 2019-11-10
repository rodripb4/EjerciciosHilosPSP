package Actividad7;

public class HiloA extends Thread{

	private Contador contador;
	
	public HiloA(String n, Contador c) {
		setName(n);
		contador=c;
	}
	
	public void run() {
		synchronized (contador) {
		for (int i = 0; i < 5000; i++) {
			contador.incrementa();//incrementa el contador
		}
		
		System.out.println(getName() + " contador vale "+ contador.valor());
		}
	}
}
