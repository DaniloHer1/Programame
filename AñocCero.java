package PC;

/**
	* Nombre del ejercicio
	* Es el ejercicio ??? de Acepta el reto
	* @author ???
	* @version dd.mm.aaaa
	*/
	public class AñocCero
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
		
		int numero=entrada.nextInt();
		
		if(numero>=1) {
			System.out.println((numero-1));
		}else {
			System.out.println(numero);
		}
		
	}
	}