public class Fractal {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {
		if (!entrada.hasNext())
			return false;

		int lado = entrada.nextInt();
		
		int cuadrados = 1;
		int longitudtotal =0;

		while (lado >= 1) {
			
			longitudtotal += cuadrados*4*lado;

			lado = lado / 2;
			
			cuadrados *= 4 ;
					
			

		}
		
		System.out.println(longitudtotal);

		return true;
	}
}
