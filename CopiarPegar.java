package PC;

/**
	* Nombre del ejercicio
	* Es el ejercicio ??? de Acepta el reto
	* @author ???
	* @version dd.mm.aaaa
	*/
	public class CopiarPegar
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
		int frases=1;
		int resultado=0;
		
		while(frases<numero) {
			
			frases= frases*2;
			resultado++;
			}
		System.out.println(resultado);
		}
		
		
	}
	