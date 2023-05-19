/**
 * HeapSort implementat a Java.
 * 
 * @author Sergi Serra, Yasmine Fadiss, Jessica Martinez, Arnau Vilalta, Iván Tovar, Pol Sanchez, Maximiliano Godoy
 * @version 1.0
 */
package main.java.com.heapsort;

import java.util.ArrayList;

import main.java.com.heapsort.exceptions.LlistaBuida;
import main.java.com.heapsort.exceptions.NoEsLlista;
import main.java.com.heapsort.exceptions.ValorsNoNumerics;

/**
 * Representra el HeapSort que ordenarà la llista.
 * 
 * @author Sergi Serra, Yasmine Fadiss, Jessica Martinez, Arnau Vilalta, Iván Tovar, Pol Sanchez, Maximiliano Godoy
 */
public class HeapSort {
	private ArrayList<Integer> numeros;

	/**
	 * Crea una objecte HeapSort llest per ordenar la llista.
	 * 
	 * @param numeros Llista de números.
	 * @throws NoEsLlista Si el parametre passat no es una llista de tipus ArrayList.
	 * @throws ValorsNoNumerics Si la llista té valors no numérics.
	 * @throws LlistaBuida Si la llista es buida.
	 */
	public HeapSort(ArrayList<Integer> numeros) throws NoEsLlista, ValorsNoNumerics, LlistaBuida {
		// Comprovar que el valor passat sigui una llista.
		if (!(numeros instanceof ArrayList)) {
			throw new NoEsLlista();
		}

		// Comprovar que tots els valors de la llista siguin enters.
		for (Integer x : numeros) {
			if (!(x instanceof Integer)) {
				throw new ValorsNoNumerics();
			}
		}

		// Comprovar que la llista no estigui buida.
		if (numeros.isEmpty()) {
			throw new LlistaBuida();
		}

		this.numeros = numeros;
	}

	/**
	 * Ordena la llista.
	 */
	public void ordenar() {
		int n = numeros.size();

		// Trobar i pujar el número més gran.
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(numeros, n, i);
		}

		System.out.println("Fi del primer bucle.");
		System.out.println("El número més gran es " + numeros.get(0) + ".");

		// Pujar els nombres restants i ordenar-los.
		for (int i = n - 1; i >= 0; i--) {
			intercanvi(0, i);
			heapify(numeros, i, 0);
		}
	}

	/**
	 * 'heapify' és el métode cridat per 'ordenar' que fa la comparació
	 * del node passat per paràmetre i dels seus nodes inferiors (fills).
	 * 
	 * @param numeros Llista de números.
	 * @param num_nodes Nombre de nodes restants a l'arbre.
	 * @param node_actual Node a comparar.
	 */
	void heapify(ArrayList<Integer> numeros, int num_nodes, int node_actual) {
		// 
		int major = node_actual;
		int esquerra = 2 * node_actual + 1;
		int dreta = 2 * node_actual + 2;

		// En cas que hi hagi un node inferior a l'esquerra, comprovar si el node
		// esquerra és més petit que el node actual.
		if (esquerra < num_nodes && numeros.get(esquerra) > numeros.get(major)) {
			System.out.println("El node esquerra passa a ser el major.");
			major = esquerra;
		}

		// En cas que hi hagi un node inferior a la dreta, comprovar si el node major
		// és més petit que el node dreta.
		if (dreta < num_nodes && numeros.get(dreta) > numeros.get(major)) {
			System.out.println("El node dret passa a ser el major.");
			major = dreta;			
		}

		// Si el node_actual ha deixat de ser el més gran, es canvien i es
		// continua fent Heapify recursivament.
		if (major != node_actual) {
			System.out.println("Canviant el node per el número major.");
			intercanvi(node_actual, major);
			heapify(numeros, num_nodes, major);

		} else {
			System.out.println("El número major no ha canviat. No es fa res.");
		}

		System.out.println("Final del Heapify");
	}

	/**
	 * Fa un intercanvi entre dos índex de la llista.
	 * 
	 * @param x Primer índex.
	 * @param y Segon índex.
	 */
	void intercanvi(int x, int y) {
		int swap = numeros.get(x);
		numeros.set(x, numeros.get(y));
		numeros.set(y, swap);
	}

	/**
	 * Mostra la llista.
	 * 
	 * @param numeros Llista de números.
	 */
	static void mostra_llista(ArrayList<Integer> numeros) {
		for (int i = 0; i < numeros.size(); i++) {
			System.out.print(numeros.get(i) + " ");
		}
		System.out.println();
	}
}
