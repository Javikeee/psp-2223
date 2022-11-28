package Ej1;

public class NombreHilo extends Thread {
	public void run() {
		NombreHilo h = new NombreHilo();
		h.start();
	}
}
