package Ej1;

public class PrimerHilo {

	private int x;

	PrimerHilo(int x) {
		this.x = x;
	}

	public void run() {
		for (int i = 0; i < x; i++) {
			System.out.println("En el Hilo... " + i);
		}
	}

	public static void main(String[] args) {
		PrimerHilo p = new PrimerHilo(10);
	}

}
