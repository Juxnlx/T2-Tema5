package analisis.ej2;

public class DVD extends Ficha {

	/**
	 * Creamos el enumerado TipoDVD para almacenar los distintos tipos de DVD
	 * existentes en la biblioteca.
	 */
	enum TiposDVD {
		PELICULA, DOCUMENTAL, SERIE
	}

	/**
	 * Creamos el atributo director como String para almacenar el director del DVD.
	 */
	private String director;

	/**
	 * Creamos el atributo year como int para almacenar el año de publicación del
	 * DVD.
	 */
	private int year;

	/**
	 * Creamos el atributo tipoDVD como TipoDVD para almacenar el tipo de DVD.
	 */
	private TiposDVD tipoDVD;

	/**
	 * /** Creamos este constructor con los atributos de la clase padre (Ficha) y los
	 * atributos propios de la clase (DVD).
	 * 
	 * @param id       El id del DVD.
	 * @param titulo   El titulo del DVD.
	 * @param director El director del DVD.
	 * @param year     El año de publicación del DVD.
	 * @param tipoDVD  El tipo del DVD
	 */
	public DVD(int id, String titulo, String director, int year, String tipoDVD) {
		super(id, titulo);

		if (director != null && !director.isBlank()) {
			this.director = director;
		}
		if (year > 0) {
			this.year = year;
		}
		if (tipoDVD != null) {
			comprobarTipoDVD(tipoDVD);
		}
	}

	/**
	 * Esta función se encarga de devolver el director del DVD.
	 * 
	 * @return El director del DVD.
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * Esta función se encarga de devolver el año de publicación del DVD.
	 * 
	 * @return El año de publicación del DVD.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Esta función se encarga de devolver el tipo de DVD seleccionado.
	 * 
	 * @return El tipo de DVD seleecionado.
	 */
	public TiposDVD getTipoDVD() {
		return tipoDVD;
	}

	/**
	 * Esta función se encarga de comprobar si el tipo de DVD introducido por el
	 * usuario se encuentra en el enumerado.
	 * 
	 * @param tipoDVD El tipo de DVD introducido por el usuario.
	 */
	public void comprobarTipoDVD(String tipoDVD) {
		switch (tipoDVD) {
		case "PELICULA", "DOCUMENTAL", "SERIE" -> {
			this.tipoDVD = TiposDVD.valueOf(tipoDVD);
		}
		}
	}

	/**
	 * Esta función se encarga de devolver los dias de prestamo que tienen los DVD.
	 * 
	 * @return 5 dias en el caso de los DVD.
	 */
	@Override
	public int tiempoPrestamo() {
		return 5;
	}
}
