package Actividad2;

public class TAC_V2 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<99999999; i++) {
			System.out.println("TAC");
			try {
				Thread.sleep(1100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
