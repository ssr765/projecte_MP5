package test.java.com.heapsort;

import main.java.com.heapsort.HeapSort;
import main.java.com.heapsort.exceptions.LlistaBuida;
import main.java.com.heapsort.exceptions.NoEsLlista;
import main.java.com.heapsort.exceptions.ValorsNoNumerics;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class HeapSortTest {

	@Test
	boolean fer_test(Integer[] llista, Integer[] llista_ordenada) throws NoEsLlista, ValorsNoNumerics, LlistaBuida {
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(llista));
		ArrayList<Integer> ar_ordenada = new ArrayList<>(Arrays.asList(llista_ordenada));
		HeapSort hs = new HeapSort(ar);
		hs.ordenar();
		
		// Bucle per comparar llistes.
		boolean igual = true;
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i) != ar_ordenada.get(i)) {
				igual = false;
			}
		}
		
		return igual;
	}

	@Test
	void ordenar1() throws NoEsLlista, ValorsNoNumerics, LlistaBuida {
		assertTrue(fer_test(new Integer[] {5, 1, 8, 13, 6}, new Integer[] {1, 5, 6, 8, 13}));
	}
	
	@Test
	void ordenar2() throws NoEsLlista, ValorsNoNumerics, LlistaBuida {
		assertTrue(fer_test(new Integer[] {4, 2, 8, 66, 6}, new Integer[] {2, 4, 6, 8, 66}));
	}
	
	@Test
	void ordenar3() throws NoEsLlista, ValorsNoNumerics, LlistaBuida {
		assertTrue(fer_test(new Integer[] {5, 1}, new Integer[] {1, 5}));
	}
	
	@Test
	void ordenar4() throws NoEsLlista, ValorsNoNumerics, LlistaBuida {
		assertTrue(fer_test(new Integer[] {3, 1, 6}, new Integer[] {1, 3, 6}));
	}
	
	@Test
	void ordenar5() throws NoEsLlista, ValorsNoNumerics, LlistaBuida {
		assertTrue(fer_test(new Integer[] {6, 10, 8, 13, 2}, new Integer[] {2, 6, 8, 10, 13}));
	}
	
	@Test
	void ordenar6() throws NoEsLlista, ValorsNoNumerics, LlistaBuida {
		assertTrue(fer_test(new Integer[] {5, 1, 8, -13, 6, 33}, new Integer[] {-13, 1, 5, 6, 8, 33}));
	}
	
	@Test
	void ordenar7() throws NoEsLlista, ValorsNoNumerics, LlistaBuida {
		assertTrue(fer_test(new Integer[] {7, 9, 88, 13, 63}, new Integer[] {7, 9, 13, 63, 88}));
	}
	
	@Test
	void ordenar8() throws NoEsLlista, ValorsNoNumerics, LlistaBuida {
		assertTrue(fer_test(new Integer[] {4, 8, 3, 13, 6}, new Integer[] {3, 4, 6, 8, 13}));
	}
	
	@Test
	void ordenar9() throws NoEsLlista, ValorsNoNumerics, LlistaBuida {
		assertTrue(fer_test(new Integer[] {46, 1, 8}, new Integer[] {1, 8, 46}));
	}
	
	@Test
	void ordenar10() throws NoEsLlista, ValorsNoNumerics, LlistaBuida {
		assertTrue(fer_test(new Integer[] {-5, 1, 8, 6}, new Integer[] {-5, 1, 6, 8}));
	}
}