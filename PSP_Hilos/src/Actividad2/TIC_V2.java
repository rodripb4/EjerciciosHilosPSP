package Actividad2;

public class TIC_V2 implements Runnable{

	@Override
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
