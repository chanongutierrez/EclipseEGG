package calculadora;

public  class Calculo{
	
	public static double calcularsuperficie(double altura, double largura) {
		double superficie;
		superficie = altura*largura;
		return superficie;
	}

	public static double calcularvolumen(double espesor, double superficie) {
		double volumen;
		volumen = superficie*(espesor*0.01);
		return volumen;
	}
	
}
