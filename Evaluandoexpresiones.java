package pc;

import java.util.Stack;



/**

 * Nombre del ejercicio Es el ejercici 198 de Acepta el reto

 * ...

 * 

 * @author Daniel Hernando


 */

public class Evaluandoexpresiones {

	static java.util.Scanner entrada;



	public static void main(String args[]) {

		entrada = new java.util.Scanner(System.in);

		while (casoDePrueba()) {

		}

	}



	private static boolean casoDePrueba() {

		if (!entrada.hasNext())

			return false;



		String cadena = entrada.nextLine();



		char caracteres;



		int operador1, operador2;

		boolean escorrecto = true;

		int resultado = 0;



		Stack<Integer> pila = new Stack<>();

		for (int i = 0; i < cadena.length(); i++) {

			caracteres = cadena.charAt(i);

			if (caracteres == '+' || caracteres == '-' || caracteres == '*' || caracteres == '/') {

				operador1 = pila.pop();

				operador2 = pila.pop();



				resultado = operacion(operador2, operador1, caracteres);



			} else {

				pila.push(caracteres - '0');

			}



			if (caracteres == 0 && caracteres == '/') {

				escorrecto = false;

			}

		}

		System.out.println(resultado);

		System.out.println(pila);



		return true;

	}



	public static int operacion(int num1, int num2, char caracter) {

		

		int resultado = 0;

		if (caracter == '+') {

			resultado = num1 + num2;



		}

		if (caracter == '-') {

			resultado = num1 - num2;



		}

		if (caracter == '*') {

			resultado = num1 * num2;



		}

		if (caracter == '/') {

			resultado = num1 / num2;



		}

		return resultado;

	}

}