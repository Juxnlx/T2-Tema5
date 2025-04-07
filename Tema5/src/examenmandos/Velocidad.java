package examenmandos;

/**
 * Creamos la interfaz velocidad para crear la función subir y bajar velocidad,
 * que seran implementadas en la clase MandoAireAcondicionado y MandoAspiradora.
 */
public interface Velocidad {
	/**
	 * Creamos la función subirVelocidad que se encarga de subir la velocidad de
	 * aquel mando que lo implemente.
	 */
	public void subirVelocidad();

	/**
	 * Creamos la función bajarVelocidad que se encagar de bajar la velocidad de aquel
	 * mando que lo implemente.
	 */
	public void bajarVelocidad();
}
