package Tema3_Actividad4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException {
		//Abrimos el servidor, puerto 6000
		int numeroPuerto=6000;
		ServerSocket servidor=new ServerSocket(numeroPuerto);
		Socket clienteConectado=null;
		
		//Esperamos al cliente
		System.out.println("Esperando al cliente...");
		clienteConectado=servidor.accept();
		
		
		//Nos preparamos para recibir información del cliente
		InputStream entrada=null;
		entrada=clienteConectado.getInputStream();
		DataInputStream flujoEntrada=new DataInputStream(entrada);
		
		
		int cuadrado=flujoEntrada.read();
		
		//Elevamos el numero al cuadrado
		cuadrado=cuadrado*cuadrado;
		
		System.out.println("Recibiendo del CLIENTE:  \n\t"+cuadrado);
		
		//Y se lo devolvemos al cliente
		OutputStream salida=null;
		salida= clienteConectado.getOutputStream();
		DataOutputStream flujoSalida=new DataOutputStream(salida);
		
		flujoSalida.write(cuadrado);
		
		//Cerramos todos los flujos
		entrada.close();
		flujoEntrada.close();
		salida.close();
		flujoSalida.close();
		clienteConectado.close();
		servidor.close();

	}

}
