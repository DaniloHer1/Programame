package PC;

/**
	* Nombre del ejercicio
	* Es el ejercicio ??? de Acepta el reto
	* @author ???
	* @version dd.mm.aaaa
	*/
	public class LaFiesta
	{
	static java.util.Scanner entrada;
	public static void main (String args[])
	{
		entrada = new java.util.Scanner(System.in);
		int numCasosDePrueba = entrada.nextInt();
		entrada.nextLine();
		for (int i = 1; i <= numCasosDePrueba; i++) {
		casoDePrueba();
	}
	}
	private static void casoDePrueba()
	{
		
		String Frase=entrada.nextLine();
		String Palabra=Frase.substring(4); 
		System.out.println("Hola, "+Palabra+".");
	}
	}