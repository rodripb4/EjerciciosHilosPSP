package Actividad1;

public class TIC extends Thread{

	public void run() {
		for(int i=0; i<99999999; i++) {
			System.out.println("TIC");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
