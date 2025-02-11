package PC;


public class AreaRec {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {
		int x = entrada.nextInt();
		int y = entrada.nextInt();
		int x1 = entrada.nextInt();
		int y1 = entrada.nextInt();
		
		if (x > x1 || y > y1) {
			return false;
		}

		int ancho = x1 - x;
		int largo = y1 - y;

		int resultado = ancho * largo;

		System.out.println(resultado);

		return true;
	}
}