	package PC;
	
	/**
	* Nombre del ejercicio
	* Es el ejercicio ??? de Acepta el reto
	* @author ???
	* @version dd.mm.aaaa
	*/
	public class Cerillas
	{
		static java.util.Scanner leer;
		public static void main (String args[])
		{
			leer = new java.util.Scanner(System.in);
			int numCasosDePrueba = leer.nextInt();
			for (int i = 1; i <= numCasosDePrueba; i++) {
			casoDePrueba();
			}
		}
		private static void casoDePrueba()
		{
			int NumAlto=leer.nextInt();
			int NumAncho=leer.nextInt();
			
		    int resultado =  ((NumAlto + 1) * NumAncho) + (NumAncho + 1) * NumAlto;
			
			
			
			
				
			System.out.println(resultado);
			}
	}