package examenmandos;

/**
 * Esta clase hereda los atributos de la clase padre MandoDistancia e implementa
 * las funciones de la interfaz Velocidad. Esta misma clase implementa todos los
 * atributos y funciones necesarias para crear un mando a distancia para un aire
 * acondicionado.
 */
public class MandoAireAcondicionado extends MandoDistancia implements Velocidad {
	/**
	 * Creamos un enumerado Modo para indicar los modos de un aire acondiconado,
	 * FRIO O CALOR.
	 */
	enum Modo {
		FRIO, CALOR
	}

	/**
	 * Creamos la variable temperatura como int para almacenar la temperatura del
	 * aire acondicionado.
	 */
	private int temperatura = 24;

	/**
	 * Creamos la variable velocidad como int para almacenar la velocidad de un aire
	 * acondiconado.
	 */
	private int velocidad = 0;

	/**
	 * Creamos el atributo modo como Modo para indicar el modo en el que se
	 * encuentra el aire acondicionado, por defecto en FRIO.
	 */
	private Modo modo = Modo.FRIO;

	/**
	 * Creamos un constructor con todos los atributos de la clase padre
	 * (MandoDistancia) y con los de la clase actual (MandoAireAcondicionado).
	 * 
	 * @param modelo    El modelo de un mando de aire acondicionado.
	 * @param anchura   La anchura de un mando de aire acondicionado.
	 * @param altura    La altura de un mando de aire acondicionado.
	 * @param precio    El precio de un mando de aire acondicionado.
	 * @param encendido El botón que nos indica si esta encendido o apagado el mando
	 *                  a distancia.
	 * @throws PrecioException 
	 * @throws ModeloException 
	 */
	public MandoAireAcondicionado(String modelo, double anchura, double altura, double precio) throws ModeloException, PrecioException {
		super(modelo, anchura, altura, precio);
	}

	/**
	 * Esta función se encarga de modificar la temperatura del aire acondicionado
	 * por la temperatura pasada como parametro.
	 * 
	 * @param temperatura La nueva temperatura.
	 */
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	/**
	 * Esta función se encarga de modificar el modo del aire acondicioando por el
	 * modo pasado como parametro.
	 * 
	 * @param modo El nuevo modo.
	 */
	public void setModo(String modo) {
		comprubaModo(null);
	}

	/**
	 * Esta función se encarga de comprobar si el modo pasado como parametro es
	 * valido o no.
	 * 
	 * @param modo El modo pasado como parametro.
	 */
	public void comprubaModo(String modo) {
		switch (modo) {
		case "CALOR" -> {
			this.modo = Modo.valueOf(modo);
		}
		}
	}

	/**
	 * Esta función se encarga de subir la velocidad de un aire acondicionado de 1
	 * en 1 y para ello comprueba si la suma de la velocidad mas 1 no es superior a
	 * 5.
	 */
	public void subirVelocidad() {
		if ((this.velocidad + 1) <= 5) {
			this.velocidad += 1;
		}
	}

	/**
	 * Esa función se encarga de bajar la velocidad de un aire acondicionado de 1 en
	 * 1 y para ello comprueba si la resta de la velocidad menos 1 no es menor que
	 * 0.
	 */
	public void bajarVelocidad() {
		if ((this.velocidad - 1) >= 0) {
			this.velocidad -= 1;
		}
	}

	/**
	 * Esta función almacena en una variable la información de la superclase y
	 * concatena la información de la clase actual (MandoAireAcondicionado).
	 * 
	 * @return Toda la información de la clase padre y de la actual.
	 */
	@Override
	public String toString() {
		String infoMD = super.toString();

		infoMD += "Temperatura: " + this.temperatura + "\n";
		infoMD += "Velocidad: " + this.velocidad + "\n";
		infoMD += "Modo: " + this.modo + "\n";

		return infoMD;
	}
}
