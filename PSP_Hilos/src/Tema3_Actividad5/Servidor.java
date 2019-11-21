package Tema3_Actividad5;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException {
		
		//En este caso, el servidor ira atendiendo clientes y diciendoles qué numero
				//de clientes son. Cuanto lleguen al maximo, cerrará.
				
				//En este caso, atenderá hasta tres conexiones.
				int numeroPuerto=6000;
				int nClientes=1;
				int maxConexiones=3;
				ServerSocket servidor=new ServerSocket(numeroPuerto);
				
				//Cuando se conecta un cliente...
				do {
					Socket clienteConectado=null;
					System.out.println("Esperando al cliente..."+nClientes);
					clienteConectado=servidor.accept();
					//Lo aceptamos y aumentamos el contador
					nClientes++;
					
					//Le mandamos un mensaje
					OutputStream salida=null;
					salida= clienteConectado.getOutputStream();
					DataOutputStream flujoSalida=new DataOutputStream(salida);
					
					//Diciendole en qué orden ha entrado
					flujoSalida.writeUTF("Eres el clientes nº "+nClientes);
					
					//Y cerramos los flujos
					salida.close();
					flujoSalida.close();
					clienteConectado.close();
				}while(nClientes!=maxConexiones); //Cuando hemos llegado al limite, continuamos

				//Informamos de a cuanto hemos atendido
				System.out.println("Se han atendido a "+nClientes);
				
				//Y cerramos
				servidor.close();

	}

}
