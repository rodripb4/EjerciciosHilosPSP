package Actividad10;

public class Main {

	public static void main(String[] args) {
		
		Cola c = new Cola();
		Productor p = new Productor (c, 1);
		Consumidor  con= new Consumidor(c, 1);
		Consumidor2 con2= new Consumidor2(c,2);
		p.start();
		con.start();
		con2.start();

	}

}
