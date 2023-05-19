/**
 * Excepció que afloreix quan la llista és buida.
 * 
 * @author Sergi Serra, Yasmine Fadiss, Jessica Martinez, Arnau Vilalta, Iván Tovar, Pol Sanchez, Maximiliano Godoy
 * @version 1.0
 */
package main.java.com.heapsort.exceptions;

public class LlistaBuida extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LlistaBuida() {
        super("La lista és buida.");
    }
}
