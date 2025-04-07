package examenmandos;

/**
 * La clase MandoDistancia es la que regula la información comun a los restos de
 * mandos concretos.
 */
public class MandoDistancia implements Comparable<MandoDistancia> {
	/**
	 * Creamos el atributo modelo como String para almacenar el modelo de un mando a
	 * distancia concreto.
	 */
	private String modelo;

	/**
	 * Creamos el atributo anchura como double para almacenar la anchura de un mando
	 * a distancia.
	 */
	private double anchura;

	/**
	 * Creamos el atributo altura como double para almacenar la altura de un mando a
	 * distancia.
	 */
	private double altura;

	/**
	 * Creamos el atributo precio como double para almacenar cual es el valor del
	 * mando a distancia.
	 */
	private double precio;

	/**
	 * Creamos el atributo encendido como boolean para saber cuando el mando esta
	 * encendido o apagado mediante true o false.
	 */
	private boolean encendido = false;

	/**
	 * Creamos un contructor con solo el modelo ya que es el atributo identificativo
	 * de un mando y puede que se utilize para realizar alguna busqueda.
	 * 
	 * @param modelo El modelo de un mando a distancia.
	 */
	public MandoDistancia(String modelo) {
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
	}

	/**
	 * Creamos un constructor con todos los atributos de la clase.
	 * 
	 * @param modelo    El modelo del mando a distancia.
	 * @param anchura   La anchura del mando a distancia.
	 * @param altura    La altura del mando a distancia.
	 * @param precio    El precio del mando a distancia.
	 * @param encendido El botón que nos indica si esta encendido o apagado el mando
	 *                  a distancia.
	 */
	public MandoDistancia(String modelo, double anchura, double altura, double precio, boolean encendido) {
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}

		if (anchura > 0) {
			this.anchura = anchura;
		}

		if (altura > 0) {
			this.altura = altura;
		}

		if (precio > 0) {
			this.precio = precio;
		}

		this.encendido = encendido;
	}

	/**
	 * Esta función se encarga de modificar el atributo encendido, en este caso lo
	 * pone a true para indicar que el mando esta encendido.
	 */
	public void encenderMando() {
		this.encendido = true;
	}

	/**
	 * Esta función se encarga de modificar el atributo encendido, en este caso lo
	 * pone a false para indicar que el mando esta apagado.
	 */
	public void apagarMando() {
		this.encendido = false;
	}

	/**
	 * Esta función se encarga de comparar dos modelos de distintos mandos a
	 * distancia y nos devuelve un valor entero indicadonos si el mayor, menor o
	 * igual alfabeticamente.
	 * 
	 * @return si el modelo actual va antes se devuelve un negativo, en caso
	 *         contrario un positivo y si son iguales 0.
	 */
	@Override
	public int compareTo(MandoDistancia m) {
		return this.modelo.compareTo(m.modelo);
	}

	/**
	 * Esta función se encarga de almacenar en una variable de tipo cadena todo la
	 * información del mando a distancia.
	 * 
	 * @return Toda la información del mando a distancia.
	 */
	@Override
	public String toString() {
		String infoMD;

		infoMD = "Modelo: " + this.modelo + "\n";
		infoMD += "Anchura: " + this.anchura + "\n";
		infoMD += "Altura: " + this.altura + "\n";
		infoMD += "Precio: " + this.precio + "\n";
		infoMD += "Encendido: " + this.encendido + "\n";

		return infoMD;
	}
}
