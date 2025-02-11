package PC;

/**
* Acuario
* Es el ejercicio 161 de Acepta el reto
* @author Daniel Hernando
* @version 12/10/2024
*/
	public class Acuario_191
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
		int NumeroDeCompartimentosAcuario=entrada.nextInt();
		int CapacidadDelMasGrande=entrada.nextInt();
		int DiferenciaLitrosEntreAdyacentes=entrada.nextInt();
		int Resta;
		int Suma=0;
		int RestaCapacidades=CapacidadDelMasGrande;
		
		for(int i = 1;i<NumeroDeCompartimentosAcuario;i++) {
			
			Resta=(RestaCapacidades-DiferenciaLitrosEntreAdyacentes);
			RestaCapacidades=Resta;
			Suma+=RestaCapacidades;

			}
			System.out.println(Suma+CapacidadDelMasGrande);

			
	}
	}