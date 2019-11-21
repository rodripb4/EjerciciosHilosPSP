package Tema3_Actividad5;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) throws IOException {
		
		
				String host="localhost";
				int Puerto=6000;
				
				System.out.println("PROGRAMA CLIENTE INICIADO...");
				Socket Cliente=new Socket(host,Puerto);

				//Y recibimos el mensaje del servidor, viendo en qué orden hemos entrado
				DataInputStream flujoEntrada=new DataInputStream(Cliente.getInputStream());
				String msgRecibido=flujoEntrada.readUTF();
				System.out.println("Recibiendo del SERVIDOR:  \n\t"+msgRecibido);
				
				//Para, posteriormente, cerrar
				flujoEntrada.close();
				Cliente.close();

	}

}
