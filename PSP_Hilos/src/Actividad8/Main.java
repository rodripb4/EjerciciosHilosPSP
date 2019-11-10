package Actividad8;

public class Main {

	public static void main(String[] args) {
		
		Saldo s = new Saldo(100);
		System.out.println("SALDO INICIAL"+s.getSaldo());

		Hilo h1 = new Hilo("Hilo1",s);

		Hilo h2 = new Hilo("Hilo2",s);

		Hilo h3 = new Hilo("Hilo3",s);
		Hilo h4 = new Hilo("Hilo4",s);

		h1.start();
		h2.start();
		h3.start();
		h4.start();

	}

}
