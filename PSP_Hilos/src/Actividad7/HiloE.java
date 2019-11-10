package Actividad7;

public class HiloE implements Runnable{

	private Contador contador;
	private String name;
	
	public HiloE(String n, Contador c) {
		this.name=n;
		contador=c;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void run() {
		synchronized (contador) {
		for (int i = 0; i < 100; i++) {
			contador.incrementa();//incrementa el contador
		}
		
		System.out.println(getName() + " contador vale "+ contador.valor());
		}
	}
}
