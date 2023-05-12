/**
 * Excepció que afloreix quan hi ha algún valor no numèric a la llista.
 * 
 * @author Sergi Serra, Yasmine Fadiss, Jessica Martinez, Arnau Vilalta, Iván Tovar, Pol Sanchez, Maximiliano Godoy
 * @version 1.0
 */
package main.java.com.heapsort.exceptions;

public class ValorsNoNumerics extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValorsNoNumerics() {
        super("La llista conté valors que no són numèrics.");
    }
}
