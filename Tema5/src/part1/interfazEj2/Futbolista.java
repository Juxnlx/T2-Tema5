package part1.interfazEj2;

public class Futbolista implements Comparable<Futbolista> {

	/**
	 * Creamos el atributo numCamiseta como int para almacenar el número de la
	 * camiseta de un futbolista.
	 */
	private int numCamiseta;

	/**
	 * Creamos el atributo nombre como String para almacenar el nombre del
	 * futbolista.
	 */
	private String nombre;

	/**
	 * Creamos el atributo edad como int para almacenar la edad del futbolista.
	 */
	private int edad;

	/**
	 * Creamos el atributo numGoles como int para almacenar el número de goles
	 * goleados por el futbolista.
	 */
	private int numGoles;

	/**
	 * Creamos un constructor con todos los atributos de la clase Futbolista.
	 * 
	 * @param numCamiseta El número de la camiseta del futbolista.
	 * @param nombre      El nombre del futbolista.
	 * @param edad        La edad del futbolista.
	 * @param numGoles    El número de goles goleado por el futbolista.
	 */
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		// Comprobamos si el número de la camiseta es positivo.
		if (numCamiseta >= 0) {
			this.numCamiseta = numCamiseta;
		}

		// Comprobamos si el nombre del futbolista no es nulo ni tiene espacios en
		// blanco.
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		// Comprobamos si la edad del futbolista es mayor que 0.
		if (edad > 0) {
			this.edad = edad;
		}

		// Comprobamos si el número de goles es mayor o igual 0.
		if (numGoles >= 0) {
			this.numGoles = numGoles;
		}
	}

	/**
	 * Esta función se encarga de almacenar en una variable de tipo String toda la
	 * información del futbolista.
	 * 
	 * @return La variable con toda la información de futbolista.
	 */
	@Override
	public String toString() {
		// Creamos la variable infoFutbolista como String para almacenar toda la
		// información
		// del futbolista.
		String infoFutbolista;

		// Almacenamos toda la información en infoFutbolista.
		infoFutbolista = "Número de camiseta: " + this.numCamiseta + "\n";
		infoFutbolista += "Nombre: " + this.nombre + "\n";
		infoFutbolista += "Edad: " + this.edad + "\n";
		infoFutbolista += "Número de goles: " + this.numGoles + "\n";

		// Devolvemos la información del futbolista (infoFutbolista).
		return infoFutbolista;
	}

	/**
	 * Esta función se encarga de comparar si el número de la camiseta y el nombre
	 * de este objeto y el pasado como parametro son iguales.
	 * 
	 * @return true si son iguales, false si no son iguales.
	 */
	@Override
	public boolean equals(Object obj) {
		// Creamos la variable sonIguales como boolean para indicar como valor booleano
		// si dos objetos son iguales o no.
		boolean sonIguales = false;

		// Hacemos un casteo a Futbolista de obj.
		Futbolista futb = (Futbolista) obj;

		// Comprobamos si el número de la camiseta y el nombre coinciden entre los dos
		// objetos.
		if ((this.numCamiseta == futb.numCamiseta) && (this.nombre.equals(futb.nombre))) {
			sonIguales = true;
		}

		// Devolvemos la variable sonIguales que nos indicará si son iguales o no.
		return sonIguales;
	}

	/**
	 * Esta función se encarga de comparar los dos objetos de tipo futbolista, este
	 * y el pasado como parametro y nos devuelve un valor númerico indicando cual es
	 * mayor.
	 * 
	 * @param El futbolista pasado como parametro que compararemos con este
	 *           futbolista.
	 * @return 0 si los futbolistas son iguales. >0 si este futbolista es mayor que
	 *         el otro. <= si este futbolista es menor que el otro.
	 */
	@Override
	public int compareTo(Futbolista f) {
		int res = this.numCamiseta - f.numCamiseta;

		if (this.numCamiseta == f.numCamiseta) {
			res = this.nombre.compareTo(f.nombre);
		}
		return res;
	}

}
