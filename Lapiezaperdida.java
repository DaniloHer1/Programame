package PC;

import java.util.Arrays;

public class Lapiezaperdida {

	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {

		int piezastotales = entrada.nextInt();
		
		if (piezastotales == 0) {
			return false;
		}
		
		int[] piezas = new int[piezastotales - 1];
		int minimo=0;

		for (int i = 0; i < piezas.length; i++) {
			piezas[i] = entrada.nextInt();
		}

		int SumaTotal = (int) (piezastotales * (1 + piezastotales) / (double) (2));
		int SumaAray = 0;

		for (int i = 0; i < piezas.length; i++) {
			SumaAray += piezas[i];

		}

		System.out.println(SumaTotal - SumaAray);

	
		

		return true;
	}
}
