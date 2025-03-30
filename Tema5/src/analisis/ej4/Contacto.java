package analisis.ej4;

public class Contacto {
	/**
	 * Creamos el atributo nombre como String para almacenar el nombre del contacto.
	 */
	private String nombre;

	/**
	 * Creamos el atributo telefono como int para almacenar el número de teléfono
	 * del contacto.
	 */
	private int telefono;

	/**
	 * Creamos el constructor con todos los atributos de la clase actual (Contacto).
	 * 
	 * @param nombre   El nombre del contacto.
	 * @param telefono El número de teléfono del contacto.
	 */
	public Contacto(String nombre, int telefono) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (telefono >= 100000000 && telefono <= 999999999) {
			this.telefono = telefono;
		}
	}

	/**
	 * Esta función se encarga de devolver el nombre del contacto.
	 * 
	 * @return EL nombre del contacto.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Esta función se encarga de modificar el nombre del contacto por el nuevo
	 * pasado como parametro.
	 * 
	 * @param nombre El nuevo nombre de contacto.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Esta función se encarga de devolver el número de teléfono del contacto.
	 * 
	 * @return EL número de teléfono del contacto.
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * Esta función se encarga de modificar el número de teléfono por el nuevo
	 * pasado por parametro.
	 * 
	 * @param telefono EL nuevo número de teléfono.
	 */
	public void setTelefono(int telefono) {
		if (telefono >= 100000000 && telefono <= 999999999) {
			this.telefono = telefono;
		}
	}

	/**
	 * Esta función se encarga de comprobar si el contacto actual y el pasado como
	 * parametro son iguales mediante el nombre.
	 * 
	 * @param Un objeto de la clase Object
	 * @return true si los nombres coinciden, false en caso contrario.
	 */
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		Contacto contacto = (Contacto) obj;

		if (this.nombre.equals(contacto.nombre)) {
			sonIguales = true;
		}

		return sonIguales;
	}

	/**
	 * Esta función se encarga de almacenar en una variable de tipo String todo la
	 * información que queremos mostrar del contacto.
	 * 
	 * @return La variable donde almacenamos toda la información del contacto.
	 */
	@Override
	public String toString() {
		String infoContacto;

		infoContacto = "Nombre: " + this.nombre + " - Teléfono: " + this.telefono;

		return infoContacto;
	}
}
