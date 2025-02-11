package PC;

public class Artropodos { // Asume fichero llamado solution.java

	static java.util.Scanner leer;

	public static void casoDePrueba() {

		int Artropodos = leer.nextInt();
		int Aracnidos = leer.nextInt();
		int Crustaceos = leer.nextInt();
		int Escalopendra = leer.nextInt();
		int AnilloEscalopendra = leer.nextInt();

		int Reslutado = (Artropodos * 6) + (Aracnidos * 8) + (Crustaceos * 10)
				+ (Escalopendra) * AnilloEscalopendra * 2;
		System.out.println(Reslutado);

	} // casoDePrueba

	public static void main(String[] args) {

		leer = new java.util.Scanner(System.in);

		int numCasos = leer.nextInt();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();
	} // main
} // class solution