package examenmandos;

/**
 * Esta clase hereda los atributos de la clase padre MandoDistancia e implementa
 * las funciones de la interfaz Velocidad. Esta misma clase implementa todos los
 * atributos y funciones necesarias para crear un mando a distancia para una
 * aspiradora.
 */
public class MandoAspiradora extends MandoDistancia implements Velocidad {
	/**
	 * Creamos el aributo velocidad como int para alamcenar la velocidad que puede
	 * alcanzar una aspiradora.
	 */
	private int velocidad;

	/**
	 * Creamos un constructor con todos los atributos de la clase padre
	 * (MandoDistancia) y con los de la clase actual (MandoAspiradora).
	 * 
	 * @param modelo    El modelo de un mando de aspiradora.
	 * @param anchura   La anchura de un mando de aspiradora.
	 * @param altura    La altura de un mando de aspiradora.
	 * @param precio    El precio de un mando de aspiradora.
	 * @param encendido El botón que nos indica si esta encendido o apagado el mando
	 *                  a distancia.
	 * @param velocidad El volumen de un mando de aspiradora.
	 * @throws PrecioException 
	 * @throws ModeloException 
	 */
	public MandoAspiradora(String modelo, double anchura, double altura, double precio, int velocidad) throws ModeloException, PrecioException {
		super(modelo, anchura, altura, precio);

		if (velocidad >= 1 && velocidad <= 3) {
			this.velocidad = velocidad;
		}
	}

	/**
	 * Esta función se encarga de subir la velocidad de una aspiradora de 1 en 1 y
	 * para ello comprueba si la suma de la velocidad mas 1 no es superior a 3.
	 */
	public void subirVelocidad() {
		if ((this.velocidad + 1) <= 3) {
			this.velocidad += 1;
		}
	}

	/**
	 * Esa función se encarga de bajar la velocidad de una aspiradora de 1 en 1 y
	 * para ello comprueba si la resta de la velocidad menos 1 no es menor que 0.
	 */
	public void bajarVelocidad() {
		if ((this.velocidad - 1) >= 0) {
			this.velocidad -= 1;
		}
	}

	/**
	 * Esta función almacena en una variable la información de la superclase y
	 * concatena la información de la clase actual (MandoAspiradora).
	 * 
	 * @return Toda la información de la clase padre y de la actual.
	 */
	@Override
	public String toString() {
		String infoMD = super.toString();

		infoMD += "Velocidad: " + this.velocidad + "\n";

		return infoMD;
	}
}
