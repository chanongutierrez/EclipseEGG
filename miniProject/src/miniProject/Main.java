package miniProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		Boolean repetir = false;
		String cadena,primera,ultima;
		primera="x";
		ultima="o";
		String correcta = "&&&&&";
		int contador = 0;
		int otroContador = 0;

		do {
			System.out.println("ingrese una cadena");
			cadena = leer.nextLine();
			if (cadena.length() <= 6) {
				if (cadena.substring(0,1).equals(primera) && cadena.substring(4,5).equals(ultima)) {
					System.out.println("la cadena es correcta " + cadena);
					otroContador++;
				} else {
					System.out.println("la cadena es incorrecta " + cadena);
					contador++;
				}
				if (cadena.equals(correcta)) {
					repetir = true;
				}

			}

		} while (repetir == false);
		System.out.println("se han realizado " + otroContador + " lecturas correctas");
		System.out.println("se han realizado " + contador + " lecturas incorrectas");
		leer.close();
	}
}