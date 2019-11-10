package Actividad9;

public class Main {

	public static void main(String[] args) {
	
		Cola c = new Cola();
		Productor p = new Productor (c, 1);
		Consumidor  con= new Consumidor(c, 2);
		
		p.start();
		con.start();

	}

}
