package Actividad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		MyHilo h=new MyHilo();
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		String comprobador="";
		h.start();
		System.out.println();
		do {
			
			comprobador=teclado.readLine();
			//Si escribimos 's' el hilo entra en espera 
			if(comprobador.equalsIgnoreCase("s"))
					h.Suspende();
			if(comprobador.equalsIgnoreCase("r"))
				//si escribamos 'r' lo reanudamos
				h.Reanuda();
			//escribimos '*' para finalizar la ejecucion
		} while (!comprobador.equalsIgnoreCase("*"));
			h.stop();
		
		
		

	}

}
