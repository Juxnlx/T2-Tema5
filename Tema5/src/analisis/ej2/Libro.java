package analisis.ej2;

public class Libro extends Ficha {

	/**
	 * Creamos el atributo autor como String para almacenar el nombre del autor del
	 * libro.
	 */
	private String autor;

	/**
	 * Creamos el atributo editorial como String para almacenar la editorias del
	 * libro.
	 */
	private String editorial;

	/**
	 * Creamos este constructor con los atributos de la clase padre (Ficha) y con
	 * los de la subclase (Libro).
	 * 
	 * @param id        El id del libro.
	 * @param titulo    El titulo del libro.
	 * @param autor     El autor del libro
	 * @param editorial La editorial del libro.
	 */
	public Libro(int id, String titulo, String autor, String editorial) {
		super(id, titulo);

		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		if (editorial != null && !editorial.isBlank()) {
			this.editorial = editorial;
		}
	}

	/**
	 * Esta función se encarga de devolver los dias de prestamo que tienen los
	 * libros.
	 * 
	 * @return 15 dias en el caso de los libros.
	 */
	@Override
	public int tiempoPrestamo() {
		return 15;
	}

}
