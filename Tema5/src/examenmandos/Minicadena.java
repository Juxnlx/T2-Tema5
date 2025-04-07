package examenmandos;

/**
 * Esta clase hereda los atributos de la clase padre MandoDistancia e implementa
 * las funciones de la interfaz Volumen. Esta misma clase implementa todos los
 * atributos y funciones necesarias para crear una minicadena.
 */
public class Minicadena extends MandoDistancia implements Volumen {
	/**
	 * Creamos el atributo volumen como int para almacenar el volumen en el que se
	 * encuentra la minicadena.
	 */
	private int volumen;

	/**
	 * Creamos un constructor con todos los atributos de la clase padre
	 * (MandoDistancia) y con los de la clase actual (Minicadena).
	 * 
	 * @param modelo    El modelo de una minicadena.
	 * @param anchura   La anchura de una minicadena.
	 * @param altura    La altura de una minicadena.
	 * @param precio    El precio de una minicadena.
	 * @param encendido El botón que nos indica si esta encendido o apagado la
	 *                  minicadena.
	 * @param volumen   El volumen de una minicadena.
	 */
	public Minicadena(String modelo, double anchura, double altura, double precio, int volumen) {
		super(modelo, anchura, altura, precio);

		if (volumen > 0) {
			this.volumen = volumen;
		}
	}

	/**
	 * Esta función se encarga de subir el volumen de una minicadena de 10 en 10 y
	 * para ello comprueba si la suma del volumen mas 10 no es superior a 100.
	 */
	public void subirVolumen() {
		if ((this.volumen + 10) <= 100) {
			this.volumen += 10;
		}
	}

	/**
	 * Esa función se encarga de bajar el volumen de una minicadena de 10 en 10 y
	 * para ello comprueba si la resta del volumen menos 10 no es menor que 0.
	 */
	public void bajarVolumen() {
		if ((this.volumen - 10) >= 0) {
			this.volumen -= 10;
		}
	}

	/**
	 * Esta función almacena en una variable la información de la superclase y
	 * concatena la información de la clase actual (Minicadena).
	 * 
	 * @return Toda la información de la clase padre y de la actual.
	 */
	@Override
	public String toString() {
		String infoMD = super.toString();

		infoMD += "Volumen: " + this.volumen + "\n";

		return infoMD;
	}
}
