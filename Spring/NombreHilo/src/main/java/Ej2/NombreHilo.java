package Ej2;

public class NombreHilo implements Runnable{
	public void run() {
		NombreHilo h = new NombreHilo();
		new Thread(h).start();
	}
}
