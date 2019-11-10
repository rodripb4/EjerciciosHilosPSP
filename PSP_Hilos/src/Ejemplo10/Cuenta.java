package Ejemplo10;

public class Cuenta {
	
	private int saldo;
	
	Cuenta(int s){
		saldo=s;
	}
	
	int getSaldo() {
		return saldo;
	}

	void restar(int cantidad) {
		saldo=saldo-cantidad;
	}
	
	
	synchronized void Retirardinero(int cant, String nom) {
		if(getSaldo()>=cant) {
			System.out.println(nom+ " : se va a retirar saldo (actual es: "+getSaldo()+ ")");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			restar(cant);
			
			System.out.println("\t"+ nom+ " retira => "+cant+" actual("+getSaldo()+")" );
			
		}else {
			System.out.println(nom+ " No puede retirar dinero, NO HAY SALDO ("+ getSaldo()+")");
		}
		
		if(getSaldo()<0) {
			System.out.println("Saldo negativo => "+getSaldo());
		}
	}
}
