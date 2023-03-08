package calculadora;

import java.io.*;

public class Calculator {
	static BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String args[]) throws IOException {
		int inicio = 0;
		menu(inicio);
	}

	public static void menu(int inicio) throws IOException, NumberFormatException {
		boolean lock;
		do {
			System.out.println("[1]. Calcular muro de ladrillo");
			System.out.println("[2]. Calcular viga de hormig�n");
			System.out.println("[3]. Calcular columnas de hormig�n");
			System.out.println("[4]. Calcular contrapisos");
			System.out.println("[5]. Calcular techo");
			System.out.println("[6]. Calcular pisos");
			System.out.println("[7]. Calcular pintura");
			System.out.println("[8]. Calcular iluminaci�n");
			System.out.println("[9]. Salir");
			try {
				inicio = Integer.parseInt(bufEntrada.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lock = false;
			switch (inicio) {
			case 1:
				Calculo.calcularmuro(inicio);
				menu(inicio);
				break;
			case 2:
				Calculo.calcularviga();
				menu(inicio);
				break;
			case 3:
				Calculo.calcularcolumna();
				menu(inicio);
				break;
			case 4:
				Calculo.calcularcontrapisos();
				menu(inicio);
				break;
			case 5:
				Calculo.calculartecho();
				menu(inicio);
				break;
			case 6:
				Calculo.calcularpisos();
				menu(inicio);
				break;
			case 7:
				Calculo.calcularpintura();
				menu(inicio);
				break;
			case 8:
				Calculo.calculariluminacion();
				menu(inicio);
				break;
			case 9:
				System.out.println("Gracias Por usar Nuestra App");
				break;
			}
			if (inicio>9 || inicio<=0) {
				lock = true;
				System.out.println("Ingresadste una opcion no valida");
				System.out.println("");
			}
		} while (lock==true);
	}

	
     
	

	
}

