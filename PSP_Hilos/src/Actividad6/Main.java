package Actividad6;

public class Main {

	public static void main(String[] args) {
		EjemploHiloPrioridad2 h1 = new EjemploHiloPrioridad2("Uno");
		EjemploHiloPrioridad2 h2 = new EjemploHiloPrioridad2("Dos");
		EjemploHiloPrioridad2 h3 = new EjemploHiloPrioridad2("Tres");
		EjemploHiloPrioridad2 h4 = new EjemploHiloPrioridad2("Cuatro");
		EjemploHiloPrioridad2 h5= new EjemploHiloPrioridad2("Cinco");
		
		//asignamos prioridad
		h1.setPriority(5);
		h2.setPriority(Thread.MIN_PRIORITY);
		h3.setPriority(2);
		h4.setPriority(Thread.NORM_PRIORITY);
		h5.setPriority(Thread.MAX_PRIORITY);
		
		
		//se ejecutan los hilos
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
	}

}
