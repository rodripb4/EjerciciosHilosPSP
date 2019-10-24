package Ejemplo8;

public class MyHilo extends Thread{

	private long contador=0;
	private boolean parar=false;
	
	private SolicitaSuspender suspender= new SolicitaSuspender();
	
	
	//peticion de suspender hilo
	public void Suspende() {
		suspender.set(true);
	}
	
	//peticion de continuar
	public void Reanuda() {
		suspender.set(false);
	}

	
	public void run() {
		try {
			while(!parar) {
				contador++;
				sleep(1000);
				System.out.println(contador);
			    suspender.esperandoParaReanudar();
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hilo Finalizado");
	}
	
	public void start() {
		
	}
	
	
	
	
}
