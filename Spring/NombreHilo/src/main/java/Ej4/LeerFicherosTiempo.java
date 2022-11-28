package Ej4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeerFicherosTiempo implements Runnable {

	static String[] nombreFicheros = new String[] { "F://2ºDAM/ACD/Eclipse/prueba1.txt",
			"F://2ºDAM/ACD/Eclipse/prueba2.txt", "F://2ºDAM/ACD/Eclipse/prueba3.txt" };
	
	static String fichero;
	
	public LeerFicherosTiempo(String fichero) {
		this.fichero=fichero;
	}
	
	public static void main(String[] args) {
		
		for(int i=0;i<nombreFicheros.length;i++) {
			LeerFicherosTiempo p = new LeerFicherosTiempo(nombreFicheros[i]);
			new Thread(p).start();
		}
		
	}

	private static void Proceso(String fichero) throws FileNotFoundException {
		
		File archivo = null;
		FileReader fr = new FileReader(fichero);
		int palabras=0;
		int caracteres = 0;
		try {
				archivo = new File(fichero);
				fr = new FileReader(archivo);
				while(caracteres != -1){
					caracteres = fr.read();
					if(caracteres == ' ') {
						palabras ++;
					}
				}
				System.out.println("Palabras: " + fr.read());
				fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		long t_comienzo, t_fin;
		t_comienzo = System.currentTimeMillis();
		try {
			Proceso(fichero);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t_fin = System.currentTimeMillis();
		long tiempototal = t_fin - t_comienzo;
		System.out.println("El proceso ha tardado: " + tiempototal);
	}

}
