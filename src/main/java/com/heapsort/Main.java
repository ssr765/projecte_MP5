/**
 * Script pel tema 2 del projecte, fet pel grup 4.
 * 
 * @author Sergi Serra, Yasmine Fadiss, Jessica Martinez, Arnau Vilalta, Iván Tovar, Pol Sanchez, Maximiliano Godoy.
 * @version 1.0
 */
package main.java.com.heapsort;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.heapsort.exceptions.LlistaBuida;
import main.java.com.heapsort.exceptions.NoEsLlista;
import main.java.com.heapsort.exceptions.ValorsNoNumerics;

/**
 * Classe principal del projecte.
 * 
 * @author Sergi Serra, Yasmine Fadiss, Jessica Martinez, Arnau Vilalta, Iván Tovar, Pol Sanchez, Maximiliano Godoy.
 */
public class Main {
	/**
	 * Demana els números a l'usuari i verifica que siguin números enters
	 * correctes.
	 * 
	 * @return La llista ArrayList amb els números.
	 */
	public static ArrayList<Integer> demanar_numeros() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		// Bucle per demanar números.
		boolean sortir = false;
		while (!sortir) {
			// Demanar el número i comprovar si es vol sortir.
			System.out.print("Introdueix un número ('sortir' per sortir): ");
			String input = sc.nextLine();

			if (input.equals("sortir")) {
				sortir = true;

			} else {
				try {
					// Afegir el número a la llista.
					int numero = Integer.parseInt(input);
					numeros.add(numero);

				} catch (NumberFormatException e) {
					// Informar del error.
					System.out.println("Introdueix un número enter vàlid.");
				}
			}
		}

		sc.close();

		return numeros;
	}

	/**
	 * Métode principal del projecte.
	 * 
	 * @param args
	 * @throws NoEsLlista Si el paràmetre passat no és una llista de tipus ArrayList.
	 * @throws ValorsNoNumerics Si la llista té valors no numérics.
	 * @throws LlistaBuida Si la llista és buida.
	 */
	public static void main(String args[]) throws NoEsLlista, ValorsNoNumerics, LlistaBuida {
		// Crear la llista.
		ArrayList<Integer> numeros = demanar_numeros();
		System.out.println("La llista desordenada es: ");
		HeapSort.mostra_llista(numeros);	// Métode static, no fa falta haver declarat un HeapSort.

		// Creació del HeapSort.
		HeapSort hs = new HeapSort(numeros);
		
		// Ordenar la llista.
		hs.ordenar();

		System.out.println("La llista ordenada és: ");
		HeapSort.mostra_llista(numeros);
	}
}
