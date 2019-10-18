package Actividad2;



public class Main {

	public static void main(String[] args) {
		TIC_V2 hilo1 = new TIC_V2();
		new Thread(hilo1).start();

		TAC_V2 hilo2 = new TAC_V2();
		new Thread(hilo2).start();
	}

}
