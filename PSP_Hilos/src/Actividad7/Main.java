package Actividad7;

public class Main {

	public static void main(String[] args) {
		Contador cont= new Contador(0);
		HiloA a = new HiloA("Hilo1",cont);
		HiloA b= new HiloA("Hilo2", cont);
		HiloA c= new HiloA("Hilo3", cont);
		HiloA d= new HiloA("Hilo4", cont);
		
		
		
		HiloE e= new HiloE("Hilo5", cont);
		HiloE f= new HiloE("Hilo6", cont);
		
		a.start();
		b.start();
		c.start();
		d.start();
		//
		e.run();
		f.run();

	}

}
