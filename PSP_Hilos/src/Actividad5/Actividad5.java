package Actividad5;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Actividad5 extends Applet implements ActionListener {

	class HiloContador extends Thread{
		long CONTADOR;
	    boolean parar;
		
		public HiloContador(long CONTADOR) {
			this.CONTADOR=CONTADOR;
		}
		
		public long getContador() {
			return CONTADOR;
		}
		
		//Metodo que contiene interrupt 
		public void interrumpir() {
			interrupt();
		}
		
		
		public void run() {
		
			//Vamos a usar el isInterrupted para finalizar el bucle ya que nos dara true cuando el hilo se interrumpa
			
			while(!isInterrupted()) {
				try {
					Thread.sleep(300);
					
				} catch (InterruptedException e) {
				
					e.printStackTrace();
					System.out.println("Se ha interrumpido el hilo");
					//Nos aseguramos de que el hilo se haya interrumpido
					Thread.currentThread().interrupt();
				}
				repaint();
				CONTADOR++;
				
			}
			System.out.println("Fin Hilo");
		}
	}
	
	
	private Font fuente;
	private Button b1,b2; //botones del Applet
	
	HiloContador h1 = new HiloContador(5);
	HiloContador h2 = new HiloContador(20);
	
	

	public void start() {
		h1.start();
		h2.start();
	}
	
	public void init() {
		setBackground(Color.yellow); //color de fondo
		add(b1=new Button("Finalizar Hilo 1"));
		b1.addActionListener(this);
		add(b2=new Button("Finalizar Hilo 2"));
		b2.addActionListener(this);
		fuente=new Font ("Verdana", Font.BOLD, 26); //tipo de letra
	}
	
	public void paint(Graphics g) {
		g.clearRect(0,0, 400, 400);
		g.setFont(fuente);
		g.drawString("Hilo 1:", 40, 100);
		g.drawString("Hilo 2:", 40, 150);
		g.drawString(Long.toString(h1.getContador()), 150, 100);
		g.drawString(Long.toString(h2.getContador()), 150, 150 );
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) { //pulso finalizar hilo 1
			b1.setLabel("Finalizado Hilo 1");
			
		    h1.interrumpir();
		}
		else if(e.getSource()==b2) { //pulso finalizar hilo 2
			b2.setLabel("Finalizado Hilo 2");
			//LLmamos al metodo que tiene dentro el metodo interrupt
			h2.interrumpir();
				
		}
	}
		
		public void stop() {
			h1=null;
			h2=null;
		}

}
