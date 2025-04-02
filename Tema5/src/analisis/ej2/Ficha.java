package analisis.ej2;

public abstract class Ficha implements Comparable<Ficha> {
	/**
	 * Creamos el atributo id como int para almacenar el número de identidicación.
	 */
	private int id;

	/**
	 * Creamos el atributo titulo como String para almacenar el titulo.
	 */
	private String titulo;

	/**
	 * Creamos un constructor con todos los atributos de la clase Ficha.
	 * 
	 * @param id     El id de algun objeto de la biblioteca.
	 * @param titulo El titulo de algun objeto de la biblioteca.
	 */
	public Ficha(int id, String titulo) {
		if (id >= 0) {
			this.id = id;
		}

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	}

	/**
	 * Esta función se encarga de devolver el titulo de un objeto de la biblioteca .
	 * 
	 * @return El titulo.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Esta función solo se declara y de desarrollara en cada subclase (hija) que la
	 * implemente. Se encarga de devovolver los dias que se pueden prestar los
	 * distintos objetos de la biblioteca.
	 * 
	 * @return Los dias de prestado de cada objeto de la biblioteca.
	 */
	public abstract int tiempoPrestamo();
	
	/**
	 * Compara esta ficha con otra para definir un orden natural.
	 * 
	 * @param otra La otra ficha a comparar.
	 * @return Un número negativo si esta ficha tiene un ID menor,
	 *         un número positivo si esta ficha tiene un ID mayor,
	 *         o 0 si son iguales.
	 */
	@Override
	public int compareTo(Ficha f) {
		return this.id - f.id;
	}

}
