package PC;

public class Zapping {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {
		int canalA = entrada.nextInt();
		int canalB = entrada.nextInt();

		if (canalA == 0 && canalB == 0) {
			return false;
		}

		if (canalA > canalB) {
			int aux = canalA;
			canalA = canalB;
			canalB = aux ;

		} 
		
		int resultado = canalA + (99 - canalB);
		int resultado1 = canalB - canalA;

		if (resultado > resultado1) {
			System.out.println(resultado1);
		} else {
			System.out.println(resultado);
		}

		return true;
	}
}