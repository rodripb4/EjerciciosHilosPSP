package Tema3_Actividad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader lector=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca web o equipo para visualizar su información");
		String direccion=lector.readLine();
		
		
       InetAddress dir=null;
		
		System.out.println("=======================================");
		System.out.println("SALIDA PARA LOCALHOST: ");
		
		try {
			//LOCALHOST
			dir=InetAddress.getByName("localhost");
			pruebaMetodos(dir);
			
			//URL 
			
			System.out.println("=======================================");
			System.out.println("SALIDA PARA UNA URL: ");
			
			dir=InetAddress.getByName(direccion);
			pruebaMetodos(dir);
			
			//Array de tipo InetAddress con todas las direcciones IP
			//asignadas a la direccion que metamos por parametro
			System.out.println("\tDIRECCIONES IP PARA: "+dir.getHostName());
			
			InetAddress[] direcciones=InetAddress.getAllByName(dir.getHostName());
			
			for (int i = 0; i < direcciones.length; i++) {
				System.out.println("\t\t"+direcciones[i].toString());
			}
			System.out.println("==========================================");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}
	
	
	private static void pruebaMetodos(InetAddress dir) {
		System.out.println("\tMetodo getByName(): "+dir);
		
		InetAddress dir2;
		try {
			dir2=InetAddress.getLocalHost();
			System.out.println("\tMetodo getLocalHost(): "+dir2);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		//USAMOS METODOS DE LA CLASE
		System.out.println("\tMetodo getHostName(): "+dir.getHostName());
		System.out.println("\tMetodo getHostAddress(): "+dir.getHostAddress());
		System.out.println("\tMetodo toString(): "+dir.toString());
		System.out.println("\tMetodo getCanonicalHostName(): "+dir.getCanonicalHostName());
	}


}
