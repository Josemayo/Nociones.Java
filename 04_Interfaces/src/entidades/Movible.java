package entidades;

/**
 * Interfaz que hace que los objetos se puedan mover. Segun cada objeto se moveran 
 * como corresponda
 * 
 * @author Jose 
 * @version 1.0
 * @since 24/04/2019
 *
 * 
 *
 */

public interface Movible {
	// no podemos declarar atributos, los atributos que declaremos son constantes
	int i=5; //es una constante
	// en una interface siempre son publicos y abstractos los metodos
	/**
	 * Este metodo hace que el objeto se mueva de la manera mas lenta posible
	 */
	public void moverseLento();
	/**
	 * Este metodo hace que el objeto se mueva de la manera mas rapida posible
	 */
	public void moverseRapido();
	/**
	 * Este metodo hace que el objeto se mueva una cantidad de metros 
	 * @param metros    - representa los metros que se movera el objeto
	 * @return  - representa la posicion donde esta el objeto
	 */
	public int moverse(int metros);
	

}
