/**Realiza un programa que pida 6 números por teclado y nos diga cuál es el
máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
entero) el programa debe indicarlo y debe pedir de nuevo el número.

@author Rafael Infante
*/
package excepciones;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// variables
		int num = 6; // limite del arraylist
		int n = 0;
		int i;
		int max; // valor minimo

		// creo un array list donde almacenare los 6 numeros enteros
		ArrayList<Integer> numeros = new ArrayList<Integer>(num);

		// programa

		for (i = 0; i < num; i++) {

			boolean leido;
			do {
				try {
					System.out.println("Introduzca un numero: ");
					n = sc.nextInt();
					//sc.nextLine();
					leido = true;
				} catch (Exception e) {
					System.err.println("El valor introducido no es un numero.");
					/*
					 * ponemos nextLine ya que al introducir el numero entero y darle al enter el
					 * nextInt coje la \n, con esto lo que evitamos es un bucle infinito.
					 */
					sc.nextLine();
					leido = false;
				}
			} while (!leido);
			numeros.add(n);
		}

		// obtengo el primer valor del arralist para compararlo con los demas valores
		max = numeros.get(0);

		for (i = 0; i < num; i++) {
			if (max < numeros.get(i)) {
				max = numeros.get(i);
			}
		}

		System.out.println("El valor maximo es: " + max);

	}

}