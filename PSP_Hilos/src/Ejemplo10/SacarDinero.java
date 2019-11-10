package Ejemplo10;

public class SacarDinero extends Thread{

	private Cuenta c;
	String nom;
	
	public SacarDinero(String n, Cuenta c) {
		super(n);
		this.c=c;
	}
	
	
	public void run() {
		for (int i = 0; i < 4; i++) {
			c.Retirardinero(10, getName());
		}
	}
	
}
