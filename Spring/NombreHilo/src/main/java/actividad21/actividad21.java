package actividad21;

public class actividad21 {

	public static void main(String[] args) {
		Thread hilo1 = new actividad21Hilo1();
		Thread hilo2 = new actividad21Hilo2();
		hilo1.start();
		hilo2.start();
	}
	
}
