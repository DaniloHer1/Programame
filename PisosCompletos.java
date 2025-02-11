package PC;

/**
*
* Es el ejercicio 540  de Acepta el reto
* @author Daniel Hernando
* @version 12/10/2024
*/
	public class PisosCompletos
	{
	static java.util.Scanner entrada;
	public static void main (String args[])
	{
		entrada = new java.util.Scanner(System.in);
		int numCasosDePrueba = entrada.nextInt();
		for (int i = 1; i <= numCasosDePrueba; i++) {
		casoDePrueba();
	}
	}
	private static void casoDePrueba()
	{
		int PisoVivo=entrada.nextInt();int CuantasEscalerasPorPiso=entrada.nextInt();int NumeroPisoCaeLlave=entrada.nextInt();int EscalonesAdicionales=entrada.nextInt();
		
				
		int EscalonesBajar=NumeroPisoCaeLlave*CuantasEscalerasPorPiso+EscalonesAdicionales;
		int EscalonesSubir=(CuantasEscalerasPorPiso*PisoVivo)+EscalonesBajar;
		
		 	System.out.println(EscalonesBajar+" "+EscalonesSubir);
			
				
	}
	}