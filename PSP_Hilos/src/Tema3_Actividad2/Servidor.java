package Tema3_Actividad2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException {
		
		        //Creamos el servidor
				String host="localhost";
				//Los clientes se conectaran al puerto 6000
				int puerto=6000;
				ServerSocket servidor=new ServerSocket(puerto);
				
				System.out.println("Escuchando en puerto: "+servidor.getLocalPort());
				
				//Esperamos que se conecte un cliente. Hasta que no se conecte, el programa
				//no seguirá avanzando.
				System.out.println("Esperando primer cliente...");
				Socket cliente1=servidor.accept();
				InetAddress i1=cliente1.getInetAddress();
				//Cuando se conecte, veremos cual es su puerto.
				System.out.println("Puerto del cliente 1: "+cliente1.getPort());
				System.out.println("Puerto local: "+cliente1.getLocalPort());
				System.out.println("Nombre Host/IP: "+cliente1.getInetAddress());
				System.out.println("Host Remoto: "+i1.getHostName().toString());
				System.out.println("IP Host Remoto: "+i1.getHostAddress().toString());
				
				//Repetimos el proceso para el segundo cliente
				System.out.println("Esperando segundo cliente...");
				Socket cliente2=servidor.accept();
				InetAddress i2=cliente2.getInetAddress();
				System.out.println("Puerto del cliente 2: "+cliente2.getPort());
				System.out.println("Puerto local: "+cliente2.getLocalPort());
				System.out.println("Nombre Host/IP: "+cliente2.getInetAddress());
				System.out.println("Host Remoto: "+i2.getHostName().toString());
				System.out.println("IP Host Remoto: "+i2.getHostAddress().toString());
				System.out.println("Puerto del cliente 2: "+cliente2.getPort());
				servidor.close();

	}

}
