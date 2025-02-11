package PC;

/**
 * Nombre del ejercicio Es el ejercicio ??? de Acepta el reto
 * 
 * @author ???
 * @version dd.mm.aaaa
 */
public class Factorial {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		int numCasosDePrueba = entrada.nextInt();
		for (int i = 1; i <= numCasosDePrueba; i++) {
			casoDePrueba();
		}
	}

	private static void casoDePrueba() {

		int numero = entrada.nextInt();
		int resultado=0;
		
		if (numero>=5) {
		
			System.out.println(0);
				
		}else {
          resultado = 1;
			for (int i = 1; i <= numero; i++) {

				resultado = resultado * i;
			}
			System.out.println(resultado%10);
		}
		
	}
		
		}