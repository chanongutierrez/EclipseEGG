package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculo {

	static BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

	public static double calcularsuperficie(double altura, double largura) {
		double superficie;
		superficie = altura * largura;
		return superficie;
	}

	public static double calcularvolumen(double espesor, double superficie) {
		double volumen;
		volumen = superficie * (espesor * 0.01);
		return volumen;
	}

	public static void calcularmuro(int inicio) throws IOException {
		double altura;
		double largura;
		double superficie;
		System.out.println("seleciones el espesor del muro");
		System.out.println("[1] 30cm");
		System.out.println("[2] 20cm");
		try {
			inicio = Integer.parseInt(bufEntrada.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ingrese la altura del muro en M");
		altura = Double.parseDouble(bufEntrada.readLine());
		System.out.println("ingrese la largura del muro en M");
		largura = Double.parseDouble(bufEntrada.readLine());
		superficie = Calculo.calcularsuperficie(altura, largura);
		System.out.println("la superficie es de " + superficie + "M2");
		switch (inicio) {
		case 1:
			System.out.println(" vas a necesitar ");
			System.out.println("[1] " + 15.2 * superficie + "Kg de cemento");
			System.out.println("[2] " + 0.115 * superficie + "M2 de arena");
			System.out.println("[3] " + 120 * superficie + " ladrillos");
			System.out.println(" ");
			break;
		case 2:
			System.out.println(" vas a necesitar ");
			System.out.println("[1] " + 10.9 * superficie + "Kg de cemento");
			System.out.println("[2] " + 0.09 * superficie + "M2 de arena");
			System.out.println("[3] " + 90 * superficie + " ladrillos");
			System.out.println(" ");
			break;
		}
	}

	public static void calcularviga() throws IOException {
		double metro;
		System.out.println("Ingrese el largo de la viga");
		metro = Double.parseDouble(bufEntrada.readLine());
		System.out.println("La cantidad de materiales necesarios para una viga de " + metro + " metros: ");
		System.out.println("[1] De cemento: " + 9 * metro + " Kg ");
		System.out.println("[2] De arenna: " + 0.02 * metro + "M2 ");
		System.out.println("[3] De piedra: " + 0.02 * metro + "M2 ");
		System.out.println("[4] De hierro de 8: " + 4 * metro + "M ");
		System.out.println("[5] De hierro de 4: " + 3 * metro + "M ");
		System.out.println(" ");
	}

	public static void calcularcolumna() throws IOException {
		double largo;
		// Nos debe pedir el largo de la columna. Por metro lineal de columna se
		// necesitar�n: 7.5 kg de
		// cemento, 0.016 m3 de arena, 0.016 m2 de piedra, 6 m de hierro del 10 y 3 m de
		// hierro del 4.
		// Debemos mostrar al usuario la cantidad de materiales necesaria.
		System.out.println("ingrese el largo de la columna");
		largo = Double.parseDouble(bufEntrada.readLine());
		System.out.println("se necesitan ");
		System.out.println("[1] " + 7.5 * largo + "Kg de cemento");
		System.out.println("[2]" + 0.016 * largo + "M2 de arena");
		System.out.println("[3]" + 6 * largo + "M de hierro del 10");
		System.out.println("[4]" + 3 * largo + "M de hierro del 4");
		System.out.println("  ");
	}

	public static void calcularcontrapisos() throws IOException {
		double altura;
		double espesor;
		double largura;
		double superficie;
		System.out.println("Ingrese el espesor del contrapiso");
		espesor = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese el ancho de contrapiso");
		altura = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese el largo del contrapiso");
		largura = Double.parseDouble(bufEntrada.readLine());
		superficie = Calculo.calcularsuperficie(altura, largura);
		System.out.println("[1] Necesitaras " + Calculo.calcularvolumen(espesor, superficie) * 105 + "kg de Cemento");
		System.out.println("[2] Necesitaras " + Calculo.calcularvolumen(espesor, superficie) * 0.45 + "m3 de Arena");
		System.out.println("[3] Necesitaras " + Calculo.calcularvolumen(espesor, superficie) * 0.9 + "m3 de Piedra");
		System.out.println("");
		// Nos debe pedir espesor, ancho y largo del contrapiso a calcular.
		// Por metro c�bico de contrapiso se necesita: 105 kg de cemento, 0.45 m3 de
		// arena y 0.9 m3 de
		// piedra.
		// Debemos mostrar al usuario la cantidad de materiales necesaria.
	}

	public static void calculartecho() throws IOException {
		double ancho;
		double espesor;
		double largo;
		double superficie;
		System.out.println("ingrese el ancho del techo");
		ancho = Integer.parseInt(bufEntrada.readLine());
		System.out.println("ingrese el largo del techo");
		largo = Integer.parseInt(bufEntrada.readLine());
		System.out.println("ingrese la espesura del techo");
		espesor = Integer.parseInt(bufEntrada.readLine());
		superficie = Calculo.calcularsuperficie(largo, ancho);
		System.out.println("Necesitaras " + 33 * Calculo.calcularvolumen(espesor, superficie) + "kg cemento");
		System.out.println("Necesitaras " + 0.072 * Calculo.calcularvolumen(espesor, superficie) + "M� de arena");
		System.out.println("Necesitaras " + 7 * Calculo.calcularvolumen(espesor, superficie) + "M de arena");
		System.out.println("Necesitaras " + 4 * Calculo.calcularvolumen(espesor, superficie) + "M de arena");
		// Nos debe pedir espesor, ancho y largo del techo a calcular.
		// Por metro cuadrado de techo se necesita: 33 kg de cemento, 0.072 m3 de arena,
		// 0.072 m3 de
		// piedra, 7 m de hierro del 8 y 4 m de hierro del 6
		// Debemos mostrar al usuario la cantidad de materiales necesaria.
	}

	public static void calcularpisos() throws IOException {
		double ancho;
		double largo;
		double superficie;
		// Nos debe pedir ancho y largo del pa�o de piso a colocar. Teniendo esos datos
		// se debe calcular la
		// superficie y a�adirle un 10% extra por recortes
		// Mostrar el resultado en m2
		System.out.println("ingrese el ancho del piso");
		ancho = Double.parseDouble(bufEntrada.readLine());
		System.out.println("ingrese el largo del piso");
		largo = Double.parseDouble(bufEntrada.readLine());
		superficie = Calculo.calcularsuperficie(ancho, largo) * 1.1;
		System.out.println("necesitaras " + superficie + "M2");
	}

	public static void calcularpintura() throws IOException {
		double muro;
		System.out.println("Ingrese la superficie del muro");
		muro = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Necesitas " + muro / 6 + " de litros de pintura");
		System.out.println(" ");
	}

	public static void calculariluminacion() throws IOException {
		double habitacion;
		// Nos debe pedir la superficie de la habitaci�n. La iluminaci�n la calculamos
		// de la siguiente forma:
		// superficie * 0.20. Eso nos da la cantidad m�nima de superficie de iluminaci�n
		// natural (ventanas y
		// puertas de vidrio). Mostrar resultado
		System.out.println("Ingrese la superficie de la habitacion");
		habitacion = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Necesitas " + habitacion * 0.20 + " minima de superficie de iluminacion");
		System.out.println(" ");
	}

}
