package Tema3_Actividad3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) throws IOException {
		
		//Nos conectaremos al puerto 6000 del localhost
				String host="localhost";
				int Puerto=6000;
				
				
				Socket Cliente=new Socket(host,Puerto);
				
				//Nos preparamos para recibir un mensaje
				DataInputStream flujoEntrada=new DataInputStream(Cliente.getInputStream());
				//Lo recibimos
				String msgRecibido=flujoEntrada.readUTF();
				
				
				//Ahora, pasamos el mensaje a minusculas y se lo devolvemos al servidor
				DataOutputStream flujoSalida=new DataOutputStream(Cliente.getOutputStream());
				flujoSalida.writeUTF(msgRecibido.toLowerCase());
				
				
				//Por ultimo, cerramos todos los flujos (y el cliente)
				flujoEntrada.close();
				flujoSalida.close();
				Cliente.close();

	}

}
