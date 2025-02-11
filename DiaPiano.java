
package PC;

/**
 * Nombre del ejercicio Es el ejercicio ??? de Acepta el reto
 * 
 * @author ???
 * @version dd.mm.aaaa
 */
public class DiaPiano {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		int numCasosDePrueba = entrada.nextInt();
		entrada.nextLine();
		for (int i = 1; i <= numCasosDePrueba; i++) {
			casoDePrueba();
		}
	}

	private static void casoDePrueba() {

		int Ano1 = entrada.nextInt();
		int Ano2 = entrada.nextInt();
		int NoBis = 0;
		int Bis = 0;

		for (int i = Ano1; i <= Ano2; i++) {

			if (i % 100 == 0 && i % 400 != 0) {
				NoBis++;
			} else if (i % 100 == 0 && i % 400 == 0 || i % 4 == 0) {
				Bis++;
			} else {
				NoBis++;
			}

		}
		System.out.println(NoBis+" "+Bis );
	

	}
}