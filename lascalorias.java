/**

 * Nombre del ejercicio Es el ejercici 363 de Acepta el reto

 * ...

 * 

 * @author Daniel Hernando


 */

public class lascalorias {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {

	
		
		int calorias=entrada.nextInt();
		
		if (calorias == 0) {
			return false;
		}

		int numerocomidas = entrada.nextInt();
		int caloriastotal;
		double sumtotal = 0;
		int cont = 0;

		
		while (numerocomidas != cont){
			
			caloriastotal = entrada.nextInt();
			sumtotal+=caloriastotal;
			cont++;

		} 
					
						
		int resultado= (int) (Math.ceil(sumtotal/calorias)*calorias);
		
		System.out.println(resultado/calorias);

		return true;
	}
}
