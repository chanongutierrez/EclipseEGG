package util;

public class Tablero {
	public static void obtenerCasilla(char columna, int fila) {
		char columna1 = Character.toUpperCase(columna);
		switch (columna1) {
		case 'A', 'C', 'E', 'G':
			if (fila % 2 == 0) {
				System.out.println("casilla blanca");
			} else {

				System.out.println("casilla negra");

			}
			break;
		case 'B', 'D', 'F', 'H':
			if (fila % 2 == 0) {
				System.out.println("casilla negra");
			} else {

				System.out.println("casilla blanca");

			}
			break;
		default:
			System.out.println("columna inexistente");
		}
	}
}
