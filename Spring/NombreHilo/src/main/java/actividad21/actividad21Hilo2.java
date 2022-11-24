package actividad21;

public class actividad21Hilo2 extends Thread {
	public void run() {
		while(true) {
			System.out.println("TAC ");
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				System.out.println("Hilo interrumpido");
			}
		}
	}
}
