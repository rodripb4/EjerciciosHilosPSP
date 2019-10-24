package Ejemplo7;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorApplet  extends Applet implements Runnable, ActionListener{

	
	private Thread h;
	long CONTADOR=0;
	private boolean parar;
	private Font fuente;
	private Button b1,b2; //botones del Applet
	
	
	public void start() {
		
	}
	
	public void init() {
		setBackground(Color.yellow); //color de fondo
		add(b1=new Button("Iniciar contador"));
		b1.addActionListener(this);
		add(b2=new Button("Parar contador"));
		b2.addActionListener(this);
		fuente=new Font ("Verdana", Font.BOLD, 26); //tipo de letra
	}
	
	@Override
	public void run() {
		parar=false;
		Thread hiloActual = Thread.currentThread();
		while(h==hiloActual && !parar) {
			try {
				Thread.sleep(300);
				
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			repaint();
			CONTADOR++;
		}
		
	}
	
	public void paint(Graphics g) {
		g.clearRect(0,0, 400, 400);
		g.setFont(fuente);
		g.drawString(Long.toString((long)CONTADOR), 80, 100);
	}
	
	
	//para controlar que se pulsan los botones
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) { //pulso iniciar contador o continuar
			b1.setLabel("Continuar");
			if(h != null && h.isAlive()) {
		    //si el hilo esta corriendo no hago nada
			}else {
				//creo el hilo por primera vez y cunado finaliza el metodo run
				h= new Thread(this);
				h.start();
			}
		}else if(e.getSource()==b2) { //pulso parar contador
			parar=true; //para que finalice el while en el metodo run
		}
		
	}
	
	public void stop() {
		h=null;
	}

	

}
