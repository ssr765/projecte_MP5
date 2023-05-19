/**
 * Excepció que afloreix quan la llista no és de tipus ArrayList.
 * 
 * @author Sergi Serra, Yasmine Fadiss, Jessica Martinez, Arnau Vilalta, Iván Tovar, Pol Sanchez, Maximiliano Godoy
 * @version 1.0
 */
package main.java.com.heapsort.exceptions;

public class NoEsLlista extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoEsLlista() {
        super("El valor passat no és una llista de tipus ArrayList.");
    }
}
