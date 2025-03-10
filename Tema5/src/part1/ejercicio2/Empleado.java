package part1.ejercicio2;

public class Empleado {

	/**
	 * Creamos el atributo nombre como String para almacenar el nombre del empleado.
	 */
	private String nombre;

	/**
	 * Creamos un constructor con el parametro de entrada nombre.
	 * 
	 * @param nombre El nombre del empleado.
	 */
	public Empleado(String nombre) {
		// Comprobamos si el nombre es distinto de null y si no se encuentra vacio ni
		// con espacios en blanco.
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Esta función se encarga de devolver el nombre del empleado.
	 * 
	 * @return El nombre del empleado.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Esta función se encarga de modificar el nombre del empleado.
	 * 
	 * @param nombre El nuevo nombre con el que vamos a modificar el empleado.
	 */
	public void setNombre(String nombre) {
		// Comprobamos si el nombre es distinto de null y si no se encuentra vacio ni
		// con espacios en blanco.
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Esta función se encarga de almacenar en una variable los datos de un
	 * empleado.
	 * 
	 * @return La cadena con los datos del empleado.F
	 */
	@Override
	public String toString() {
		// Creamos la variable solEmpleado como String para almacenar como mostrar los
		// datos del empleado.
		String solEmpleado = "";

		solEmpleado += "Empleado " + this.nombre;

		// Devolvemos la cadena solEmpleado.
		return solEmpleado;
	}

}
