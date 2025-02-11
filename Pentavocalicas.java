package PC;


/**
	* Nombre del ejercicio
	* Es el ejercicio ??? de Acepta el reto
	* @author ???
	* @version dd.mm.aaaa
	*/
	public class Pentavocalicas
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
		
		String palabra=entrada.nextLine();
		
					
			if(palabra.contains("a") && palabra.contains("e")&& palabra.contains("i")&& palabra.contains("o")&& palabra.contains("u") ) {
				
				System.out.println("SI");
			}else 
			{
				System.out.println("NO");

			}
	
				
	}
	}