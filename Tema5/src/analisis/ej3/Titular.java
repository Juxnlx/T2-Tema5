package analisis.ej3;

public class Titular implements Comparable<Titular> {
	/**
	 * Creamos el atributo DNI como String para almacenar el DNI del titular de una
	 * cuenta.
	 */
	private String DNI;

	/**
	 * Creamos el atributo nombre como String para almacenar el nombre del titular
	 * de una cuenta.
	 */
	private String nombre;

	/**
	 * Creamos el atributo apellidos como String para almacenar los apellidos del
	 * titular de una cuenta.
	 */
	private String apellidos;

	/**
	 * Creamos el atributo telefono como int para almacenar el número de telefono
	 * del titular de una cuenta.
	 */
	private int telefono;

	/**
	 * Creamos un constructor con todos atributos de de la clase actual (Titular).
	 * 
	 * @param DNI       El DNI del titular.
	 * @param nombre    El nombre del titular.
	 * @param apellidos Los apellidos del titular.
	 * @param numero    El número de telefono del titular.
	 */
	public Titular(String DNI, String nombre, String apellidos, int telefono) {
		if (DNI != null && !DNI.isBlank()) {
			this.DNI = DNI;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
		if (telefono >= 100000000 && telefono <= 999999999) {
			this.telefono = telefono;
		}
	}

	/**
	 * Esta función se encarga de devolver el DNI del titular de una cuenta.
	 * 
	 * @return El DNI del titular.
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * Esta función se encarga de devolver el nombre del titular de una cuenta.
	 * 
	 * @return El nombre del titular.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Esta función se encarga de devolver los apellidos del titular de una cuenta.
	 * 
	 * @return Los apellidos del titular.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Esta función se encarga de devolver el número de telefono del titular de una
	 * cuenta.
	 * 
	 * @return El número de telefono del titular.
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * Esta función se encarga de comparar los dni del titualar actual y el pasado
	 * como parametro para saber si dos objetos son iguales o no.
	 * 
	 * @return true si tienen el mismo dni, false si no lo tienen.
	 */
	@Override
	public boolean equals(Object obj) {
		boolean sol = false;

		Titular t = (Titular) obj;

		if (this.DNI.equals(t.DNI)) {
			sol = true;
		}

		return sol;
	}

	/**
	 * Esta función se encarga de almacenar en la variable toString toda la
	 * información que queramos mostrar del Titular.
	 */
	@Override
	public String toString() {
		String infoTitular;

		infoTitular = "DNI: " + this.DNI + " - Nombre y Apellidos: " + this.nombre + " " + this.apellidos
				+ " - Teléfono: " + this.telefono;

		return infoTitular;
	}

	/**
	 * Compara el dni actual con el del otro titular para establecer un orden ascendente.
	 * 
	 * @param otra El otro titular.
	 * @return Un número negativo si este titular tiene un DNI menor, un número
	 *         positivo si este titular tiene un DNI mayor, o 0 si son iguales.
	 */
	@Override
	public int compareTo(Titular t) {
		return this.DNI.compareTo(t.DNI);
	}

}
