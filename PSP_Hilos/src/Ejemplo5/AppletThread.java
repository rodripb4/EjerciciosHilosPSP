package Ejemplo5;

import java.applet.Applet;
import java.awt.Graphics;

public class AppletThread  extends Applet implements Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Thread hilo = null;
	
	public void init() {
		
	}
	
	public void start() {
		if(hilo==null) {
			//crea el hilo
			hilo= new Thread(this);
			hilo.start();//lanzamos el hilo
		}
	}
	
	@Override
	public void run() {
		Thread hiloActual = Thread.currentThread();
		while (hilo==hiloActual) {
			//Tarea repetitiva
		}
		
	}
	
	public void stop() {
		hilo=null;
	}
	
	public void paint(Graphics g) {
		
	}

}
