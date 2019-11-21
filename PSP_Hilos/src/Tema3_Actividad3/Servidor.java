package Tema3_Actividad3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException {
		
		//Creamos el servidor
				int numeroPuerto=6000;
				ServerSocket servidor=new ServerSocket(numeroPuerto);
				Socket clienteConectado=null;
				//Y esperamos la conexión de un cliente
				System.out.println("Esperando al cliente...");
				clienteConectado=servidor.accept();
				
				//Preparamos un mensaje de texto que le enviamos al cliente desde el servidor
				OutputStream salida=null;
				salida= clienteConectado.getOutputStream();
				DataOutputStream flujoSalida=new DataOutputStream(salida);
				
				//Lo enviamos.
				flujoSalida.writeUTF("ESTO DEBERIA DE SALIR EN MUSCULA");
				
				//Ahora, preparamos la llegada de un mensaje de la parte del cliente
				InputStream entrada=null;
				entrada=clienteConectado.getInputStream();
				DataInputStream flujoEntrada=new DataInputStream(entrada);
				
				//Recibimos el mensaje. Si todo es correcto, recibiremos el mensaje anterior en 
				//minusculas
				System.out.println("Recibiendo del CLIENTE:  \n\t"+flujoEntrada.readUTF());
				
				//Y cerramos los distintos flujos en este orden específico.
				//Cerrando, por ultimo, el servidor
				entrada.close();
				flujoEntrada.close();
				salida.close();
				flujoSalida.close();
				clienteConectado.close();
				servidor.close();
	}

}
