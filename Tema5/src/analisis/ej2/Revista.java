package analisis.ej2;

public class Revista extends Ficha {

	/**
	 * Creamos el atributo numRevista como int para almacenar el número de una
	 * revista.
	 */
	private int numRevista;

	/**
	 * Creamos el atributo yearPublicacion como int para almacenar el año de
	 * publicación de una revista.
	 */
	private int yearPublicacion;

	/**
	 * Creamos este constructor con los atributos de la clase padre (Ficha) y los
	 * atributos propios de la clase (Revista).
	 * 
	 * @param id              El id de la revista.
	 * @param titulo          El titulo de la revista.
	 * @param numRevista      El número de la revista.
	 * @param yearPublicacion El año de publicación de la revista.
	 */
	public Revista(int id, String titulo, int numRevista, int yearPublicacion) {
		super(id, titulo);

		if (numRevista > 0) {
			this.numRevista = numRevista;
		}

		if (yearPublicacion > 0) {
			this.yearPublicacion = yearPublicacion;
		}
	}

	/**
	 * Esta función se encarga de devolver el número de la revista.
	 * 
	 * @return El número de la revista.
	 */
	public int getNumRevista() {
		return numRevista;
	}

	/**
	 * Esta función se encarga de devolver el año en el que se publico dicha
	 * revista.
	 * 
	 * @return El año de publicación de la revista.
	 */
	public int getYearPublicacion() {
		return yearPublicacion;
	}

	/**
	 * Esta función se encarga de devolver los dias de prestamo que tienen las
	 * revistas.
	 * 
	 * @return 10 dias en el caso de las revistas.
	 */
	@Override
	public int tiempoPrestamo() {
		return 10;
	}

}
