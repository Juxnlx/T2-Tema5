package interfaz.ej1;

public class Socio implements Comparable<Socio> {

	/**
	 * Creamos el atributo id como int para almacenar el número identificativo del
	 * socio.
	 */
	private int id;

	/**
	 * Creamos el atributo nombre como String para almacenar el nombre del socio.
	 */
	private String nombre;

	/**
	 * Creamos el atributo edad como int para almacenar la edad del socio.
	 */
	private int edad;

	/**
	 * Creamos un constructor con todos los atributos de la clase Socio.
	 * 
	 * @param id     El numero de identidicación del socio
	 * @param nombre El nombre del socio
	 * @param edad   La edad del socio.
	 */
	public Socio(int id, String nombre, int edad) {
		// Comprobamos si el id es mayor o igual a 0.
		if (id >= 0) {
			this.id = id;
		}

		// Comprobamos que el nombre no este a null y tampoco tenga espacios en blanco.
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		// Comprobamos que la edad sea mayor o igual a 0.
		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Esta función se encarga de devolver el nombre del socio.
	 * 
	 * @return El nombre del socio.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Esta función se encarga de devolver la edad del socio.
	 * 
	 * @return La edad del socio.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Esta función se encarga de almacenar en una variable de tipo String toda la
	 * información del Socio.
	 * 
	 * @return La variable con toda la información de socio.
	 */
	@Override
	public String toString() {
		// Creamos la variable infoSocio como String para almacenar toda la información
		// del socio.
		String infoSocio;

		// Almacenamos toda la información en infoSocio.
		infoSocio = "ID: " + this.id + "\n";
		infoSocio += "Nombre: " + this.nombre + "\n";
		infoSocio += "Edad: " + this.edad + "\n";

		// Devolvemos la información del socio (infoSocio).
		return infoSocio;
	}

	/**
	 * Esta función se encarga de comparar los dos objetos de tipo socio, este y el
	 * pasado como parametro y nos devuelve un valor númerico indicando cual es
	 * mayor.
	 * 
	 * @param El socio pasado como parametro que compararemos con este socio.
	 * @return 0 si los socios son iguales. >0 si este socio es mayor que le otro.
	 *         <= si este socio es menor que el otro.
	 */
	@Override
	public int compareTo(Socio o) {
		// Devolvemos la diferencia entre la edad de este socio con el pasado como
		// parametro.
		return (this.id - o.id);
	}

}
