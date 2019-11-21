package Tema3_Actividad2;

import java.io.IOException;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) throws IOException {
		
		//Ponemos los parametros necesarios para conectarnos al puerto 6000 del localhost
				String host="localhost";
				int puerto=6000;
				System.out.println("Cliente 1");
				//Nos conectamos a ese puerto
				Socket cliente=new Socket(host,puerto);
				//Cerramos el socket
				cliente.close();
				
				//...e iniciamos un segundo cliente
				System.out.println("\nCliente 2");
				Socket cliente2=new Socket(host,puerto);
				//Cerramos el socket
				cliente2.close();

	}

}
