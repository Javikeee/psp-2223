package actividad21;

public class actividad21Hilo1 extends Thread {

	public void run() {
		while(true) {
			System.out.println("TIC ");
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				System.out.println("Hilo interrumpido");
			}
		}
	}
}
