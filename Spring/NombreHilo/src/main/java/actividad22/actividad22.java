package actividad22;

public class actividad22 {

	public static void main(String[] args) {
		Thread hilo1 = new actividad22Hilo1();
		Thread hilo2 = new actividad22Hilo2();
		new Thread(hilo1).start();
		new Thread(hilo2).start();
	}
	
}
