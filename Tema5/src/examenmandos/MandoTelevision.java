package examenmandos;

/**
 * Esta clase hereda los atributos de la clase padre MandoDistancia e implementa
 * las funciones de la interfaz Volumen. Esta misma clase implementa todos los
 * atributos y funciones necesarias para crear un mando a distancia para una
 * televesión.
 */
public class MandoTelevision extends MandoDistancia implements Volumen {

	/**
	 * Creamos el atributo volumen como int para almacenar el volumen en el que se
	 * encuentra el mando de nuestra televisión.
	 */
	private int volumen;

	/**
	 * Creamos el atributo canal como int para almacenar el canal en el que se
	 * encuentra el mando de nuestra televisión.
	 */
	private int canal;

	/**
	 * Creamos un constructor con todos los atributos de la clase padre
	 * (MandoDistancia) y con los de la clase actual (MandoTelevisión).
	 * 
	 * @param modelo    El modelo de un mando de televisión.
	 * @param anchura   La anchura de un mando de televisión.
	 * @param altura    La altura de un mando de televisión.
	 * @param precio    El precio de un mando de televisión.
	 * @param encendido El botón que nos indica si esta encendido o apagado el mando
	 *                  a distancia.
	 * @param volumen   El volumen de un mando de televisión.
	 * @param canal     El canal de un mando de televisión.
	 * @throws PrecioException 
	 * @throws ModeloException 
	 */
	public MandoTelevision(String modelo, double anchura, double altura, double precio, int volumen,
			int canal) throws ModeloException, PrecioException {
		super(modelo, anchura, altura, precio);

		if (volumen > 0) {
			this.volumen = volumen;
		}

		if (canal > 0 && canal <= 100) {
			this.canal = canal;
		}
	}
	
	public void setCanal(int canal) {
		if (canal > 0 && canal <= 100) {
			this.canal = canal;
		}
	}

	/**
	 * Esta función se encarga de subir el volumen de una televisión de 5 en 5 y
	 * para ello comprueba si la suma del volumen mas 5 no es superior a 100.
	 */
	public void subirVolumen() {
		if ((this.volumen + 5) <= 100) {
			this.volumen += 5;
		}
	}

	/**
	 * Esa función se encarga de bajar el volumen de una televisión de 5 en 5 y para
	 * ello comprueba si la resta del volumen menos 5 no es menor que 0.
	 */
	public void bajarVolumen() {
		if ((this.volumen - 5) >= 0) {
			this.volumen -= 5;
		}
	}

	/**
	 * Esta función almacena en una variable la información de la superclase y
	 * concatena la información de la clase actual (MandoTelevision).
	 * 
	 * @return Toda la información de la clase padre y de la actual.
	 */
	@Override
	public String toString() {
		String infoMD = super.toString();

		infoMD += "Volumen: " + this.volumen + "\n";
		infoMD += "Canal: " + this.canal + "\n";

		return infoMD;
	}
}
