package PC;

/**
 * Nombre del ejercicio Es el ejercicio ??? de Acepta el reto
 * 
 * @author ???
 * @version dd.mm.aaaa
 */
public class PatosCajon {
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

		int pato=entrada.nextInt();
		
		int patas=pato*2;
		
		System.out.println(pato+" "+patas);
	

	}
}