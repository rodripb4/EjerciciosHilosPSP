package Actividad8;

public class Saldo {


	int saldo;
	
	public Saldo(int c) {
		this.saldo=c;
	}
    //metodo para devolver la cantidad de saldo disponible
	public int getSaldo() {
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return saldo;
	}

	
	public void setSaldo(int s) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.saldo =  saldo+s;
	}
	
	
	//metodo para añadir una cantidad a el saldo total 
	//primero mostramos la cantidad que se dispone antes de hacer el ingreso y al final la cantidad con el ingreso
	
	public synchronized void aniadirsaldo(String n, int c) {
		System.out.println("Su saldo actual en la cuenta es de "+this.getSaldo());
		System.out.println(n+" va a realizar un ingreso de "+c+"€");
		this.setSaldo(c);
	
		
		System.out.println(n+" Dispone en la cuenta de "+this.getSaldo());
	}
	
}
