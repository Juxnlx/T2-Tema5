package examenmandos;

/**
 * Esta interfaz crean los metodos subir y bajar volumen, los cuales seran
 * implementados en las clases que deseen implementarlo.
 */
public interface Volumen {

	/**
	 * Creamos la función subirVolumen que se encarga de subir el volumen de aquel
	 * mando que lo implemente.
	 */
	public void subirVolumen();

	/**
	 * Creamos la función bajarVolumen que se encagar de bajar el volumen de aquel
	 * mando que lo implemente.
	 */
	public void bajarVolumen();
}
