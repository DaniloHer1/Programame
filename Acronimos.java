package PC;


public class Acronimos {
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

		String frase = entrada.nextLine();

		String[] cadena = frase.split(" ");

		for (String cadenas : cadena) {

			for (int i = 0; i < cadenas.length(); i++) {
				
			
				char caracter = cadenas.charAt(0);
				

				if (Character.isUpperCase(caracter)) {

					System.out.print(caracter);
					break;

				}

			}

		}
		System.out.println("");

	}
}