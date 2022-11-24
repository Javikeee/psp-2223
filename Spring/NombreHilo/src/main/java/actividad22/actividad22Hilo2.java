package actividad22;

public class actividad22Hilo2 extends Thread implements Runnable{
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
